package main.java.unifr.tandem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.MediaType;

import main.java.unifr.tandem.domain.User;
import main.java.unifr.tandem.service.UserService;
import main.java.unifr.tandem.utils.ApplicationContextProvider;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * Java file for the action register
 */
public class Register extends ActionSupport {
    private static Logger logger = Logger.getLogger(Register.class);

    private static final long serialVersionUID = 1L;

    private User userBean;


    @Override
    public String execute() throws Exception {

        //call Service class to store userBean's state with RESTWS

        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource service = client.resource(CyberCoach.BASE_URI);
        userBean.setPublicvisible("2");
        userBean.setUri(CyberCoach.REL_PATH + CyberCoach.RES_USERS + "/" + userBean.getUsername() + "/");

        try {
            service.
                    path(CyberCoach.RES_USERS).
                    path(userBean.getUsername()).
                    accept(MediaType.APPLICATION_XML).      // set response content type
                    type(MediaType.APPLICATION_XML).        // set request content type
                    put(User.class, userBean);
        } catch (Exception e) {
            logger.error("Can't put user in Cyber Coach");
            //return ERROR;
        }

        //add user to local db
        ApplicationContext ctx = ApplicationContextProvider.getApplicationContext();
        UserService userService = (UserService)ctx.getBean("userService");
        int inserted = userService.addUser(userBean);
//        if (inserted == 0) {
//        	addActionError("User already exists!");
//        	return ERROR;
//        } 
        
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession(true);
        session.setAttribute("user", userBean);

        logger.debug("New user registered: " + userBean.getEmail());

        return SUCCESS;
    }

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User user) {
        userBean = user;
    }


    @Override
    public void validate() {

        if (userBean.getRealname().length() == 0) {
            addFieldError("userBean.realname", "Full name is required.");
        }

        if (userBean.getUsername().length() == 0) {
            addFieldError("userBean.username", "First name is required.");
        }

        if (userBean.getEmail().length() == 0) {
            addFieldError("userBean.email", "Email is required.");
        }

        if (userBean.getPassword().length() == 0) {
            addFieldError("userBean.password", "Password is required");
        }
        if (userBean.getRealname().length() > 0 && userBean.getUsername().length() > 0 && userBean.getPassword().length() > 0) {
        	 ApplicationContext ctx = ApplicationContextProvider.getApplicationContext();
             UserService userService = (UserService)ctx.getBean("userService");
             boolean found = userService.findUser(userBean.getUsername());
             System.out.println("Found: "+ found);
             if (found == true) {
            	 System.out.println("User already exists");
            	 addActionError("User already exists");
             } 
        }
        System.out.println(userBean.toString());
        System.out.println("in validate");

    }

}
