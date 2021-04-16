package kyojin.management.client;

import java.util.Scanner;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.apache.cxf.jaxrs.client.*;
import kyojin.management.web.data.*;

public class Test {
	
    private static String webServiceUrl = "http://localhost:8080/kyojin.management.web/api";
    
	public static void main(String[] argv) {
		int menuResponse = 0;
		Scanner scanner = new Scanner(System.in);		
		
		do {
			// print the choices menu
			System.out.println("Que voulez-vous faire ?\n"
								+ " 1. Ajouter un chercheur\n"
								+ " 2. Ajouter un laboratoire\n"
								+ " 3. Lier un chercheur à un laboratoire\n"
								+ " 4. Chercher un laboratoire par nom\n"
								+ " 5. Afficher tous les chercheurs\n"
								+ " 6. Afficher tous les laboratoires\n"
								+ " 7. Chercher un chercheur par ID\n"
								+ " 8. Afficher les chercheurs par laboratoire\n"
								+ " 9. Supprimer un chercheur par ID\n"
								+ "10. Supprimer un laboratoire par nom\n"
								+ "11. Quitter");
			menuResponse = scanner.nextInt();
			scanner.nextLine(); // read potential \n character
			String laboName, firstname, lastname;
			int id;
			// response management
			switch(menuResponse) {
			case 1:
				// first retrieve the information, then print the result of the requet
				System.out.println("Nom du chercheur : ");
				lastname = scanner.nextLine();
				System.out.println("Prénom : ");
				firstname = scanner.nextLine();
				System.out.println("Chercheur ajouté! ID : " + add(firstname + " " + lastname));
				break;
			case 2:
				System.out.println("Nom du laboratoire : ");
				laboName = scanner.nextLine();
				addLaboratory(laboName);
				break;
			case 3:
				System.out.println("Nom du laboartoire : ");
				laboName = scanner.nextLine();
				System.out.println("ID du chercheur : ");
				id = scanner.nextInt();
				System.out.println(linkLaboratoryResearcher(laboName, id));
				break;
			case 4:
				System.out.println("Nom du laboratoire : ");
				laboName = scanner.nextLine();
				System.out.println(getLaboratory(laboName));
				break;
			case 5:
				System.out.println(getAllResearchers());
				break;
			case 6:
				System.out.println(getAllLaboratories());
				break;
			case 7:
				System.out.println("ID du chercheur : ");
				id = scanner.nextInt();
				System.out.println(get(id));
				break;
			case 8:
				System.out.println(getAllLaboratoryResearcher());
				break;
			case 9:
				System.out.println("ID du chercheur : ");
				id = scanner.nextInt();
				System.out.println(delete(id));
				break;
			case 10:
				System.out.println("Nom du laboratoire : ");
				laboName = scanner.nextLine();
				System.out.println(deleteLaboratory(laboName));
				break;
			case 11:
				System.out.println("Au revoir !");
				break;
			default:
				System.out.println("Veuillez saisir une entrée valide.\n");
			}
		} while(menuResponse != 11); // if last entry is chosen, quit the client program
		scanner.close();
	}
    
    private static Integer add(String name) {
    	// add a researcher given its name
        System.out.print("Adding " + name + "... ");
        WebClient c = WebClient.create(webServiceUrl + "/researcher"); // create the client to /researcher url
        Researcher s = new Researcher(name); 
        Response r = c.post(s); // post the researcher
        if(r.getStatus() == 400) { // manage the error feedback
            System.out.println("Oops!");
            return null;
        }
        System.out.println(r.getStatus());
        String uri = r.getHeaderString("Content-Location"); // retrieve the id returned in the url
        System.out.println("OK.");
        return Integer.parseInt(uri.substring(uri.lastIndexOf('/') + 1));
    }
    
    private static Boolean delete(Integer id) {
    	// delete a researcher
        System.out.print("Deleting " + id + "... ");
        WebClient c = WebClient.create(webServiceUrl + "/researcher").path(id);
        int status = c.delete().getStatus();
        if(status == 200) {System.out.println("OK.");
        return true;}System.out.println("Oops!");
        return false;
    }
    
    private static Researcher get(Integer id) {
    	// get a researcher given its id
        System.out.print("Getting " + id + "... ");
        WebClient c = WebClient.create(webServiceUrl + "/researcher").path(id);
        Researcher s = null;
        try {
            s = c.get(Researcher.class);
            System.out.println(s.toString());
        } catch(NotFoundException e) {
            System.out.println("Oops!");
        }
        return s;
    }
    
    private static Integer addLaboratory(String name) {
    	// add a laboratory given its name
        System.out.print("Adding " + name + "... ");
        WebClient c = WebClient.create(webServiceUrl + "/laboratory");
        Laboratory s = new Laboratory(name);
        Response r = c.post(s);if(r.getStatus() == 400) {
            System.out.println("Oops!");
            return null;
            }
        String uri = r.getHeaderString("Content-Location");
        System.out.println("OK.");
        return Integer.parseInt(uri.substring(uri.lastIndexOf('/') + 1));
    }
    
    private static Boolean deleteLaboratory(String name) {
    	// delete a laboratory given its name
        System.out.print("Deleting " + name + "... ");
        WebClient c = WebClient.create(webServiceUrl + "/laboratory").path(name);
        int status = c.delete().getStatus();
        if(status == 200) {System.out.println("OK.");
        return true;}System.out.println("Oops!");
        return false;
    }
    
    private static Laboratory getLaboratory(String name) {
    	// get a laboratory given its name
        System.out.print("Getting " + name + "... ");
        WebClient c = WebClient.create(webServiceUrl + "/laboratory").path(name);
        Laboratory s = null;
        try {
            s = c.get(Laboratory.class);
            System.out.println(s.toString());
        } catch(NotFoundException e) {
            System.out.println("Oops!");
        }
        return s;
    }
    
    private static boolean linkLaboratoryResearcher(String laboName, int id) {
    	// link a researcher to a laboratory given the lab name and the researcher's id
    	System.out.println("Linking researcher " + id + " to laboratory " + laboName);
    	WebClient c = WebClient.create(webServiceUrl + "/linkage/" + laboName + "/" + id);
    	if(c.get().getStatus() == 404) {
    		System.out.println("Oups!");
    		return false;
    	} else {
    		System.out.println("Researcher linked to laboratory !\n");
    		return true;
    	}
    }
    
    private static String getAllResearchers() {
    	// return a string of all researchers added
    	WebClient c = WebClient.create(webServiceUrl + "/researcher/all");
    	return c.get(String.class);
    }
    
    private static String getAllLaboratories() {
    	// return a string of all the laboratories added
    	WebClient c = WebClient.create(webServiceUrl + "/laboratory/all");
    	return c.get(String.class);
    }
    
    private static String getAllLaboratoryResearcher() {
    	// return a string of all the researchers with the lab they were linked to
    	System.out.println("Retrieving all researchers with their laboratory...");
    	WebClient c = WebClient.create(webServiceUrl + "/linkage");
    	String s = null;
    	try {
    		s = c.get(String.class);
    	} catch(NotFoundException e) {
    		System.out.println("Oops!");
    	}
    	return s;
    }
}