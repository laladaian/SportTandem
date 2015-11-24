package main.java.unifr.tandem.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import main.java.unifr.tandem.domain.Headline;
import main.java.unifr.tandem.domain.Headline.Web;
import main.java.unifr.tandem.domain.NewsPiece;
import main.java.unifr.tandem.domain.Response;
import main.java.unifr.tandem.domain.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Java file for action news
 * Description: Gets realtime news form ESPN Web Service
 */
public class News extends ActionSupport{
  
    private static final long serialVersionUID = 1L;
    
    private String url = "http://api.espn.com/v1/sports/news/headlines?apikey=s5p8ds9srsp5msqqqjs7jjph";
    private List<NewsPiece> newsBean;
    private User userBean;
    
    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession(true);
        userBean = (User)session.getAttribute("user");

        newsBean = getNews();
         
        return SUCCESS;
    }

    public List<NewsPiece> getNews(){
        NewsPiece piece = null ;    
        List<NewsPiece> list = new ArrayList<NewsPiece>();
        try {

            Client client = Client.create(new DefaultClientConfig());
            WebResource webResource = client.resource(url);
            ClientResponse response = webResource.accept("text/xml").get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }

            Response output = (Response)response.getEntity(Response.class);

            System.out.println("Output from Server .... \n");
            System.out.println(response);
            System.out.println(output);
            piece = new NewsPiece(output.getHeadline().get(0).getHeadline(), output.getHeadline().get(0).getLinks().get(0).getHref());
            List<Headline> headlines = output.getHeadline();
            for (int i = 0; i < headlines.size(); i++){
                System.out.println("Headlines: " + headlines.get(i).getHeadline());
                List<Web> link = headlines.get(i).getLinks();
                for (int j = 0; j < link.size(); j++){
                    System.out.println("Href: " + link.get(j).getHref());
                      piece = new NewsPiece(headlines.get(i).getHeadline(), link.get(j).getHref());
                      list.add(piece);
                }
            }
            // System.out.println(output.getHeadline() + " " + output.getWeb() );

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<NewsPiece> getNewsBean() {
        return newsBean;
    }

    public void setNewsBean(List<NewsPiece> news) {
        newsBean = news;
    }

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }
}
