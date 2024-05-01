// 3. Commentaire sur la documentation
/*
 * Les commentaires de la documentation sont utilisés pour rédiger la documentation du code source.
 * Les commentaires de la documentation commencent par une barre oblique suivie de deux astérisques ( /** ), 
 * se terminent par un astérisque suivi d'une barre oblique inverse ( */ 
 /*et toutes les lignes entre le début et la fin doivent commencer par un astérisque ( * ).
 */
/*
 * Les commentaires de la documentation sont compris par 
 * l'outil Javadoc et peuvent être utilisés pour créer une documentation HTML.
 */
// Syntaxe
/**
* line 1
* line 2
...
*/
//--------------------------------------------------------------------------------------------------------

// Exemple 1 : commentaire de la documentation Java
/**
 * This is a documentation comment.
 * This is my first Java program.
 * This will print 'Hello World' as the output
 * This is an example of multi-line comments.
*/
public class CommentaireSurDocumentation {

    /*
     * Le style de commentaire ci-dessus est appelé commentaires de documentation. 
     * Il est utilisé par l'outil Javadoc lors de la création de la documentation du code du programme. 
     * Nous pouvons également donner des détails sur les arguments, 
     * l'exception et le type de retour en utilisant l'annotation suivante dans les commentaires de la documentation.
     */

    /**
 * @param dividend
 * @param divisor
 * @return quotient
 * @throws IllegalArgumentException if divisor is zero
 */
//private double divide(int dividend, int divisor) throws IllegalArgumentException {
//}

// Exemple 2 : commentaire de la documentation Java

/*
 * Le code suivant montre l'utilisation des commentaires de documentation dans un programme simple. 
 * Nous avons défini des commentaires sur la déclaration de classe pour donner des détails sur la classe. 
 * Dans le cas d'une méthode, nous ajoutons les détails des paramètres, 
 * de la valeur de retour et de l'exception générée dans le bloc de documentation de 
 * la section des commentaires de la méthode.
 */

/**
 * This is a documentation comment. 
 * This is my first Java program.
 * This is an example of multi-line comments.
 * We're printing result of divison of two numbers in this program
 */

public static void main(String[] args) {
    CommentaireSurDocumentation program = new CommentaireSurDocumentation();
    double result = program.divide(100, 10);
    //System.out.println(result);
}

/**
    * @param dividend
    * @param divisor
    * @return quotient
    * @throws IllegalArgumentException if divisor is zero
    */

    private double divide(int dividend, int divisor) throws IllegalArgumentException {
        if (divisor == 0) {
        throw new IllegalArgumentException("divisor cannot be zero");
        }
        return (double) dividend / divisor;
    }



}

