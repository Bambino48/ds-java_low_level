package Break;

//-------------------------------------- Déclaration Java break ----------------------------------------------

/* L’instruction break dans le langage de programmation Java a deux utilisations suivantes :

 * Lorsque l’instruction break est rencontrée à l’intérieur d’une boucle, 
 * la boucle est *immédiatement terminée et le contrôle du programme reprend à l’instruction suivante suivant la boucle.

 * Il peut être utilisé pour mettre fin à un cas dans l’instruction switch (traitée dans le chapitre suivant).
 */

/* Syntaxe
 * La syntaxe d’une rupture est une instruction unique à l’intérieur d’une boucle ou d’un cas de commutation :

break;

 */

//----------------------------------------------- Exemples --------------------------------------------------

/* Exemple 1 : Utilisation de la boucle break with while :

 * Dans cet exemple, nous montrons l’utilisation d’une instruction break pour casser une boucle while 
 * afin d’afficher des nombres allant de 10 à 14, ce qui affichera autrement l’élément jusqu’à 19. 
 * Ici, nous avons initialisé une variable int x avec une valeur de 10. Ensuite, dans la boucle while, 
 * nous vérifions que x est inférieur à 20 et dans la boucle while, nous imprimons la valeur de x et 
 * incrémentons la valeur de x de 1. While s’exécutera jusqu’à ce que x devienne 15. 
 * Une fois que x vaut 15, l’instruction break interrompt la boucle while et le programme se termine.

 */

public class InstructionBreak {
    public static void main(String[] args) {
        int x = 10;

        while (x < 20) {
            if (x == 15) {
                break;
            }
            System.out.println("La valeur de x : " + x);
            x++;
            System.out.println("\n");
        }
    }

}
