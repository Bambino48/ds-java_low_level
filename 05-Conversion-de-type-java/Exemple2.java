// Exemple 2 : Moulage de type élargi
/*
 * Dans l'exemple ci-dessous, nous avons créé les variables 
 * num1 et num2 comme dans le premier exemple. Nous stockons 
 * la somme des deux nombres dans la variable somme de type double. 
 * En sortie, nous pouvons observer la somme de type double.
 */

public class Exemple2 {

    public static void main(String[] args) {

        // Declaration des variable
        int num1 = 5004;
        double num2 = 2.5;
        double sum = num1 + num2; // conversion de double vers int

        // Affiche du resultat dans la console
        System.out.println("La somme de " + num1 + " et de " + num2 + " est : " + sum);
        // resultat : La somme de 5004 et de 2.5 est : 5006.5

    }

}
