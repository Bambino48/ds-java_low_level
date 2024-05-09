package BoucleFor;
// Exemple 2 : Impression d’éléments d’un tableau à l’aide de la boucle for

/* 
 * Dans cet exemple, nous montrons l’utilisation d’une boucle for pour afficher le contenu d’un tableau. 
 * Ici, nous créons un tableau d’entiers sous forme de nombres et l’initialisons de quelques valeurs. 
 * Nous avons créé une variable nommée index pour représenter l’index du tableau dans la boucle for, 
 * la vérifier par rapport à la taille du tableau et l’incrémenter de 1. Dans le corps de la boucle for, 
 * nous imprimons l’élément du tableau en utilisant la notation d’index. 
 * Une fois que l’index devient identique à la taille du tableau, la boucle for se termine et le programme se termine.
 */

public class Exemple2For {
    public static void main(String[] args) {
        // Declaraction d'un tableau
        int[] numbers = { 10, 20, 30, 40, 50 };

        // la boucle pour iterer sur un tableau
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("La valeur de l'index est : " + numbers[index]);
            System.out.println("\n");
        }
    }
}