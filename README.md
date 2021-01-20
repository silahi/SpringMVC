# SpringMVC 
## Travailler avec spring sans fichiers de configuration ni descripteur de déploiement
## Introduction


## Conteneur Léger ?

Le conteneur de spring est léger car lors du démarrage  il crée, instancie et initialise tous les objets pour former le contexte initial de 
l'application. Ce contexte initial est souvent construit à partir d’une description dans un fichier xml ou par annotation, décrivant les objets à créer, les valeurs initiales et les dépendences entre les objets.

## Injection de dépendence

Les dépendences ou les liens entre les objets sont automatiqument créés à partir de la déscription et non par les objets eux même (par programmation ) :
C'est pour quoi on parle d'injection de dépendence.

## Inversion de contrôle

Le fait d'instancier, initialiser et injecter les dépendences automatiquement grâce aux fichiers de configuration ou aux annotation: ce 
mécanisme est l'inversion de contrôle car ce n'est plus le développeur qui instancie les objets mais le conteneur de spring. 
L'inversion de contrôle va nous permettre de changer le comportement de l'application en modifiant la description xml du conteneur
sans changer les éléments programmés. 

## Spring MVC

Spring MVC est un framwork pour les applications web en suivant le modèle MVC et il est fondé sur le conteneur 
léger de spring.

Dans Spring MVC, le conteneur va servir à créer :
- Le contexte de l'application web
- Les objets traitant les requêtes (les controlleurs)
- Les objets créant les pages html (les vues)
- Les objets des données des formulaires (les commandes)
- Les liens entre la couche métier et la base de données
- Le mapping des URL vers les contrôlleurs
- Le mapping des vues ...

Ici l'inversion de contrôle va nous permettre de changer le comportement de l'application en modifiant la description xml du conteneur
sans changer les éléments programmés. 

## Fonctionnement de Spring MVC

La servlet **DispatcherServlet** (org.springframework.web.servlet.DispatcherServlet) gère l'envoi des requêtes aux controleurs
Le **Contrôleur**  prend en charge la requête et utilise la couche métier pour
donner la réponse. Il fabrique le modèle sous la forme d'une **Map** (java.util.Map) conténant les éléments de la réponse.
Le **Contrôleur** choisit la **Vue** (org.springframework.web.servlet.View) qui sera paramètrée par le **Map** pour donner la page à afficher
