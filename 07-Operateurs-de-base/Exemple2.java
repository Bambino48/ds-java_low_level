// Exemple de l'operateur instanceof
/*
 * Dans cet exemple, nous créons un nom de variable String, 
 * puis en utilisant l'opérateur instanceof,
 *  nous vérifions que le nom est String ou non.
 */

public class Exemple2 {
    public static void main(String[] args) {

        String name = "James";

        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println(result);

    }
}
