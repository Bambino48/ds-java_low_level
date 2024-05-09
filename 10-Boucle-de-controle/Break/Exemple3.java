package Break;

//---------------------------------- Exemple 3 : Utilisation de break avec une boucle infinie -----------------------

/*
 * Dans cet exemple, nous montrons l’utilisation de l’instruction break pour casser une boucle infinie 
 * à l’aide de la boucle while. 
 * Il continuera à imprimer les nombres jusqu’à ce que la valeur de x devienne 15.
 */

public class Exemple3 {
    public static void main(String[] args) {
        int x = 10;

        while (true) {
            System.out.println("La valeur de x est : " + x);
            x++;
            if (x == 15) {
                break;
            }
            System.out.println("\n");
        }
    }

}
