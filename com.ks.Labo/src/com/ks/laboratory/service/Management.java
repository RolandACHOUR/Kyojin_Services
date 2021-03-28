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

@WebService(name = "LaboratoryManager",
targetNamespace = "http://laboratorymanager.service.com/")
public interface Management {
	
	@WebMethod(operationName = "addLaboratory", action = "urn:addLaboratory")
	@WebResult(name = "result")
	int addLaboratory(@WebParam(name = "laboratory") Laboratory laboratory); 
	
	@WebMethod(operationName = "addResearcher", action = "urn:addStudent")
	@WebResult(name = "result")
	int addResearcher(@WebParam(name = "student") Researcher researcher); 
	
	@WebMethod(operationName = "deleteLaboratory", action = "urn:deleteLaboratory")
	@WebResult(name = "result")
	Boolean deleteLaboratory(@WebParam(name = "id") int id);
	
	@WebMethod(operationName = "deleteResearcher", action = "urn:deleteResearcher")
	@WebResult(name = "result")
	Boolean deleteResearcher(@WebParam(name = "id") int id);
	
	@WebMethod(operationName = "getLaboratory", action = "urn:getLaboratory")
	@WebResult(name = "result")
	Laboratory getLaboratory(@WebParam(name = "id") int id);
	
	@WebMethod(operationName = "getAllLaboratory", action = "urn:getAllLaboratory")
	@WebResult(name = "result")
	Collection<Laboratory> getAllLaboratory();
	
	@WebMethod(operationName = "linkResearcherToLaboratory", action = "urn:linkResearcherToLaboratory")
	@WebResult(name = "result")
	Integer linkResearcherToLaboratory(@WebParam(name = "researcherId") int researcherId, @WebParam(name = "laboratoryId") int laboratoryId);
	
	@WebMethod(operationName = "linkResearcherToLaboratory", action = "urn:linkResearcherToLaboratory")
	@WebResult(name = "result")
	Laboratory ResearchersLaboratory(@WebParam(name = "researcherId") int researcherId);
	
	
}
