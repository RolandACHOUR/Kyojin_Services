
package edu.webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.webservice.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddLaboratory_QNAME = new QName("http://service.webservice.edu/", "addLaboratory");
    private final static QName _LinkLaboratoryResearcher_QNAME = new QName("http://service.webservice.edu/", "linkLaboratoryResearcher");
    private final static QName _GetLaboratory_QNAME = new QName("http://service.webservice.edu/", "getLaboratory");
    private final static QName _GetResearcherResponse_QNAME = new QName("http://service.webservice.edu/", "getResearcherResponse");
    private final static QName _DeleteLaboratoryResponse_QNAME = new QName("http://service.webservice.edu/", "deleteLaboratoryResponse");
    private final static QName _GetAllLaboratoryResearcherResponse_QNAME = new QName("http://service.webservice.edu/", "getAllLaboratoryResearcherResponse");
    private final static QName _AddLaboratoryResponse_QNAME = new QName("http://service.webservice.edu/", "addLaboratoryResponse");
    private final static QName _GetLaboratoryResponse_QNAME = new QName("http://service.webservice.edu/", "getLaboratoryResponse");
    private final static QName _DeleteLaboratory_QNAME = new QName("http://service.webservice.edu/", "deleteLaboratory");
    private final static QName _GetAllResearchersResponse_QNAME = new QName("http://service.webservice.edu/", "getAllResearchersResponse");
    private final static QName _DeleteResearcherResponse_QNAME = new QName("http://service.webservice.edu/", "deleteResearcherResponse");
    private final static QName _GetAllLaboratorysResponse_QNAME = new QName("http://service.webservice.edu/", "getAllLaboratorysResponse");
    private final static QName _GetAllLaboratorys_QNAME = new QName("http://service.webservice.edu/", "getAllLaboratorys");
    private final static QName _LinkLaboratoryResearcherResponse_QNAME = new QName("http://service.webservice.edu/", "linkLaboratoryResearcherResponse");
    private final static QName _AddResearcherResponse_QNAME = new QName("http://service.webservice.edu/", "addResearcherResponse");
    private final static QName _AddResearcher_QNAME = new QName("http://service.webservice.edu/", "addResearcher");
    private final static QName _DeleteResearcher_QNAME = new QName("http://service.webservice.edu/", "deleteResearcher");
    private final static QName _GetAllLaboratoryResearcher_QNAME = new QName("http://service.webservice.edu/", "getAllLaboratoryResearcher");
    private final static QName _GetAllResearchers_QNAME = new QName("http://service.webservice.edu/", "getAllResearchers");
    private final static QName _GetResearcher_QNAME = new QName("http://service.webservice.edu/", "getResearcher");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteLaboratory }
     * 
     */
    public DeleteLaboratory createDeleteLaboratory() {
        return new DeleteLaboratory();
    }

    /**
     * Create an instance of {@link GetAllResearchersResponse }
     * 
     */
    public GetAllResearchersResponse createGetAllResearchersResponse() {
        return new GetAllResearchersResponse();
    }

    /**
     * Create an instance of {@link DeleteResearcherResponse }
     * 
     */
    public DeleteResearcherResponse createDeleteResearcherResponse() {
        return new DeleteResearcherResponse();
    }

    /**
     * Create an instance of {@link AddLaboratoryResponse }
     * 
     */
    public AddLaboratoryResponse createAddLaboratoryResponse() {
        return new AddLaboratoryResponse();
    }

    /**
     * Create an instance of {@link GetLaboratoryResponse }
     * 
     */
    public GetLaboratoryResponse createGetLaboratoryResponse() {
        return new GetLaboratoryResponse();
    }

    /**
     * Create an instance of {@link DeleteLaboratoryResponse }
     * 
     */
    public DeleteLaboratoryResponse createDeleteLaboratoryResponse() {
        return new DeleteLaboratoryResponse();
    }

    /**
     * Create an instance of {@link GetAllLaboratoryResearcherResponse }
     * 
     */
    public GetAllLaboratoryResearcherResponse createGetAllLaboratoryResearcherResponse() {
        return new GetAllLaboratoryResearcherResponse();
    }

    /**
     * Create an instance of {@link AddLaboratory }
     * 
     */
    public AddLaboratory createAddLaboratory() {
        return new AddLaboratory();
    }

    /**
     * Create an instance of {@link LinkLaboratoryResearcher }
     * 
     */
    public LinkLaboratoryResearcher createLinkLaboratoryResearcher() {
        return new LinkLaboratoryResearcher();
    }

    /**
     * Create an instance of {@link GetLaboratory }
     * 
     */
    public GetLaboratory createGetLaboratory() {
        return new GetLaboratory();
    }

    /**
     * Create an instance of {@link GetResearcherResponse }
     * 
     */
    public GetResearcherResponse createGetResearcherResponse() {
        return new GetResearcherResponse();
    }

    /**
     * Create an instance of {@link GetAllResearchers }
     * 
     */
    public GetAllResearchers createGetAllResearchers() {
        return new GetAllResearchers();
    }

    /**
     * Create an instance of {@link GetResearcher }
     * 
     */
    public GetResearcher createGetResearcher() {
        return new GetResearcher();
    }

    /**
     * Create an instance of {@link AddResearcher }
     * 
     */
    public AddResearcher createAddResearcher() {
        return new AddResearcher();
    }

    /**
     * Create an instance of {@link DeleteResearcher }
     * 
     */
    public DeleteResearcher createDeleteResearcher() {
        return new DeleteResearcher();
    }

    /**
     * Create an instance of {@link GetAllLaboratoryResearcher }
     * 
     */
    public GetAllLaboratoryResearcher createGetAllLaboratoryResearcher() {
        return new GetAllLaboratoryResearcher();
    }

    /**
     * Create an instance of {@link LinkLaboratoryResearcherResponse }
     * 
     */
    public LinkLaboratoryResearcherResponse createLinkLaboratoryResearcherResponse() {
        return new LinkLaboratoryResearcherResponse();
    }

    /**
     * Create an instance of {@link AddResearcherResponse }
     * 
     */
    public AddResearcherResponse createAddResearcherResponse() {
        return new AddResearcherResponse();
    }

    /**
     * Create an instance of {@link GetAllLaboratorysResponse }
     * 
     */
    public GetAllLaboratorysResponse createGetAllLaboratorysResponse() {
        return new GetAllLaboratorysResponse();
    }

    /**
     * Create an instance of {@link GetAllLaboratorys }
     * 
     */
    public GetAllLaboratorys createGetAllLaboratorys() {
        return new GetAllLaboratorys();
    }

    /**
     * Create an instance of {@link Researcher }
     * 
     */
    public Researcher createResearcher() {
        return new Researcher();
    }

    /**
     * Create an instance of {@link Laboratory }
     * 
     */
    public Laboratory createLaboratory() {
        return new Laboratory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLaboratory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "addLaboratory")
    public JAXBElement<AddLaboratory> createAddLaboratory(AddLaboratory value) {
        return new JAXBElement<AddLaboratory>(_AddLaboratory_QNAME, AddLaboratory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkLaboratoryResearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "linkLaboratoryResearcher")
    public JAXBElement<LinkLaboratoryResearcher> createLinkLaboratoryResearcher(LinkLaboratoryResearcher value) {
        return new JAXBElement<LinkLaboratoryResearcher>(_LinkLaboratoryResearcher_QNAME, LinkLaboratoryResearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLaboratory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "getLaboratory")
    public JAXBElement<GetLaboratory> createGetLaboratory(GetLaboratory value) {
        return new JAXBElement<GetLaboratory>(_GetLaboratory_QNAME, GetLaboratory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResearcherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "getResearcherResponse")
    public JAXBElement<GetResearcherResponse> createGetResearcherResponse(GetResearcherResponse value) {
        return new JAXBElement<GetResearcherResponse>(_GetResearcherResponse_QNAME, GetResearcherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLaboratoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "deleteLaboratoryResponse")
    public JAXBElement<DeleteLaboratoryResponse> createDeleteLaboratoryResponse(DeleteLaboratoryResponse value) {
        return new JAXBElement<DeleteLaboratoryResponse>(_DeleteLaboratoryResponse_QNAME, DeleteLaboratoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLaboratoryResearcherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "getAllLaboratoryResearcherResponse")
    public JAXBElement<GetAllLaboratoryResearcherResponse> createGetAllLaboratoryResearcherResponse(GetAllLaboratoryResearcherResponse value) {
        return new JAXBElement<GetAllLaboratoryResearcherResponse>(_GetAllLaboratoryResearcherResponse_QNAME, GetAllLaboratoryResearcherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLaboratoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "addLaboratoryResponse")
    public JAXBElement<AddLaboratoryResponse> createAddLaboratoryResponse(AddLaboratoryResponse value) {
        return new JAXBElement<AddLaboratoryResponse>(_AddLaboratoryResponse_QNAME, AddLaboratoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLaboratoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "getLaboratoryResponse")
    public JAXBElement<GetLaboratoryResponse> createGetLaboratoryResponse(GetLaboratoryResponse value) {
        return new JAXBElement<GetLaboratoryResponse>(_GetLaboratoryResponse_QNAME, GetLaboratoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLaboratory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "deleteLaboratory")
    public JAXBElement<DeleteLaboratory> createDeleteLaboratory(DeleteLaboratory value) {
        return new JAXBElement<DeleteLaboratory>(_DeleteLaboratory_QNAME, DeleteLaboratory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResearchersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "getAllResearchersResponse")
    public JAXBElement<GetAllResearchersResponse> createGetAllResearchersResponse(GetAllResearchersResponse value) {
        return new JAXBElement<GetAllResearchersResponse>(_GetAllResearchersResponse_QNAME, GetAllResearchersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResearcherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "deleteResearcherResponse")
    public JAXBElement<DeleteResearcherResponse> createDeleteResearcherResponse(DeleteResearcherResponse value) {
        return new JAXBElement<DeleteResearcherResponse>(_DeleteResearcherResponse_QNAME, DeleteResearcherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLaboratorysResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "getAllLaboratorysResponse")
    public JAXBElement<GetAllLaboratorysResponse> createGetAllLaboratorysResponse(GetAllLaboratorysResponse value) {
        return new JAXBElement<GetAllLaboratorysResponse>(_GetAllLaboratorysResponse_QNAME, GetAllLaboratorysResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLaboratorys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "getAllLaboratorys")
    public JAXBElement<GetAllLaboratorys> createGetAllLaboratorys(GetAllLaboratorys value) {
        return new JAXBElement<GetAllLaboratorys>(_GetAllLaboratorys_QNAME, GetAllLaboratorys.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkLaboratoryResearcherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "linkLaboratoryResearcherResponse")
    public JAXBElement<LinkLaboratoryResearcherResponse> createLinkLaboratoryResearcherResponse(LinkLaboratoryResearcherResponse value) {
        return new JAXBElement<LinkLaboratoryResearcherResponse>(_LinkLaboratoryResearcherResponse_QNAME, LinkLaboratoryResearcherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResearcherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "addResearcherResponse")
    public JAXBElement<AddResearcherResponse> createAddResearcherResponse(AddResearcherResponse value) {
        return new JAXBElement<AddResearcherResponse>(_AddResearcherResponse_QNAME, AddResearcherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "addResearcher")
    public JAXBElement<AddResearcher> createAddResearcher(AddResearcher value) {
        return new JAXBElement<AddResearcher>(_AddResearcher_QNAME, AddResearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "deleteResearcher")
    public JAXBElement<DeleteResearcher> createDeleteResearcher(DeleteResearcher value) {
        return new JAXBElement<DeleteResearcher>(_DeleteResearcher_QNAME, DeleteResearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLaboratoryResearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "getAllLaboratoryResearcher")
    public JAXBElement<GetAllLaboratoryResearcher> createGetAllLaboratoryResearcher(GetAllLaboratoryResearcher value) {
        return new JAXBElement<GetAllLaboratoryResearcher>(_GetAllLaboratoryResearcher_QNAME, GetAllLaboratoryResearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResearchers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "getAllResearchers")
    public JAXBElement<GetAllResearchers> createGetAllResearchers(GetAllResearchers value) {
        return new JAXBElement<GetAllResearchers>(_GetAllResearchers_QNAME, GetAllResearchers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.edu/", name = "getResearcher")
    public JAXBElement<GetResearcher> createGetResearcher(GetResearcher value) {
        return new JAXBElement<GetResearcher>(_GetResearcher_QNAME, GetResearcher.class, null, value);
    }

}
