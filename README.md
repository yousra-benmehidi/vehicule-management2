# vehicule-management2
Abstract classes and Interfaces

[FR]
Dans cet exercice on va reprendre l’exercice 3 de la série de TP2. On veut transformer la classe Véhicule vers une classe abstraite ainsi que ses méthodes calculPrix(), Afficher() et equals(). Bien-sûr il faut adapter ces méthodes dans les sous classes. Ajoutez après une autre classe appelé «Hélicoptère» comme 
une sous classe de Véhicule qui possède Heure_de_Vol comme attribut.  
- Définissez une interface « Flight » qui sera implémenter dans les deux classes Avion et 
Hélicoptère. Cette interface possède deux méthodes :  
  o CanFly(), qui affiche que l’appareil peut voler 
  o LongDistanceFlight() qui teste si l’appareil peut voler pour des longues distances si ses heures de vol sont inférieur à 1000h.   
- Définissez une autre interface appelé Driving, qui déclare une méthode RoadDriving() qui affiche que le véhicule a la possibilité de se déplacer sur des routes. Cette interface sera implémentée par la classe Voiture.  
- Tester le programme en créant plusieurs objets et en faisant appel à aux différentes méthodes.  
- Après essayez de déclarer un attribut dans l’une des interfaces, qu’est-ce que vous remarquez ?

[EN]
In this exercise we will repeat exercise 3 of the TP2 series. We want to transform the class Vehicle to an abstract class and its methods calculPrix(), Afficher() and equals(). Of course you need adapt these methods in the subclasses. Add after another class called «Helicopter» as a sub-class of Vehicle that has Heure_de_Vol as attribute.
- Define a «Flight» interface that will be implemented in both classes Plane and Helicopter. This interface has two methods:  
  o CanFly(), which displays that the device can fly and,  
  o LongDistanceFlight() which tests if the device can fly for long distances if its hours of flight are less than 1000h.   
- Define another interface called Driving, which declares a RoadDriving() method that shows that the vehicle has the ability to move on roads. This interface will be implemented by the Car class.  
- Test the program by creating several objects and using different methods.  
- After trying to declare an attribute in one of the interfaces, what do you notice? 
