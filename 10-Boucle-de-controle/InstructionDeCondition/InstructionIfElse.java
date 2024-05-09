package InstructionDeCondition;
/*
 * En Java , l' instruction if else est utilisée pour exécuter deux blocs de code en fonction de la condition donnée. 
 * Une  instruction Java  if s'exécute lorsque l'expression booléenne de l'instruction if est vraie. 
 * Une instruction if peut être suivie d'une  instruction else facultative  , qui s'exécute lorsque 
 * l'expression booléenne est fausse.
 */

/*
 * Syntaxe de l'instruction if-else en Java
Voici la syntaxe d'une instruction if...else :

if(Boolean_expression) {
   // Executes when the Boolean expression is true
}else {
   // Executes when the Boolean expression is false
}

Si l'expression booléenne est évaluée à vrai, alors le bloc de code if sera exécuté, 
sinon le bloc de code else sera exécuté.
 */

/* Exemple : instruction Java if else
 * Dans cet exemple, nous montrons l'utilisation de l'instruction if else. 
 * Nous avons créé une variable x et l'avons initialisée à 30. 
 * Ensuite, dans l'instruction if, nous vérifions x avec 20. 
 * Comme si l'instruction était fausse, l'instruction dans le bloc else est exécutée.
 */
public class InstructionIfElse {

    public static void main(String args[]) {
        int x = 30;

        if (x < 20) {
            System.out.print("C'est l'instruction if");
        } else {
            System.out.print("C'est l'instruction else");
        }
    }

}
