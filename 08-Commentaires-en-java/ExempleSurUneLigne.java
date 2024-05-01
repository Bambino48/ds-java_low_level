// Exemple 2 : commentaire Java sur une seule ligne
/*
 * Le code suivant montre l'utilisation de commentaires sur une seule ligne dans un programme simple. 
 * Nous avons ajouté des commentaires aux lignes de code pour expliquer leur objectif.
 */

public class ExempleSurUneLigne {

    public static void main(String[] args) {
        
        ExempleSurUneLigne exemple = new ExempleSurUneLigne();
        double resultat = exemple.divide(100,10);
        //System.out.println(resultat);
    }

    private double divide(int dividend, int divisor) throws IllegalArgumentException {
        // if divisor is 0 throw an exception
        if (divisor == 0) {
        throw new IllegalArgumentException("divisor cannot be zero");
        }
        return (double) dividend / divisor; // returns the result of the division as double
    }
    
}
