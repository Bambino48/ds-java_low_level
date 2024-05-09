package InstructionSwitch;
/* Exemple 2
 * Dans cet exemple, nous montrons l'utilisation de l'instruction switch où les cas sont basés sur un int. 
 * Nous avons créé une note variable. En fonction de la valeur de la note, chaque cas est vérifié. 
 * si un cas est satisfait et que l'instruction break est présente, les cas suivants ne sont pas vérifiés.
 */

public class Exemple2Switch {
    public static void main(String args[]) {
        int grade = 3;

        switch (grade) {
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
            case 3:
                System.out.println("Well done");
                break;
            case 4:
                System.out.println("You passed");
            case 5:
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}