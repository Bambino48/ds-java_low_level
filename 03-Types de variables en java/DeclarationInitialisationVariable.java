public class DeclarationInitialisationVariable {

    /*
     * Une variable nous fournit un stockage nommé que nos programmes peuvent
     * manipuler.
     * Chaque variable en Java a un type spécifique,
     * qui détermine la taille et la disposition de la mémoire de la variable ;
     * la plage de valeurs pouvant être stockées dans cette mémoire ;
     */

    // Déclaration et initialisation des variables
    // Model : data type variable [ = value][, variable [ = value] ...] ;

    public static void main(String[] args) {

        /*----- Exemple de déclarations et d'initialisations de variables valides ------*/

        int a, b, c; // Declaration de trois variables int (entier)
        a = 0;
        b = 1;
        c = 3;
        int d = 10, e = 10; // Exemple d'initialisation de variable
        byte B = 22; // Initialisation d'une variable B de type byte\
        double pi = 3.14159; // Declaration et initialisation d'une variable pi de type double
        char f = 'a'; // Variable char est initialise avec la valeur 'a'.

        System.out.println("Valeur de la variable a : " + a);
        System.out.println("Valeur de la variable b : " + b);
        System.out.println("Valeur de la variable c : " + c);
        System.out.println("Valeur de la variable d : " + d);
        System.out.println("Valeur de la variable e : " + e);
        System.out.println("Valeur de la variable B : " + B);
        System.out.println("Valeur de la variable pi : " + pi);
        System.out.println("Valeur de la variable f : " + f);

    }
}
