package main.java.unifr.tandem.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.unifr.tandem.domain.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Java file for action showAcount
 */
public class ShowAccount extends ActionSupport{

    private User userBean;

    @Override
    public String execute() throws Exception {

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession(true);
        userBean = (User)session.getAttribute("user");
        return SUCCESS;
    }

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }
}
