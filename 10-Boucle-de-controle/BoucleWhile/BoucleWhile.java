package BoucleWhile;
//---------------------------------------- Boucle while -------------------------------------------------------------

/*
 * Une instruction de boucle while dans le langage de programmation Java exécute de manière répétée 
 * un bloc de code tant qu’une condition donnée est vraie.

 * La boucle while est une boucle de contrôle d’entrée, où la condition est vérifiée avant d’exécuter 
 * le corps de la boucle.
 */

/* Syntaxe de la boucle while

 * La syntaxe d’une boucle while est :

while(Boolean_expression) {
   // Statements
}
 */

// Processus d’exécution d’une boucle while
/*
 * Ici, il peut s’agir d’une seule instruction ou d’un bloc d’instructions. 
 * La condition peut être n’importe quelle expression, et true est n’importe quelle valeur non nulle.

 * Lors de l’exécution, si le résultat boolean_expression est vrai, 
 * les actions à l’intérieur de la boucle seront exécutées. 
 * Cela se poursuivra tant que le résultat de l’expression sera vrai.

 * Lorsque la condition devient fausse, le contrôle du programme passe à la ligne qui suit immédiatement la boucle.
 * 
 * Ici, le point clé de la boucle while est que la boucle peut ne jamais s’exécuter. 
 * Lorsque l’expression est testée et que le résultat est false, 
 * le corps de la boucle est ignoré et la première instruction après la boucle while est exécutée.
 */

// Boucle While infinie en Java
/*
 * Vous pouvez implémenter une boucle while infinie à l’aide de 
 * l’instruction while loop en fournissant « true » comme condition de test.
 */

//---------------------------------- Exemples de boucle while ------------------------------------------------------

/* Exemple 1 : Impression de nombres dans une plage à l’aide de la boucle while

 * Dans cet exemple, nous montrons l’utilisation d’une boucle while pour afficher des nombres allant de 10 à 19. 
 * Ici, nous avons initialisé une variable int x avec une valeur de 10. 
 * Ensuite, dans la boucle while, nous vérifions que x est inférieur à 20 et dans la boucle while, 
 * nous imprimons la valeur de x et incrémentons la valeur de x de 1. While s’exécutera jusqu’à ce que x devienne 20. 
 * Une fois que x vaut 20, la boucle arrête l’exécution et le programme se termine.
 */

public class BoucleWhile {
    public static void main(String[] args) {
        int x = 10;

        while (x < 20) {
            System.out.println("La valeur de x est :" + x);
            x++;
            System.out.println("\n");
        }
    }
}