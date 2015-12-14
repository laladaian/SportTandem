package main.java.unifr.tandem.action;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import main.java.unifr.tandem.domain.ContactMessage;

import com.opensymphony.xwork2.ActionSupport;

public class SendEmail extends ActionSupport {

    private ContactMessage msgBean;
    
	@Override
    public String execute() throws Exception {
		String msg = "Name: " + msgBean.getName()+ "<br/>Email: "+ msgBean.getEmail()+"<br/> Message: <br/>"+ msgBean.getComment();
        
		// Recipient's email ID needs to be mentioned.
		String to = "lala_benko@yahoo.com";

		// Sender's email ID needs to be mentioned
		String from = "web@gmail.com";

		// Assuming you are sending email from localhost
		String host = "localhost";

		// Get system properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.setProperty("mail.smtp.host", host);

		// Get the default Session object.
		Session session = Session.getDefaultInstance(properties);
		
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("You have received a new message from SportTandem Website");
			message.setContent("<div>"+msg+"</div>", "text/html;charset=UTF-8");
			Transport.send(message);
			return SUCCESS;
		} catch (AddressException ex) {
			System.out.println( ex.getMessage());
		} catch (MessagingException ex) {
			System.out.println( ex.getMessage());
		}
		return ERROR;
    }

	public ContactMessage getMsgBean() {
		return msgBean;
	}

	public void setMsgBean(ContactMessage msgBean) {
		this.msgBean = msgBean;
	}
	
}
