package main.java.unifr.tandem.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.unifr.tandem.domain.User;
import main.java.unifr.tandem.service.UserService;
import main.java.unifr.tandem.utils.ApplicationContextProvider;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Java file for the action index
 */
public class Authentication extends ActionSupport{
    private static final long serialVersionUID = 1L;

    private User userBean;


    @Override
    public String execute() throws Exception {

        ApplicationContext ctx = ApplicationContextProvider.getApplicationContext();
        UserService userService = (UserService)ctx.getBean("userService");
        User user = userService.getUser(userBean.getUsername(), userBean.getPassword());

        //add user to session
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession(true);
        session.setAttribute("user", user);

        userBean = user;

        if(user != null)
            return SUCCESS;
        else
            return ERROR;
    }

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User user) {
        userBean = user;
    }

    @Override
    public void validate() {

        if (userBean.getUsername().length() == 0) {
            addFieldError("personBean.username", "Username is required.");
        }

        if (userBean.getPassword().length() == 0) {
            addFieldError("personBean.password", "Password is required.");
        }
    }
}
