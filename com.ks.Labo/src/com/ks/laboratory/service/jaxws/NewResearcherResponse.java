
package com.ks.laboratory.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Sat Mar 27 11:44:01 CET 2021
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "newResearcherResponse", namespace = "http://Laboratory.KyojinService.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newResearcherResponse", namespace = "http://Laboratory.KyojinService.com/")

public class NewResearcherResponse {

    @XmlElement(name = "return")
    private com.ks.laboratory.model.Researcher _return;

    public com.ks.laboratory.model.Researcher getReturn() {
        return this._return;
    }

    public void setReturn(com.ks.laboratory.model.Researcher new_return)  {
        this._return = new_return;
    }

}
