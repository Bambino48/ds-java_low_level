package InstructionDeCondition;
/*Instruction Java if-else-if :

 * L' instruction if...else if...else est utilisée pour exécuter plusieurs blocs de code en fonction des conditions 
 * données (expressions booléennes).
 * Une instruction if peut être suivie d'une instruction facultative else if...else , 
 * ce qui est très utile pour tester diverses conditions en utilisant une seule instruction if...else if .
 */

/* Points à retenir :

 * Lorsque vous utilisez des instructions if-else if-else, il y a quelques points à garder à l'esprit.
 * Un if peut avoir zéro ou un autre et il doit venir après tout autre if.
 * Un if peut avoir zéro à plusieurs autres if et ils doivent venir avant le else.
 * Une fois qu'un else if réussit, aucun des else if ou else restants ne sera testé.
 */

/* Syntaxe de l'instruction if-else-if :

Voici la syntaxe d’une instruction if...else if...else -

if(Boolean_expression 1) {
   // Executes when the Boolean expression 1 is true
}else if(Boolean_expression 2) {
   // Executes when the Boolean expression 2 is true
}else if(Boolean_expression 3) {
   // Executes when the Boolean expression 3 is true
}else {
   // Executes when the none of the above condition is true.
}
 */

/*Exemple 1 : instruction Java if… else if… else

 * Dans cet exemple, nous montrons l'utilisation de l'instruction if...else if...else. 
 * Nous avons créé une variable x et l'avons initialisée à 30. Ensuite, dans l'instruction if, nous vérifions x avec 10. 
 * Comme si l'instruction était fausse, le contrôle passe à l'instruction else if vérifiant une autre valeur avec x et 
 * ainsi de suite.
 * 
 */
public class InstructionIfElseIf {

    public static void main(String args[]) {
        int x = 30;

        if (x == 10) {
            System.out.print("La valeur de X est 10");
        } else if (x == 20) {
            System.out.print("La valeur de X est 20");
        } else if (x == 30) {
            System.out.print("La valeur de X est 30");
        } else {
            System.out.print("C'est l'instruction else");
        }
    }

}
