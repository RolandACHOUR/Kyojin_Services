
package edu.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Thu Apr 15 11:16:21 CEST 2021
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "getResearcher", namespace = "http://service.webservice.edu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getResearcher", namespace = "http://service.webservice.edu/")

public class GetResearcher {

    @XmlElement(name = "arg0")
    private int arg0;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

}
