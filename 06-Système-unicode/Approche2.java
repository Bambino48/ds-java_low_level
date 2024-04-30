// 2. Stockage direct des valeurs Unicode 
/*
 * Alternativement, vous pouvez stocker directement un caractère Unicode dans 
 * une variable char en plaçant le caractère entre guillemets simples. Toutefois, 
 * cette approche peut ne pas être réalisable pour les caractères qui ne peuvent pas 
 * être saisis directement à l'aide d'un clavier ou qui ne sont pas visibles, 
 * tels que les caractères de contrôle.
 */

public class Approche2 {

    // Exemple 1 : attribution d'un caractère Unicode à une variable

    public static void main(String[] args) {

        // Stockage direct du caractere unicode
        char unicodeChar = 'A';
        // Stockage direct du caractere 'A'
        System.out.println("Caractere unicode stocke : " + unicodeChar);
    }

}
