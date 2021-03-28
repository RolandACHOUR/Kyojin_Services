package com.ks.laboratory.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.ks.laboratory.model.Laboratory;
import com.ks.laboratory.model.Researcher;

@WebService(targetNamespace = "http://Laboratory.KyojinService.com/", portName = "LaboratoryManagerPort", serviceName = "LaboratoryManagerService")
public class LaboratoryManager {
	
	private int nextKey = 1;
	private HashMap<Integer, Researcher> researchersMap = new HashMap<Integer, Researcher>();
	private HashMap<Integer, Laboratory> laboratoryMap = new HashMap<Integer, Laboratory>();
	private ArrayList<ArrayList<Integer>> linkResearcherToLaboratory = new ArrayList();


	//This function create a Laboratory
	@WebMethod(operationName = "addLaboratory", action = "urn:AddLaboratory")
	@WebResult(name = "return")
	public int addLaboratory(@WebParam(name = "arg0") Laboratory laboratory) {
		int laboratoryKey = this.nextKey;
		try {
			laboratory.setId(laboratoryKey);
			laboratory.setNumberOfMembers(0);
			this.laboratoryMap.put(laboratoryKey, laboratory);
			this.nextKey++;
		} catch(Error e) {
			return -1;
		}
		return laboratoryKey;
	}
	
	//This function create a Researcher
	@WebMethod(operationName = "addResearcher", action = "urn:AddResearcher")
	@WebResult(name = "return")
	public int addResearcher(@WebParam(name = "arg0") Researcher researcher) {
		int researcherKey = this.nextKey;
		try {
			researcher.setId(researcherKey);
			this.researchersMap.put(researcherKey, researcher);
			this.nextKey++;
		} catch(Error e) {
			return -1;
		}
		return researcherKey;
	}
	
	//This function delete a Laboratory giving it id
	@WebMethod(operationName = "deleteLaboratory", action = "urn:DeleteLaboratory")
	@WebResult(name = "return")
	public Boolean deleteLaboratory(@WebParam(name = "arg0") int id) {
		try {
			this.laboratoryMap.remove(id);
		} catch(Error e) {
			return false;
		}
		return true;
	}
	
	//This function delete a Researcher giving it id
	@WebMethod(operationName = "deleteResearcher", action = "urn:DeleteResearcher")
	@WebResult(name = "return")
	public Boolean deleteResearcher(@WebParam(name = "arg0") int id) {
		try {
			this.researchersMap.remove(id);
		} catch(Error e) {
			return false;
		}
		return true;
	}

	@WebMethod(operationName = "getLaboratory", action = "urn:GetLaboratory")
	@WebResult(name = "return")
	public Laboratory getLaboratory(@WebParam(name = "arg0") int id) {
		return this.laboratoryMap.get(id);
	}
	
	@WebMethod(operationName = "getResearcher", action = "urn:GetResearcher")
	@WebResult(name = "return")
	public Researcher getResearcher(@WebParam(name = "arg0") int id) {
		return this.researchersMap.get(id);
	}

	@WebMethod(operationName = "getAllLaboratory", action = "urn:GetAllLaboratory")
	@WebResult(name = "return")
	public Collection<Laboratory> getAllLaboratory() {
		return this.laboratoryMap.values();
	}
	
	@WebMethod(operationName = "linkResearcherToLaboratory", action = "urn:LinkResearcherToLaboratory")
	@WebResult(name = "return")
	public Integer linkResearcherToLaboratory(@WebParam(name = "researcherId") int researcherId, @WebParam(name = "laboratoryId") int laboratoryId) {
		
		linkResearcherToLaboratory.get(researcherId).add(laboratoryId);
		return linkResearcherToLaboratory.get(researcherId).get(laboratoryId);
	}
	
	public ArrayList<Integer> ResearchersLaboratory(@WebParam(name = "researcherId") int researcherId) {
		
		while(linkResearcherToLaboratory.get(researcherId) != null) {
			return linkResearcherToLaboratory.get(researcherId);
		}
		return null;
	}

}