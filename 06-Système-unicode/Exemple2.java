public class Exemple2 {
    public static void main(String[] args) {
        // Stockage de caractères Unicode à l’aide de séquences d’échappement
        char letterA = '\u0041';
        char letterSigma = '\u03A3';
        char copyrightSymbol = '\u00A9';
        // Stockage direct des caracteres unicodes
        char letterZ = 'Z';
        char letterOmega = 'Ω';
        char registeredSymbol = '®';
        // Affichage des caracteres unicodes stocke
        System.out.println("Caractères Unicode stockés à l'aide de séquences d’échappement:");
        System.out.println("Lettre A: " + letterA);
        System.out.println("Lettre majuscule grecque Sigma: " + letterSigma);
        System.out.println("Symbole de droit d'auteur: " + copyrightSymbol);
        System.out.println("\nCaractères Unicode stockés directement:");
        System.out.println("Lettre Z: " + letterZ);
        System.out.println("Lettre majuscule grecque Omega: " + letterOmega);
        System.out.println("Symbole enregistré: " + registeredSymbol);
    }
}
