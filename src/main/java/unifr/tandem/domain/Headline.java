package main.java.unifr.tandem.domain;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Headline java model with annotations for Jersey marshalling
 */
@XmlRootElement(name = "headlinesItem")
public class Headline {
    private String headline;
    private List<Web> web;

    @XmlElement
    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @XmlElementRef
    @XmlElementWrapper(name = "links")
    public List<Web> getLinks() {
        return web;
    }

    public void setLinks(List<Web> web) {
        this.web = web;
    }
    
    
    @XmlRootElement(name = "web")
    public static class Web{
        private String href;

        @XmlElement
        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
        
        
    }
}
