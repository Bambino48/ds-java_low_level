package Break;

//---------------------------------- Exemple 2 : Utilisation de la boucle break with for ---------------------------

/*
 * Dans cet exemple, nous montrons l’utilisation d’une instruction break dans une boucle for pour 
 * afficher quelques éléments d’un tableau au lieu de tous les éléments. 
 * Ici, nous créons un tableau d’entiers sous forme de nombres et l’initialisons de quelques valeurs. 
 * Nous avons créé une variable nommée index pour représenter l’index du tableau dans la boucle for, 
 * la vérifier par rapport à la taille du tableau et l’incrémenter de 1. Dans le corps de la boucle for, 
 * nous imprimons l’élément du tableau en utilisant la notation d’index. Une fois que 30 est rencontré comme valeur, 
 * l’instruction break interrompt le flux de la boucle for et le programme se ferme.
 */

public class Exemple2 {

    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == 30) {
                break;
            }
            System.out.println("La valeur de l'index est : " + numbers[index]);
            System.out.println("\n");
        }
    }
}
