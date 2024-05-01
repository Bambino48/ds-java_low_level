// 2. Commentaire multiligne
// Les commentaires multilignes (ou sur plusieurs lignes) commencent par une barre oblique 
// suivie d'un astérisque ( /* ) et se terminent par un astérisque suivi d'une barre oblique 
// ( */ ) et ils sont utilisés pour ajouter un commentaire sur plusieurs lignes.

/*
 * Les commentaires multilignes sont très utiles lorsque l'on souhaite mettre 
 * un long commentaire s'étalant sur plusieurs lignes ou commenter le code complet.
 */

// Syntaxe:
// Considérez la syntaxe ci-dessous pour écrire un commentaire multiligne en Java :

/*
 * Commentaires multilignes
 * ligne1
 * ligne2
 */
//-----------------------------------------------------------------------------------------------------------
// Exemple 1 : commentaire multiligne Java
/* This is an example 
of 
multi line comment. */

/* if (dividend == 0) {
throw new IllegalArgumentException("dividend cannot be zero");
} */
//--------------------------------------------------------------------------------------------------------
// Exemple 2 : commentaire multiligne Java
/*
 *Le code suivant montre l'utilisation de plusieurs commentaires dans un programme simple. 
Nous avons commenté le code supplémentaire d'une méthode utilisant les commentaires multilignes. 
 */
public class CommentairesMultiligne {
    public static void main(String[] args) {
    
        CommentairesMultiligne program = new CommentairesMultiligne();
        double result = program.divide(100, 10);
        //System.out.println(result);

    }

    private double divide(int dividend, int divisor) throws IllegalArgumentException {
        if (divisor == 0) {
        throw new IllegalArgumentException("divisor cannot be zero");
        }
        /* if (dividend == 0) {
        throw new IllegalArgumentException("dividend cannot be zero");
        } */
        return (double) dividend / divisor;
    }

}
