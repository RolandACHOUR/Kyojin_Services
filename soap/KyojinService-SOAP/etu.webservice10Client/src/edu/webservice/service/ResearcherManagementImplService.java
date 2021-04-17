
package edu.webservice.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ResearcherManagementImplService", targetNamespace = "http://service.webservice.edu/", wsdlLocation = "file:/C:/Users/Jub\u00e9lix/3D%20Objects/eclipse-workspace/etu.webservice10/WebContent/wsdl/researchermanagementimpl.wsdl")
public class ResearcherManagementImplService
    extends Service
{

    private final static URL RESEARCHERMANAGEMENTIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException RESEARCHERMANAGEMENTIMPLSERVICE_EXCEPTION;
    private final static QName RESEARCHERMANAGEMENTIMPLSERVICE_QNAME = new QName("http://service.webservice.edu/", "ResearcherManagementImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Jub\u00e9lix/3D%20Objects/eclipse-workspace/etu.webservice10/WebContent/wsdl/researchermanagementimpl.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESEARCHERMANAGEMENTIMPLSERVICE_WSDL_LOCATION = url;
        RESEARCHERMANAGEMENTIMPLSERVICE_EXCEPTION = e;
    }

    public ResearcherManagementImplService() {
        super(__getWsdlLocation(), RESEARCHERMANAGEMENTIMPLSERVICE_QNAME);
    }

    public ResearcherManagementImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESEARCHERMANAGEMENTIMPLSERVICE_QNAME, features);
    }

    public ResearcherManagementImplService(URL wsdlLocation) {
        super(wsdlLocation, RESEARCHERMANAGEMENTIMPLSERVICE_QNAME);
    }

    public ResearcherManagementImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESEARCHERMANAGEMENTIMPLSERVICE_QNAME, features);
    }

    public ResearcherManagementImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ResearcherManagementImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ResearcherManagementImpl
     */
    @WebEndpoint(name = "ResearcherManagementImplPort")
    public ResearcherManagementImpl getResearcherManagementImplPort() {
        return super.getPort(new QName("http://service.webservice.edu/", "ResearcherManagementImplPort"), ResearcherManagementImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ResearcherManagementImpl
     */
    @WebEndpoint(name = "ResearcherManagementImplPort")
    public ResearcherManagementImpl getResearcherManagementImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.webservice.edu/", "ResearcherManagementImplPort"), ResearcherManagementImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESEARCHERMANAGEMENTIMPLSERVICE_EXCEPTION!= null) {
            throw RESEARCHERMANAGEMENTIMPLSERVICE_EXCEPTION;
        }
        return RESEARCHERMANAGEMENTIMPLSERVICE_WSDL_LOCATION;
    }

}