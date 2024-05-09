package InstructionDeCondition;

/* Exemple 2 : instruction Java if… else if… else :

 * Dans cet exemple, nous montrons l'utilisation de l'instruction if...else if...else. 
 * Nous avons créé une variable x et l'avons initialisée à 30,0. 
 * Ensuite, dans l'instruction if, nous vérifions x avec 10,0. Comme si l'instruction était fausse, 
 * le contrôle passe à l'instruction else if vérifiant une autre valeur avec x et ainsi de suite.
 */
public class InstructionIfElseIf2 {
    public static void main(String args[]) {
        double x = 30.0;

        if (x == 10.0) {
            System.out.print("La valeur de X est 10.0");
        } else if (x == 20.0) {
            System.out.print("La valeur de X est 20.0");
        } else if (x == 30.0) {
            System.out.print("La valeur de X est 30.0");
        } else {
            System.out.print("C'est l'instruction else");
        }
    }

}
