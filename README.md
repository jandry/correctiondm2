Sujet:

Nous allons modéliser un serveur web (classe « ServeurWeb »). 
Ce serveur web permet de « repondre » à des objets « RequeteHttp ». Les « RequeteHttp » ont une méthode « afficher » permettant de la voir sous la forme d’une « String ».
Les « RequeteHttp » sont faites de 3 sous-objets qui sont également « Affichable » :
« Url » avec un attribut « path » de type « String »
« Header » qui contient un attribut « headers » de clé/valeur (String/String)
« Body » qui contient un attribut « content » (String)
Le serveur a une méthode « repondre » prenant en entrée une « RequeteHttp » et renvoyant un entier. Cet entier est « 200 » si tout va bien, 500 si pas bon.
On souhaite interdire l’accès à certaines urls (« /evilurl ») en renvoyant 403 au lieu de 200. On ne touche pas au code du serveur web pour ajouter la fonctionnalité.
 
Quelles design patterns allez-vous utiliser ?
Indiquez les design patterns utilisés à l’aide de commentaires dans le diagramme ci-dessous
Proposer le diagramme UML (en utilisant par exemple PlantUML ou alors une image)
Proposer une implémentation correspondant à votre diagramme et des tests associés
Les tests devront vérifier que :
Retour 200 si pas /evilurl dans le path de « Url »
Retour 403 si /evilurl dans le path de « Url »
Retour 500 si on envoie une requête « null »
Appeler la méthode afficher sur un « RequeteHttp » qui affiche les sous-objets
 
Votre projet doit m’être rendu sous forme de projet git qui compile que je pourrais cloner depuis internet (en utilisant github ou gitlab par exemple).
Je prendrais les commits de vos projets à la date du 19/02/2021.


