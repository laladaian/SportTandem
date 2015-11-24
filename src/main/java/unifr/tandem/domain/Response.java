package main.java.unifr.tandem.domain;

import main.java.unifr.tandem.domain.*;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Response java model with annotations for Jersey marshalling
 */
@XmlRootElement
public class Response {
    
    private String status;
    private List<Headline> headlinesItem  = new ArrayList<Headline>();

    @XmlElementRef
    @XmlElementWrapper(name = "headlines")
    public List<Headline> getHeadline() {
        return headlinesItem;
    }

    public void setHeadlines(List<Headline> headlines) {
        this.headlinesItem = headlines;
    }
    
    @XmlElement
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
    
    
}
