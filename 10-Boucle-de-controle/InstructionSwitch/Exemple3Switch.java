package InstructionSwitch;
/* Exemple 3
 * Dans cet exemple, nous montrons l'utilisation de l'instruction switch où les cas sont basés sur une chaîne. 
 * Nous avons créé une note variable. En fonction de la valeur de la note, chaque cas est vérifié. 
 * si un cas est satisfait et que l'instruction break est présente, les cas suivants ne sont pas vérifiés.
 */

public class Exemple3Switch {
   public static void main(String args[]) {
      String grade = "C";

      switch (grade) {
         case "A":
            System.out.println("Excellent!");
            break;
         case "B":
         case "C":
            System.out.println("Well done");
            break;
         case "D":
            System.out.println("You passed");
         case "F":
            System.out.println("Better try again");
            break;
         default:
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }

}

/*
 * Le mot-clé par défaut
 * Le mot-clé par défaut est utilisé pour spécifier un bloc de code
 * lorsqu’aucune valeur de casse n’est mise en correspondance.
 * Le mot-clé par défaut est facultatif, mais il doit être utilisé dans
 * l’instruction switch case.
 */
