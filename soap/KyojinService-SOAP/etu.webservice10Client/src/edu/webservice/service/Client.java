package edu.webservice.service;

import java.util.List;
import java.util.Scanner;

public class Client {
	
	/*This class manages the service client*/
	public static void main(String[] argv) {
		int menuResponse = 0;
		Scanner scanner = new Scanner(System.in);
		
		ResearcherManagementImplService service = new ResearcherManagementImplService();
		ResearcherManagementImpl manager = service.getResearcherManagementImplPort();
		
		do {
			System.out.println("Que voulez-vous faire ?\n"
								+ " 1. Ajouter un chercheur\n"
								+ " 2. Ajouter un laboratoire\n"
								+ " 3. Lier un chercheur à un laboratoire\n"
								+ " 4. Chercher un laboratoire par nom\n"
								+ " 5. Afficher tous les chercheurs\n"
								+ " 6. Afficher tous les laboratoires\n"
								+ " 7. Chercher un chercheur par ID\n"
								+ " 8. Afficher les chercheurs d'un laboratoire\n"
								+ " 9. Supprimer un chercheur par ID\n"
								+ "10. Supprimer un laboratoire par nom\n"
								+ "11. Quitter");
			menuResponse = scanner.nextInt();
			scanner.nextLine(); // read potential \n character
			String laboName, firstname, lastname;
			int id;
			switch(menuResponse) {
			case 1:
				System.out.println("Nom du chercheur : ");
				lastname = scanner.nextLine();
				System.out.println("Prénom : ");
				firstname = scanner.nextLine();
				System.out.println("Chercheur ajouté! ID : " + manager.addResearcher(new Researcher(firstname, lastname)));
				break;
			case 2:
				System.out.println("Nom du laboratoire : ");
				laboName = scanner.nextLine();
				Laboratory laboratory = new Laboratory(laboName);
				manager.addLaboratory(laboratory);
				break;
			case 3:
				System.out.println("Nom du laboartoire : ");
				laboName = scanner.nextLine();
				System.out.println("ID du chercheur : ");
				id = scanner.nextInt();
				System.out.println(manager.linkLaboratoryResearcher(laboName, id));
				break;
			case 4:
				System.out.println("Nom du laboratoire : ");
				laboName = scanner.nextLine();
				System.out.println(manager.getLaboratory(laboName));
				break;
			case 5:
				List<Researcher> researchers = manager.getAllResearchers();
				System.out.println(researchers.toString());
				break;
			case 6:
				List<Laboratory> laboratories = manager.getAllLaboratorys();
				System.out.println(laboratories.toString());
				break;
			case 7:
				System.out.println("ID du chercheur : ");
				id = scanner.nextInt();
				System.out.println(manager.getResearcher(id));
				break;
			case 8:
				List<String> laboR = manager.getAllLaboratoryResearcher();
				System.out.println(laboR.toString());
				break;
			case 9:
				System.out.println("ID du chercheur : ");
				id = scanner.nextInt();
				System.out.println(manager.deleteResearcher(id));
				break;
			case 10:
				System.out.println("Nom du laboratoire : ");
				laboName = scanner.nextLine();
				System.out.println(manager.deleteLaboratory(laboName));
				break;
			case 11:
				System.out.println("Au revoir !");
				break;
			default:
				System.out.println("Veuillez saisir une entrée valide.\n");
			}
			System.out.println("Appuyez sur ENTER pour continuer");
			scanner.nextLine(); // read potential \n character
		} while(menuResponse != 11);	
		scanner.close();
	}
}
