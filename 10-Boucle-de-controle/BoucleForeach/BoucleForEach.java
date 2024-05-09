package BoucleForeach;
// Boucle for each

/*
 * La boucle foreach est une structure de contrôle de répétition spéciale qui vous permet 
 * d’écrire efficacement une boucle qui doit être exécutée un nombre spécifique de fois.

 * La boucle foreach est utile même si vous ne savez pas combien de fois une tâche doit être répétée.
 */
/* Syntaxe
 * Voici la syntaxe de la boucle for améliorée (ou, boucle foreach) :

for(declaration : expression) {
   // Statements
}
 */

/* Processus d’exécution :

 * Déclaration : La variable de bloc nouvellement déclarée est d’un type compatible avec les éléments du tableau auquel vous accédez. 
 * La variable sera disponible dans le bloc for et sa valeur sera la même que celle de l’élément de tableau courant.

 * Expression : S’agit du tableau que vous devez parcourir. 
 * L’expression peut être une variable de tableau ou un appel de méthode qui renvoie un tableau.
 * 
 */
//--------------------------------------------- Exemples --------------------------------------------------------------------------------

/* Exemple 1 : itération sur une liste d’entiers

 * Dans cet exemple, nous montrons l’utilisation d’une boucle foreach pour afficher le contenu d’une liste d’entiers. 
 * Ici, nous créons une liste d’entiers sous forme de nombres et l’initialisons de quelques valeurs. 
 * Ensuite, à l’aide de la boucle foreach, chaque nombre est imprimé.
 */

import java.util.Arrays;
import java.util.List;

public class BoucleForEach {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        for (Integer x : numbers) {
            System.out.println(x);
            System.out.println(";");
        }
    }

}
