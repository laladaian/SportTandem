package main.java.unifr.tandem.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Partnership java model with annotations for Jersey marshalling
 * Description: Partnerships are friends relations between two users
 */
@XmlRootElement(name = "partnership")
public class Partnership {

    private String id;
    private String uri;
    private String publicvisible;
    private String datecreated;
    private String userconfirmed1;
    private String userconfirmed2;
    private User user1;
    private User user2;

    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlAttribute
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @XmlElement
    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    @XmlElement
    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
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
    public String getUserconfirmed1() {
        return userconfirmed1;
    }

    public void setUserconfirmed1(String userconfirmed1) {
        this.userconfirmed1 = userconfirmed1;
    }

    @XmlAttribute
    public String getUserconfirmed2() {
        return userconfirmed2;
    }

    public void setUserconfirmed2(String userconfirmed2) {
        this.userconfirmed2 = userconfirmed2;
    }
}
