package BoucleDoWhile;

//-------------------------- Exemple 2 : Impression d’éléments d’un tableau à l’aide de do while -------------------

/*
 * Dans cet exemple, nous montrons l’utilisation d’une boucle do while pour afficher le contenu d’un tableau. 
 * Ici, nous créons un tableau d’entiers sous forme de nombres et l’initialisons de quelques valeurs. 
 * Nous avons créé une variable nommée index pour représenter l’index du tableau lors de son itération. 
 * Dans la boucle do while, nous vérifions que l’index est inférieur à la taille du tableau après le corps de 
 * la boucle et nous avons imprimé l’élément du tableau en utilisant la notation d’index. Dans le corps de la boucle, 
 * la variable d’index est incrémentée de 1 et la boucle continue jusqu’à ce que l’index devienne le siège 
 * du tableau et que la boucle se termine.
 */
public class Exemple2DoWhile {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int index = 0;

        do {
            System.out.println("La valeur de l'index est : " + numbers[index]);
            index++;
            System.out.println("\n");
        } while (index < 5);
    }
}
