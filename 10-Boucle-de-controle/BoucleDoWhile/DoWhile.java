package BoucleDoWhile;

//---------------------------------- La boucle do......while ----------------------------------------------

/*
 * Une boucle do while est similaire à une boucle while, 
 * sauf qu’une boucle do while est garantie de s’exécuter au moins une fois.

 * La boucle do-while est une boucle de contrôle de sortie, où la condition est vérifiée 
 * après l’exécution du corps de la boucle.
 */

/* Syntaxe de la boucle do while

* Voici la syntaxe d’un do... while :

do {
   // Statements
}while(Boolean_expression);

 */

/* Processus d’exécution d’une boucle do while :

 * Notez que l’expression booléenne apparaît à la fin de la boucle, 
 * de sorte que les instructions de la boucle s’exécutent une fois avant que la valeur booléenne ne soit testée.

 * Si l’expression booléenne a la valeur true, le contrôle revient à l’instruction do et les instructions de la boucle 
 * s’exécutent à nouveau. Ce processus se répète jusqu’à ce que l’expression booléenne soit fausse.
 */

//-------------------------------- do while Exemples de boucles -----------------------------------------------

/* Exemple 1 : Impression de nombres dans une plage à l’aide de do while :

 * Dans cet exemple, nous montrons l’utilisation d’une boucle while pour afficher des nombres allant de 10 à 19. 
 * Ici, nous avons initialisé une variable int x avec une valeur de 10. 
 * Ensuite, dans la boucle do while, nous vérifions que x est inférieur à 20 après le corps de la boucle do while. 
 * Dans le corps de la boucle do while, nous imprimons la valeur de x et incrémentons la valeur de x de 1. 
 * While s’exécutera jusqu’à ce que x devienne 20. 
 * Une fois que x vaut 20, la boucle arrête l’exécution et le programme se termine.
 */

public class DoWhile {
    public static void main(String[] args) {
        int x = 10;

        do {
            System.out.println("La valeur de x est : " + x);
            x++;
            System.out.println("\n");
        } while (x < 20);
    }

}
