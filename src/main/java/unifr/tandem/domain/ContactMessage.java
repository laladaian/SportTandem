package main.java.unifr.tandem.domain;

public class ContactMessage {
	private String name;
	private String email;
	private String comment;
	
	
	public ContactMessage() {
		super();
		this.name = "";
		this.email = "";
		this.comment = "";
	}

	public ContactMessage(String name, String email, String comment) {
		super();
		this.name = name;
		this.email = email;
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
