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
import java.util.List;

/**
 * Java file for action searchFriends
 * Description: Finds all the friends of a certain user
 */
public class SearchFriends extends ActionSupport{

    private static Logger logger = Logger.getLogger(SearchFriends.class);

    private List<UserPref> friends;
    private User userBean;

    @Override
    public String execute() throws Exception {

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession(true);
        User userBean = (User)session.getAttribute("user");

        ApplicationContext ctx = ApplicationContextProvider.getApplicationContext();
        UserService userService = (UserService)ctx.getBean("userService");

        UserPref userPref = userService.getUserPref(userBean.getUsername());
        friends = userService.getSportPartners(userPref);

        logger.debug("Number of friends:" + friends.size());

        return SUCCESS;
    }

    public List<UserPref> getFriends() {
        return friends;
    }

    public void setFriends(List<UserPref> friends) {
        this.friends = friends;
    }

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }
}
