package main.java.unifr.tandem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import main.java.unifr.tandem.domain.User;
import main.java.unifr.tandem.service.UserService;
import main.java.unifr.tandem.utils.ApplicationContextProvider;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Java file for action makeFriend
 */
public class MakeFriend extends ActionSupport {

    private User userBean;

    @Override
    public String execute() throws Exception {

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession(true);
        userBean = (User)session.getAttribute("user");

        ApplicationContext ctx = ApplicationContextProvider.getApplicationContext();
        UserService userService = (UserService)ctx.getBean("userService");

        boolean hasUserPref = userService.hasUserPref(userBean.getUsername());

        if(hasUserPref) {
            return "requestmade";
        } else {
            return SUCCESS;
        }

    }

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }
}
