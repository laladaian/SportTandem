package main.java.unifr.tandem.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * CyberCoachResources java model with annotations for Jersey marshalling
 */
@XmlRootElement(name = "List")
public class CyberCoachResources {

    private List<Link> links;
    private List<Partnership> partnerships;
    private String available;
    private String start;
    private String end;
    private String type;
    private String uri;

    @XmlElementWrapper(name = "Links")
    @XmlElementRef
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @XmlElementWrapper(name = "Partnerships")
    @XmlElementRef
    public List<Partnership> getPartnerships() {
        return partnerships;
    }

    public void setPartnerships(List<Partnership> partnerships) {
        this.partnerships = partnerships;
    }

    @XmlAttribute
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @XmlAttribute
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    @XmlAttribute
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
