package main.java.unifr.tandem.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.unifr.tandem.domain.User;
import main.java.unifr.tandem.domain.UserPref;
import main.java.unifr.tandem.service.UserService;
import main.java.unifr.tandem.utils.ApplicationContextProvider;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Java file for action makeRequest
 * Description: Updates the user preferences
 */
public class MakeRequest extends ActionSupport {
    private static Logger logger = Logger.getLogger(MakeRequest.class);

    private UserPref userPref;
    private User userBean;

    @Override
    public String execute() throws Exception {

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession(true);
        User userBean = (User)session.getAttribute("user");
        userPref.setUsername(userBean.getUsername());

        ApplicationContext ctx = ApplicationContextProvider.getApplicationContext();
        UserService userService = (UserService)ctx.getBean("userService");
        userService.addUserPref(userPref);

        logger.error("User pref:" + userBean.getUsername() + userPref.getCity() + userPref.getSport() + userPref.getSportLevel());

        return SUCCESS;
    }

    public UserPref getUserPref() {
        return userPref;
    }

    public void setUserPref(UserPref userPref) {
        this.userPref = userPref;
    }

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }
}
