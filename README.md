# Examen de Developpement d'application mobile

La thématique  traitée dans ce travail est du domaine de la 
recherche d'emploi. le but est de faciliter à un demandeur 
d'emploi une interface d’accès pour voir les offres d'emplois 
postées et la notification d'offres suivant les catégories concernées. 
Dans le dispositif qui mis en place les accès essentiels sont: 
•Une Présentation du système avec un bouton qui redirige vers la 
page de visuaisation des CV 
•Une Page de Visualisation (ListView) des CV enrégistrés dans la 
base MySQL avec Spring boot.

## Creation de la base de donnée avec Spring boot

![image](https://user-images.githubusercontent.com/124637366/234699972-e1ec6b53-ca09-43cf-9100-da8e0badae73.png)

## Creation de la table CV avec IntellJ
![image](https://user-images.githubusercontent.com/124637366/234701609-36440289-9c0d-4756-8b52-69cda8fb629b.png)

## Contenu de la base de données sur XAMPP

![image](https://user-images.githubusercontent.com/124637366/234702546-82845686-f32c-4507-af39-0d995c6873fb.png)

## Page d'acceuil de l'application android

![image](https://user-images.githubusercontent.com/124637366/234712512-37ae41c2-f0b0-406a-80cd-f27ac73f5aef.png)

## Visualisation des offres d'emplois
 ### 1. Cliquer sur le bouton "OFFRE EMPLOI"
En cliquant sur le bouton offre d'emploi on obtient les catégories d'offres suivantes :
- TELECOM
- SANTE
- DEVELOPPEMENT
- INTELLIGENCE ARTIFICIELLE

![image](https://user-images.githubusercontent.com/124637366/234712888-8acb53be-3b38-4599-89ff-fc4993289fea.png)

 ### 2. Cliquer sur une catégories d'offre
 Cela permet de voir les differnets offres de cette catégories

![image](https://user-images.githubusercontent.com/124637366/234713161-556c12a5-2cb5-40e9-aab0-0078e34ee7a8.png)

 ### 3. Cliquer sur un offre pour le selectionner et voir sa description
 
 ![image](https://user-images.githubusercontent.com/124637366/234715382-107e9995-fe3d-4a59-b53a-0b52dcd2b613.png)
 
 ## Enregistrer votre CV dans la base de données ou postuler à un offre
 ### 1. Cliquer sur le bouton "POSTULER"
 Cela vous offre un formulaire vous permettant de créer votre CV. Remplisez les différent champs du formulaire.
 
 ![image](https://user-images.githubusercontent.com/124637366/234716866-f64b49a6-6474-42a1-98e3-0ddf6292f084.png)
 
 ### 2. cliquer sur le bouton "VALIDER" 
 Le clique sur le bouton "VALIDER" permet d'enregistrer votre CV dans la base de données.
 
 ## Visualisation des CV
 Pour visualiser les CV il faut d'abord enregistrer ton CV dans la base de données en postulant à un offre.
 ### 1. Cliquer sur le bouton "VISUALISATION CV"
 Saissez l'adresse mail present sur votre CV
 
 ![image](https://user-images.githubusercontent.com/124637366/234718424-076f23c4-9d77-45fa-a9fc-60dcd97e051a.png)

  ### 2. cliquer sur le bouton "VISUALISER"
  Cela permet d'acceder au contenu de la base de donnée si votre CV est enregistré dans la base.
  
 ![image](https://user-images.githubusercontent.com/124637366/234717583-65bdf7e3-bd84-4c34-ad2f-71bd779e2717.png)


 NB : Le Bouton "RETOUR" permet d'acceder à la page précédente




