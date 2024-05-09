package BoucleFor;
// Boucle for imbriquée en Java

/*
 * Une boucle for imbriquée est une boucle for contenant une autre boucle for à l’intérieur.
 */

//------------- Exemple : Imprimer des tableaux de 1 à 10 à l’aide d’une boucle for imbriquée ----------------
/*
 * Dans cet exemple, nous imprimons des tableaux des nombres de 1 à 10.
 */

public class BoucleForImbriquee {

    public static void main(String[] args) {

        // Implementing nested for loop
        // Initializing loop counters
        int num = 1;
        int i = 1;

        // outer for loop
        for (num = 1; num <= 10; num++) {
            // inner for loop
            System.out.print("Table of " + num + " is : ");
            for (i = 1; i <= 10; i++) {
                // printing table
                System.out.print(num * i + " ");
            }
            // printing a new line
            System.out.println();
        }
    }
}
