package edu.webservice.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import edu.webservice.model.Laboratory;
import edu.webservice.model.Researcher;

/*This class create every method of the service*/
@WebService(targetNamespace = "http://service.webservice.edu/", portName = "ResearcherManagementImplPort", serviceName = "ResearcherManagementImplService")
public class ResearcherManagementImpl implements ResearcherManagement {
	
	/*we create 3 hashmap that will contain every researcher, every laboratory and the */
	private HashMap<Integer, Researcher> researcherMap = new HashMap<Integer, Researcher>();
	private HashMap<String, Laboratory> laboratoryMap = new HashMap<String, Laboratory>();
	private HashMap<Integer, String> linkage = new HashMap<Integer, String>();

	/*We create 2 key for the researcher and the laboratory. We increment them for every new laboratory or researcher*/
	private int nextKey = 1;
	private int labKey = 1;


	/*We add a new researcher*/
	@WebMethod(operationName = "addResearcher", action = "urn:AddResearcher")
	@WebResult(name = "return")
	public int addResearcher(@WebParam(name = "arg0") Researcher researcher) {
		int researcherKey = this.nextKey;
		try {
			researcher.setId(researcherKey);
			this.researcherMap.put(researcherKey, researcher);
			this.nextKey++;
		} catch(Error e) {
			return -1;
		}
		return researcherKey;
	}
	
	/*This method return true if the id is matching and false if the researcher doesn't exist. If the id match, we delete the researcher*/
	@WebMethod(operationName = "deleteResearcher", action = "urn:DeleteResearcher")
	@WebResult(name = "return")
	public Boolean deleteResearcher(@WebParam(name = "arg0") int id) {
		try {
			this.researcherMap.remove(id);
			this.linkage.remove(id);
		} catch(Error e) {
			return false;
		}
		return true;
	}

	/*This method return the researcher with the id that we ask for*/
	@WebMethod(operationName = "getResearcher", action = "urn:GetResearcher")
	@WebResult(name = "return")
	public Researcher getResearcher(@WebParam(name = "arg0") int id) {
		return this.researcherMap.get(id);
	}

	/*This method return every Researcher of the HashMap*/
	@WebMethod(operationName = "getAllResearchers", action = "urn:GetAllResearchers")
	@WebResult(name = "return")
	public Collection<Researcher> getAllResearchers() {
		return this.researcherMap.values();
	}

	/*We add a new laboratory*/
	@WebMethod(operationName = "addLaboratory", action = "urn:AddLaboratory")
	@WebResult(name = "return")
	public int addLaboratory(@WebParam(name = "arg0") Laboratory laboratory) {
		int laboratoryKey = this.labKey;
		try {
			laboratory.setId(laboratoryKey);
			this.laboratoryMap.put(laboratory.getName(), laboratory);
			this.labKey++;
		} catch(Error e) {
			return -1;
		}
		return laboratoryKey;
	}

	/*This method return true if the id is matching and false if the laboratory doesn't exist. If the id match, we delete the laboratory*/
	@WebMethod(operationName = "deleteLaboratory", action = "urn:DeleteLaboratory")
	@WebResult(name = "return")
	public Boolean deleteLaboratory(@WebParam(name = "arg0") String name) {
		if(laboratoryMap.containsKey(name)) {
			this.laboratoryMap.remove(name);
			return true;
		} else { return false; }
	}

	/*This method return the laboratory with the name that we ask for*/
	@WebMethod(operationName = "getLaboratory", action = "urn:GetLaboratory")
	@WebResult(name = "return")
	public Laboratory getLaboratory(@WebParam(name = "arg0") String name) {
		return this.laboratoryMap.get(name);
	}

	/*This method return every laboratory of the HashMap*/
	@WebMethod(operationName = "getAllLaboratorys", action = "urn:GetAllLaboratorys")
	@WebResult(name = "return")
	public Collection<Laboratory> getAllLaboratorys() {
		return this.laboratoryMap.values();
	}

	/*This method link a researcher with a laboratory*/
	@WebMethod(operationName = "linkLaboratoryResearcher", action = "urn:LinkLaboratoryResearcher")
	@WebResult(name = "return")
	public int linkLaboratoryResearcher(@WebParam(name = "arg0") String labName, @WebParam(name = "arg1") int resId) {
		if(laboratoryMap.get(labName) != null && researcherMap.get(resId) != null) {
			this.linkage.put(resId, labName);
		}
		else return -1;
		return resId;
	}
	
	/*This method show every researcher who subscribe in a laboratory*/
	@WebMethod(operationName = "getAllLaboratoryResearcher", action = "urn:GetAllLaboratoryResearcher")
	@WebResult(name = "return")
	public List<String> getAllLaboratoryResearcher() {
		List<String> result = new ArrayList<String>();
		String str;
        for (Map.Entry<Integer, String> entry : linkage.entrySet()) {
            Integer key = entry.getKey();
            str = "ID: " + key + " | Nom : " + researcherMap.get(key).getName() + " | Laboratoire : " + entry.getValue();
            result.add(str);
        }
        return result;
	}
}
