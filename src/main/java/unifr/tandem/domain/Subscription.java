package main.java.unifr.tandem.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Subscription java model with annotations for Jersey marshalling
 * Description: Subscriptions are made by a user to a certain sport 
 */
@XmlRootElement(name = "subscription")
public class Subscription {
    private String datesubscribed;
    private String id;
    private String uri;
    private String publicvisible;
    private Sport sport;
    private User user;

    @XmlAttribute
    public String getDatesubscribed() {
        return datesubscribed;
    }

    public void setDatesubscribed(String datesubscribed) {
        this.datesubscribed = datesubscribed;
    }

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
    public String getPublicvisible() {
        return publicvisible;
    }

    public void setPublicvisible(String publicvisible) {
        this.publicvisible = publicvisible;
    }

    @XmlElement
    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @XmlElement
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
