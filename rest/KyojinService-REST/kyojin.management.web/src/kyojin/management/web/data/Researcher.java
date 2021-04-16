package kyojin.management.web.data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Researcher {
    
    private String name;
    private Integer id;
    
    public Researcher() {}
    
    public Researcher(String name) {
        this.name = name;
        this.id = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "ID : " + id + " | Nom : " +name;
    }
}