package BoucleFor;

/* Java pour la boucle   
 * Une boucle for est une structure de contrôle de répétition qui vous permet 
 * d’écrire efficacement une boucle qui doit être exécutée un nombre spécifique de fois.

 * Une boucle for est utile lorsque vous savez combien de fois une tâche doit 
 * être répétée. Tout comme la boucle while, la boucle for est également une 
 * boucle de contrôle d’entrée où la condition donnée s’exécute en premier.
 */

// Syntaxe de la boucle for

/* La syntaxe d’une boucle for est :

for(initialization; Boolean_expression; update) {
   // Statements
}
 */

/* Parties de Java de la boucle for :

 * En Java, la boucle for est construite (implémentée) à l’aide de trois parties. 
 * Voici les parties d’une boucle for en Java :

 * Initialisation : Contient la ou les instructions d’initialisation du compteur de boucles.
 * Expression booléenne : contient la condition à tester.
 * Corps : Contient les instructions à itérer jusqu’à ce que l’expression booléenne donnée soit vraie, 
 * également pour mettre à jour le compteur de boucles.
 */

// Processus d’exécution d’une boucle for

/* Voici le flux de contrôle dans une boucle for :

 * L’étape d’initialisation est exécutée en premier, et une seule fois. 
 * Cette étape vous permet de déclarer et d’initialiser toutes les variables de contrôle de boucle et cette étape se termine par un point-virgule (;).

 * Ensuite, l’expression booléenne est évaluée. Si c’est vrai, le corps de la boucle est exécuté. 
 * S’il est faux, le corps de la boucle ne sera pas exécuté et le contrôle passe à l’instruction suivante après la boucle for.

 * Une fois le corps de la boucle for exécuté, le contrôle revient à l’instruction update. 
 * Cette instruction vous permet de mettre à jour toutes les variables de contrôle de boucle. 
 * Cette instruction peut être laissée vide avec un point-virgule à la fin.

 * L’expression booléenne est maintenant évaluée à nouveau. Si c’est vrai, 
 * la boucle s’exécute et le processus se répète (corps de la boucle, puis étape de mise à jour, 
 * puis expression booléenne). Une fois que l’expression booléenne a la valeur false, la boucle for se termine.
*/
//------------------------------------- Exemples de boucles Java for ----------------------------------------------------------------------

/* Exemple 1 : Impression de nombres dans une plage à l’aide de la boucle for

 * Dans cet exemple, nous montrons l’utilisation d’une boucle for pour afficher des nombres allant de 10 à 19. 
 * Ici, nous avons initialisé une variable int x avec une valeur de 10 dans la boucle d’initialisation blook of for. 
 * Ensuite, dans le bloc d’expression, nous vérifions que x est inférieur à 20, et à la fin, sous le bloc de mise à jour, nous incrémentons x de 1. 
 * Dans le corps de la boucle for, nous affichons la valeur de x. La boucle For s’exécutera jusqu’à ce que x devienne 20. 
 * Une fois que x vaut 20, la boucle arrête l’exécution et le programme se termine.
 * 
 */

public class BoucleFor {
    public static void main(String[] args) {

        // Utilisation de la boucle for
        for (int x = 10; x < 20; x += 1) {
            System.out.println("La valeur de x est : " + x);
            System.out.println("\n");
        }

    }
}