package test.java.unifr.tandem;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import main.java.unifr.tandem.domain.User;

/**
 */
public class WSClientTest {
    public static void main(String[] args) {
        try {

            Client client = Client.create(new DefaultClientConfig());

            WebResource webResource = client.resource("http://diufvm31.unifr.ch:8090/CyberCoachServer/resources/users/lala");


            ClientResponse response = webResource.accept("application/xml").get(ClientResponse.class);


            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }

            User output = (User)response.getEntity(User.class);

            System.out.println("Output from Server .... \n");
            System.out.println(output);
            System.out.println(output.getUsername() + " " + output.getEmail() + " " +output.getPassword());
            System.out.println(output.getPartnerships().size());
            System.out.println(output.getSubscriptions());



        } catch (Exception e) {

            e.printStackTrace();

        }

    }


}
