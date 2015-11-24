package main.java.unifr.tandem.domain;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User java model with annotations for Jersey marshalling
 */

@XmlRootElement
public class User {
	private String email;
	private String password;
	private String realname;
	private String publicvisible;
	private String datecreated;
	private String username;
	private String uri;
	private List<Partnership> partnerships = new ArrayList<Partnership>();
	private List<Subscription> subscriptions;

	@XmlElement
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@XmlElement
	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@XmlElement
	public String getPublicvisible() {
		return publicvisible;
	}

	public void setPublicvisible(String publicvisible) {
		this.publicvisible = publicvisible;
	}

	@XmlAttribute
	public String getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}

	@XmlAttribute
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@XmlAttribute
	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	@XmlElementRef
	@XmlElementWrapper(name = "partnerships")
	public List<Partnership> getPartnerships() {
		return partnerships;
	}

	public void setPartnerships(List<Partnership> partnerships) {
		this.partnerships = partnerships;
	}

	@XmlElementRef
	@XmlElementWrapper(name = "subscriptions")
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
}
