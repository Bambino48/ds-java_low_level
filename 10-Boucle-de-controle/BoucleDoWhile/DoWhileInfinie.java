package BoucleDoWhile;

//----------------------------- do while Boucle infinie en Java ----------------------------------------------

/*
 * Une boucle infinie peut également être implémentée en écrivant « true » 
 * comme instruction conditionnelle à l’aide de l’instruction de boucle do do-while en Java.
 */

//------------------------ Exemple : Implémentation d’une boucle do while infinie ----------------------------

/*
 * Dans cet exemple, nous montrons la boucle infinie à l’aide de la boucle while. 
 * Il continuera à imprimer les chiffres jusqu’à ce que vous appuyiez sur ctrl+c pour mettre fin au programme.
 */

public class DoWhileInfinie {
    public static void main(String[] args) {
        int x = 10;

        do {
            System.out.println("La valeur de x est : " + x);
            x++;
            System.out.println("\n");
        } while (true);
    }
}
