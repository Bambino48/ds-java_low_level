// Exemple 3 : attribution de caractères et de valeurs Unicode à des variables
/*
 * Cet exemple montre comment manipuler les caractères Unicode stockés. 
 * Il calcule la différence entre la lettre majuscule « A » et la lettre 
 * minuscule « a » et utilise cette différence pour calculer la lettre majuscule « C ». 
 * Il calcule ensuite la lettre minuscule « c » en ajoutant 32 au point de code Unicode 
 * de la lettre majuscule « C ». Les caractères Unicode manipulés sont imprimés sur la console.
 */

public class Exemple3 {

    public static void main(String[] args) {
        // Stockage de caractères Unicode à l’aide de séquences d’échappement
        char letterA = '\u0041';
        char letterSmallA = '\u0061';
        // Stockage direct des caractères Unicode
        char letterB = 'B';

        // Manipulation des caractères Unicode stockés
        int difference = letterA - letterSmallA;
        char letterC = (char) (letterB + difference);
        char letterSmallC = (char) (letterC + 32);
        // Impression des caractères Unicode manipulés
        System.out.println("Caractères Unicode manipulés:");
        System.out.println("Différence entre A et a: " + difference);
        System.out.println("Lettre C calculée: " + letterC);
        System.out.println("Lettre c calculée: " + letterSmallC);
    }
}
