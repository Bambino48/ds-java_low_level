package BoucleFor;
// Boucle for infinie en java

/*
 * Une boucle infinie ne se termine jamais à moins que vous ne l’arrêtiez manuellement en appuyant sur CTRL + C. 
 * Pour implémenter une boucle for infinie, utilisez une telle condition qui est toujours vraie ou utilisez 
 * directement true comme condition.
 */

//---------------------------- Exemple : Implémentation d’une boucle for infinie -----------------------------------

/*
 * Dans cet exemple, nous montrons la boucle infinie à l’aide de la boucle for. 
 * Il continuera à imprimer les chiffres jusqu’à ce que vous appuyiez sur ctrl+c pour mettre fin au programme.
 */

public class BoucleForInfinie {

    public static void main(String[] args) {

        int x = 10;

        for (;;) {
            System.out.println("La valeur de x est : " + x);
            x++;
            System.out.println("\n");
        }
    }
}