package test.java.unifr.tandem;

import main.java.unifr.tandem.domain.User;
import main.java.unifr.tandem.domain.UserPref;
import main.java.unifr.tandem.service.UserService;
import main.java.unifr.tandem.utils.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 */
public class DBTest {
    public static void main(String[] args) {

        ApplicationContext ctx = ApplicationContextProvider.getApplicationContext();
        UserService userService = (UserService)ctx.getBean("userService");

        System.out.println(userService.getUserCount());
        User user = userService.getUser("alice", "asdf");
        System.out.println(user.getUsername());
        System.out.println(user.getEmail());
        System.out.println(user.getRealname());

        UserPref userPref = new UserPref();
        userPref.setUsername("jack");
        userPref.setSport("badminton");
        userPref.setCity("Fribourg");
        userPref.setSportLevel(3);
        userPref.setAge(23);
        userPref.setFrequency("daily");
        userService.addUserPref(userPref);

        System.out.println(userService.hasUserPref("bob"));
        System.out.println(userService.hasUserPref("alice"));

        List<UserPref> users = userService.getSportPartners(userPref);
        System.out.println(users.size());
        System.out.println(users.get(0).getEmail());

        System.out.println(userService.getUser("chris", "poiuyt").getUsername());

        UserPref bob = userService.getUserPref("Ivvy");
        System.out.println(bob.getUsername());
        System.out.println(bob.getSportLevel());
        System.out.println(bob.getCity());
        System.out.println(bob.getSport());
        System.out.println(userService.getSportPartners(bob).size());

    }
}
