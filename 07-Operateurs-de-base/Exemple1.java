// Exemple d'utilisation d'operateur ternaire
/*
 * Dans cet exemple, nous créons deux variables a et b et en utilisant l'opérateur ternaire, 
 * nous avons décidé des valeurs de b et les avons imprimées.
 */

public class Exemple1 {
    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("La valeur de b est : " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("La valeur de b est : " + b);
    }

}
