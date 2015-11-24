package test.java.unifr.tandem;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.Base64;
import main.java.unifr.tandem.action.CyberCoach;
import main.java.unifr.tandem.domain.User;

import javax.ws.rs.core.MediaType;

/**
 */
public class WSTestCreating {
    public static void main(String[] args) {
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource service = client.resource(CyberCoach.BASE_URI);

        User userBean = new User();
        String passw = "st22st22";
        userBean.setUsername("st22");
        userBean.setPassword("st21st21");
        userBean.setEmail("st22@test.com");
        userBean.setRealname("st22 test");
        userBean.setPublicvisible("2");
        userBean.setUri(CyberCoach.REL_PATH + CyberCoach.RES_USERS + "/" + userBean.getUsername() + "/");
        String credentials = userBean.getUsername() + ":" + userBean.getPassword();

        service.
                path(CyberCoach.RES_USERS).
                path(userBean.getUsername()).
                header("Authorization", "Basic " + new String(Base64.encode(credentials))).
                accept(MediaType.APPLICATION_XML).      // set response content type
                type(MediaType.APPLICATION_XML).        // set request content type
                put(User.class, userBean);


    }
}
