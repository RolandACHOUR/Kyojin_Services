
package edu.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Thu Apr 15 11:46:10 CEST 2021
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "linkLaboratoryResearcher", namespace = "http://service.webservice.edu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkLaboratoryResearcher", namespace = "http://service.webservice.edu/", propOrder = {"arg0", "arg1"})

public class LinkLaboratoryResearcher {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;
    @XmlElement(name = "arg1")
    private int arg1;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

    public int getArg1() {
        return this.arg1;
    }

    public void setArg1(int newArg1)  {
        this.arg1 = newArg1;
    }

}

