// Exemple 1 : Moulage de type élargi
/*
 * Dans l'exemple ci-dessous, nous avons démontré que nous pouvons obtenir 
 * une erreur lorsque le compilateur tente de convertir un type de données 
 * volumineux en un type de données petit. Ici, nous avons créé l'entier num1 
 * et la variable double num2. La somme de num1 et num2 sera double, et lorsque 
 * nous essayons de la stocker dans la somme du type int, le compilateur renvoie une erreur.
 */

public class Exemple1 {

    public static void main(String[] args) {

        // Declaration des variable
        int num1 = 5004;
        double num2 = 2.5;
        // int sum = num1 + num2; // l'erreur car conversion de int -> double

        // Affiche du resultat dans la console
        System.out.println("La somme de " + num1 + " et de " + num2 + " est : " + "sum");
        // sum est mis entre grife pour annuler le signal de l'editeur.
    }
}