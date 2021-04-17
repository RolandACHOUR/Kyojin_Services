# Kyojin_Services

## Presentation

**ACHOUR Roland** and **CLIPET Julien** Web services project

> Contact : 
ACHOUR Roland : rolandachour@yahoo.fr
CLIPET Julien : julien.clipet@outlook.fr

This project gather two web services :
- a SOAP api based on Jax-WS (*soap* folder)
- a REST api based on Jax-RS (*rest* folder)

The WSDL file of the SOAP api can be found in .../.../

You can also check the Java documentation for further informations on the program.

## Description of the web services

In this section, we describe how to use the services with the given clients.

Multiple opérations can be done with on each client : 

1. Add a researcher
2. Add a laboratory
3. Link a researcher to a laboratory
4. Search for a laboratory given Its name
5. Show all of the researchers
6. Show all of the laboratories
7. Search for a researcher given Its ID
8. Show all researchers with their laboratory
9. Delete a researcher given Its ID
10. Delete a laboratory given Its name
11. Quit the client

This menu is displayed between each operation performed on each client.
An example of an interaction with the client : 
```
Que voulez-vous faire ?
 1. Ajouter un chercheur
 2. Ajouter un laboratoire
 3. Lier un chercheur à un laboratoire
 4. Chercher un laboratoire par nom
 5. Afficher tous les chercheurs
 6. Afficher tous les laboratoires
 7. Chercher un chercheur par ID
 8. Afficher les chercheurs par laboratoire
 9. Supprimer un chercheur par ID
10. Supprimer un laboratoire par nom
11. Quitter
1
Nom du chercheur : 
Clipet
Prénom : 
Julien
Adding Julien Clipet... 201
OK.
Chercheur ajouté! ID : 1
Que voulez-vous faire ?
 1. Ajouter un chercheur
 2. Ajouter un laboratoire
 3. Lier un chercheur à un laboratoire
 4. Chercher un laboratoire par nom
 5. Afficher tous les chercheurs
 6. Afficher tous les laboratoires
 7. Chercher un chercheur par ID
 8. Afficher les chercheurs par laboratoire
 9. Supprimer un chercheur par ID
10. Supprimer un laboratoire par nom
11. Quitter
1
Nom du chercheur : 
Achour
Prénom : 
Roland
Adding Roland Achour... 201
OK.
Chercheur ajouté! ID : 2
Que voulez-vous faire ?
 1. Ajouter un chercheur
 2. Ajouter un laboratoire
 3. Lier un chercheur à un laboratoire
 4. Chercher un laboratoire par nom
 5. Afficher tous les chercheurs
 6. Afficher tous les laboratoires
 7. Chercher un chercheur par ID
 8. Afficher les chercheurs par laboratoire
 9. Supprimer un chercheur par ID
10. Supprimer un laboratoire par nom
11. Quitter
2
Nom du laboratoire : 
Pontoise
Adding Pontoise... OK.
Que voulez-vous faire ?
 1. Ajouter un chercheur
 2. Ajouter un laboratoire
 3. Lier un chercheur à un laboratoire
 4. Chercher un laboratoire par nom
 5. Afficher tous les chercheurs
 6. Afficher tous les laboratoires
 7. Chercher un chercheur par ID
 8. Afficher les chercheurs par laboratoire
 9. Supprimer un chercheur par ID
10. Supprimer un laboratoire par nom
11. Quitter
5
[ID : 1 | Nom : Julien Clipet, ID : 2 | Nom : Roland Achour]
Que voulez-vous faire ?
 1. Ajouter un chercheur
 2. Ajouter un laboratoire
 3. Lier un chercheur à un laboratoire
 4. Chercher un laboratoire par nom
 5. Afficher tous les chercheurs
 6. Afficher tous les laboratoires
 7. Chercher un chercheur par ID
 8. Afficher les chercheurs par laboratoire
 9. Supprimer un chercheur par ID
10. Supprimer un laboratoire par nom
11. Quitter
3
Nom du laboartoire : 
Pontoise
ID du chercheur : 
2
Linking researcher 2 to laboratory Pontoise
Researcher linked to laboratory !

true
Que voulez-vous faire ?
 1. Ajouter un chercheur
 2. Ajouter un laboratoire
 3. Lier un chercheur à un laboratoire
 4. Chercher un laboratoire par nom
 5. Afficher tous les chercheurs
 6. Afficher tous les laboratoires
 7. Chercher un chercheur par ID
 8. Afficher les chercheurs par laboratoire
 9. Supprimer un chercheur par ID
10. Supprimer un laboratoire par nom
11. Quitter
8
Retrieving all researchers with their laboratory...
[ID: 2 | Nom : Roland Achour | Laboratoire : Pontoise]
```

