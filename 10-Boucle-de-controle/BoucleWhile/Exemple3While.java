package BoucleWhile;
//------------------------------ Exemple 3 : Implémentation d’une boucle while imbriquée -------------------------

/*
 * Dans cet exemple, nous montrons la boucle infinie à l’aide de la boucle while. 
 * Il continuera à imprimer les chiffres jusqu’à ce que vous appuyiez sur ctrl+c pour mettre fin au programme.
 */

public class Exemple3While {
    public static void main(String[] args) {
        int x = 10;

        while (true) {
            System.out.println("La valeur de x est : " + x);
            x++;
            System.out.println("\n");
        }
    }
}