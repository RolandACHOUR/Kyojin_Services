
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

@XmlRootElement(name = "getLaboratoryResponse", namespace = "http://service.webservice.edu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLaboratoryResponse", namespace = "http://service.webservice.edu/")

public class GetLaboratoryResponse {

    @XmlElement(name = "return")
    private edu.webservice.model.Laboratory _return;

    public edu.webservice.model.Laboratory getReturn() {
        return this._return;
    }

    public void setReturn(edu.webservice.model.Laboratory new_return)  {
        this._return = new_return;
    }

}

