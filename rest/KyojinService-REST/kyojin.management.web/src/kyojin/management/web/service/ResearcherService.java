package kyojin.management.web.service;

import java.util.*;
import kyojin.management.web.data.Laboratory;
import kyojin.management.web.data.Researcher;

public class ResearcherService {
    
    private static Map<Integer, Researcher> RESEARCHER_DATA = new HashMap<Integer, Researcher>();
    private static Map<String, Laboratory> LABORATORY_DATA = new HashMap<String, Laboratory>();
	private static HashMap<Integer, String> linkage = new HashMap<Integer, String>();
    
    private int idLab;

    
    private int getNewIdRes() {
        int newId = 0;
        for(int id : RESEARCHER_DATA.keySet()) {
            if(newId < id)
                newId = id;
        }
        return ++newId;
    }
    
    public Researcher addResearcher(Researcher s) {
        int id = getNewIdRes();
        if(RESEARCHER_DATA.get(s.getId()) != null) {
            return null;
        }
        s.setId(id);
        RESEARCHER_DATA.put(id, s);
        return s;
    }
    
    public boolean deleteResearcher(int id) {
        if(RESEARCHER_DATA.get(id) == null) {
            return false;
        }
        RESEARCHER_DATA.remove(id);
        linkage.remove(id);
        return true;
    }
    
    public Researcher getResearcher(int id) {
        return RESEARCHER_DATA.get(id);
    }
    
    public Laboratory addLaboratory(Laboratory s) {
		int laboratoryKey = this.idLab;
		try {
			s.setId(laboratoryKey);
			ResearcherService.LABORATORY_DATA.put(s.getName(), s);
			this.idLab++;
		} catch(Error e) {
			return null;
		}
        if(LABORATORY_DATA.get(s.getName()) == null) {
            return null;
        }
        ResearcherService.LABORATORY_DATA.put(s.getName(), s);
        return s;
    }
    
    public boolean deleteLaboratory(String name) {
        if(LABORATORY_DATA.get(name) == null) {
            return false;
        }
        LABORATORY_DATA.remove(name);
        return true;
    }
    
    public Laboratory getLaboratory(String name) {
        return LABORATORY_DATA.get(name);
    }
    
	public int linkLaboratoryResearcher(String labName, int resId) {
		if(LABORATORY_DATA.get(labName) != null && RESEARCHER_DATA.get(resId) != null) {
			linkage.put(resId, labName);
		}
		else return -1;
		return resId;
	}
	
	public String getAllLaboratoryResearcher() {
		List<String> result = new ArrayList<String>();
		String str;
        for (Map.Entry<Integer, String> entry : linkage.entrySet()) {
            Integer key = entry.getKey();
            str = "ID: " + key + " | Nom : " + RESEARCHER_DATA.get(key).getName() + " | Laboratoire : " + entry.getValue();
            result.add(str);
        }
        return result.toString();
	}
	
	public String getAllLaboratory() {
        return ResearcherService.LABORATORY_DATA.values().toString();
    }
    
    public String getAllResearcher() {
        return ResearcherService.RESEARCHER_DATA.values().toString();
    }    
}