package edu.webservice.service;

import java.util.Collection;
import java.util.List;

import edu.webservice.model.Laboratory;
import edu.webservice.model.Researcher;

public interface ResearcherManagement {
	
	int addResearcher(Researcher researcher); 
	
	Boolean deleteResearcher(int id);
	
	Researcher getResearcher(int id);
	
	Collection<Researcher> getAllResearchers();
	
	int addLaboratory(Laboratory laboratory); 
	
	Boolean deleteLaboratory(String name);
	
	Laboratory getLaboratory(String name);
	
	Collection<Laboratory> getAllLaboratorys();
	
	int linkLaboratoryResearcher(String labName, int resId);
	
	List<String> getAllLaboratoryResearcher();
}
