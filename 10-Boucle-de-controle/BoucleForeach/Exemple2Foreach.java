package BoucleForeach;
//---------------------------- Exemple 2 : itération sur une liste de chaînes ------------------------------

/*
 * Dans cet exemple, nous montrons l’utilisation d’une boucle foreach pour afficher le contenu d’une liste de chaînes. 
 * Ici, nous créons un tableau de chaînes de caractères en tant que noms et initialisons quelques valeurs. 
 * Ensuite, à l’aide de la boucle foreach, chaque nom est imprimé.
 */

import java.util.Arrays;
import java.util.List;

public class Exemple2Foreach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");

        for (String name : names) {
            System.out.println(name);
            System.out.println(",");

        }

    }
}