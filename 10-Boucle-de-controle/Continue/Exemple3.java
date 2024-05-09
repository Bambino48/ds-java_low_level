package Continue;

//--------------------------------- Exemple 3 : Utilisation de continue avec la boucle do while -----------------

/*
 * Dans cet exemple, nous montrons l'utilisation d'une instruction continue pour ignorer un élément 15 dans 
 * une boucle do while qui est utilisée pour imprimer l'élément de 10 à 19. 
 * Ici, nous avons initialisé une variable int x avec une valeur de 10. 
 * Ensuite, dans la boucle do while, nous vérifions que x est inférieur à 20 après le corps et dans la boucle while, 
 * nous imprimons la valeur de x et incrémentons la valeur de x de 1. 
 * La boucle While s'exécutera jusqu'à ce que x devienne 15. Une fois x est 15, 
 * l'instruction continue sautera la boucle while tout en sautant l'exécution du corps et la boucle continue.
 */
public class Exemple3 {
    public static void main(String[] args) {
        int x = 10;

        do {
            x++;
            if (x == 15) {
                continue;
            }
            System.out.println("La valeur de x est : " + x);
            System.out.println("\n");
        } while (x < 20);
    }

}
