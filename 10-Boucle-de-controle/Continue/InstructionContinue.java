package Continue;

//---------------------------------- Déclaration Java continue ------------------------------------------

/*
 * L’instruction continue peut être utilisée dans n’importe quelle structure de contrôle de boucle. 
 * Cela permet à la boucle de passer immédiatement à l’itération suivante de la boucle.
 */
/*
 * Dans une boucle for , le mot-clé continue fait passer immédiatement le contrôle à l'instruction update.

 * Dans une boucle while ou do/while , le contrôle passe immédiatement à l'expression booléenne.
 */
/*
 * Syntaxe
 * 
 * La syntaxe d'un continue est une instruction unique dans n'importe quelle boucle :

continue;
 */

//------------------------------------------ Exemples --------------------------------------------------------

/* Exemple 1 : utilisation de la boucle continue avec while

 * Dans cet exemple, nous montrons l'utilisation d'une instruction continue pour ignorer un élément 15 dans 
 * une boucle while utilisée pour imprimer l'élément de 10 à 19. 
 * Ici, nous avons initialisé une variable int x avec une valeur de 10. 
 * Ensuite dans la boucle while, nous vérifions que x est inférieur à 20 et dans la boucle while, 
 * nous imprimons la valeur de x et incrémentons la valeur de x de 1. 
 * La boucle While s'exécutera jusqu'à ce que x devienne 15. 
 * Une fois que x vaut 15, continuez L'instruction sautera la boucle while tout en sautant l'exécution du corps 
 * et la boucle continue.
 */

public class InstructionContinue {
    public static void main(String[] args) {
        int x = 10;

        while (x < 20) {
            x++;
            if (x == 15) {
                continue;
            }
            System.out.println("La valeur de x est : " + x);
            System.out.println("\n");
        }
    }

}
