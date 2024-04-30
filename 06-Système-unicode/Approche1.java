// 1. Utilisation des séquences d'échappement Unicode :
/*
 * Une façon de stocker des caractères Unicode en Java consiste à utiliser 
 * des séquences d'échappement Unicode. Une séquence d'échappement est 
 * une série de caractères qui représentent un caractère spécial. 
 * En Java, une séquence d'échappement Unicode commence par les caractères 
 *  \ u(separer a cause de l'editeur) suivis de quatre chiffres hexadécimaux qui représentent 
 * le point de code Unicode du caractère souhaité.
 */

public class Approche1 {

    // Exemple : utilisation de séquences d'échappement Unicode

    public static void main(String[] args) {

        // Séquence d’échappement Unicode

        char unicodeChar = '\u0041';

        // Point pour 'A'

        System.out.println("Caractère Unicode stocké : " + unicodeChar);
        // Resulta : Caractère Unicode stocké : A

    }

}
