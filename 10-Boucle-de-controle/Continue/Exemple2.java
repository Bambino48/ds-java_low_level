package Continue;
//------------------------------ Exemple 2 : Utilisation de continuer avec la boucle for ------------------------

/*
 * Dans cet exemple, nous montrons l'utilisation d'une instruction continue dans une boucle for pour 
 * ignorer un élément d'un tableau à imprimer. 
 * Ici, nous créons un tableau d'entiers sous forme de nombres et initialisons quelques valeurs. 
 * Nous avons créé une variable nommée index pour représenter l'index du tableau dans la boucle for, 
 * la vérifions par rapport à la taille du tableau et l'avons incrémentée de 1. 
 * Dans le corps de la boucle for, nous imprimons l'élément du tableau en utilisant la notation d'index. 
 * Une fois que 30 est rencontré comme valeur, 
 * l'instruction continue passe à la section de mise à jour de la boucle for et la boucle continue.
 */

public class Exemple2 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == 30) {
                continue;
            }
            System.out.println("La valeur de x est : " + numbers[index]);
            System.out.println("\n");
        }

    }
}