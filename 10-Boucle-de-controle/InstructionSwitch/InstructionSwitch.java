package InstructionSwitch;
/* Déclaration du commutateur Java :

 * L' instruction Java switch permet de tester l'égalité d' une variable par rapport à une liste de valeurs. 
 * Chaque valeur est appelée un cas et la variable activée est vérifiée pour chaque cas.

 * L' instruction switch peut être utilisée lorsque plusieurs instructions if-else sont requises. 
 * Il peut avoir plusieurs blocs de code avec les valeurs de cas et exécute l'un des nombreux blocs 
 * de code en fonction de la valeur de cas correspondante.
 */

/* Syntaxe
La syntaxe de l'instruction Java switch est :

switch(expression) {
case value :
      // Instructions
      break; // optional
case value :
      // Instructions
      break; // optional
   // You can have any number of case statements.
   default : // Optional
      // Instructions
} 
 */

/* Règles

Les règles suivantes s'appliquent à une instruction switch :

 * - La variable utilisée dans une instruction switch ne peut être que des entiers, des entiers convertibles 
 * (octet, short, char), des chaînes et des énumérations.

 * - Vous pouvez avoir n’importe quel nombre d’instructions case dans un commutateur. 
 * Chaque cas est suivi de la valeur à comparer et de deux points.

 * -La valeur d'un cas doit être du même type de données que la variable du commutateur et 
 * doit être une constante ou un littéral.

 * Lorsque la variable activée est égale à un cas, les instructions suivant ce cas s'exécuteront jusqu'à ce 
 * qu'une instruction break soit atteinte.

 * Lorsqu'une instruction break est atteinte, le switch se termine et le flux de contrôle passe à la ligne 
 * suivante suivant l'instruction switch.

 * Tous les cas ne doivent pas nécessairement contenir une pause. 
 * Si aucune rupture n’apparaît, le flux de contrôle passera aux cas suivants jusqu’à ce qu’une rupture soit atteinte.

 * Une instruction switch peut avoir un cas par défaut facultatif, qui doit apparaître à la fin du switch. 
 * Le cas par défaut peut être utilisé pour effectuer une tâche lorsqu'aucun des cas n'est vrai. 
 * Aucune pause n'est nécessaire dans le cas par défaut.
 */

/* Exemples

 * Exemple 1
 * Dans cet exemple, nous montrons l'utilisation de l'instruction switch où les cas sont basés sur un caractère. 
 * Nous avons créé une note variable. En fonction de la valeur de la note, chaque cas est vérifié. 
 * si un cas est satisfait et que l'instruction break est présente, les cas suivants ne sont pas vérifiés.
  */

public class InstructionSwitch {
    public static void main(String args[]) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
