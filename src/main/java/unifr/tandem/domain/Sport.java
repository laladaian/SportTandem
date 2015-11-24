package main.java.unifr.tandem.domain;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Sport java model with annotations for Jersey marshalling
 */
@XmlRootElement(name = "Sport")
public class Sport {
    private String id;
    private String name;
    private String uri;
    private String description;
    private List<Subscription> subscriptions;

    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @XmlAttribute
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElementWrapper(name = "Subscriptions")
    @XmlElement
    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
