// Moulage de type rétrécissant :
/*
 * La conversion de type restrictive est également connue sous 
 * le nom de conversion de type explicite ou conversion de type explicite 
 * qui est effectuée manuellement par le programmeur. 
 * Dans la coulée de type rétrécissant, un type plus grand peut être converti en un type plus petit.
 * Lorsqu'un programmeur change le type de variable lors de l'écriture du code. 
 * Nous pouvons utiliser l'opérateur (cast) pour changer le type de la variable. 
 * Par exemple, double en int ou int en double.
 * Syntaxe
 * Vous trouverez ci-dessous la syntaxe permettant de restreindre la conversion de type, 
 * c'est-à-dire de convertir manuellement le type :
 * double doubleNum = (double) num;
 * L'instruction de code ci-dessus convertira la variable en type double.
 */

public class NarrowingTypeCasting {

    // Exemple : moulage de type rétrécissant
    /*
     * Dans l'exemple ci-dessous, nous définissons la variable num de type entier et
     * l'initialisons
     * avec la valeur. De plus, nous définissons la variable doubleNum de type
     * double et stockons
     * la valeur de la variable num après l'avoir convertie en double.
     * Ensuite, nous avons créé la variable de type entier 'convertedInt' et stocké
     * la valeur double après la conversion de type en int. Dans la sortie,
     * vnous pouvons observer la valeur des variables double et int.
     */

    public static void main(String[] args) {

        // declaration de la variable int
        int num = 5004;
        // Conversion du type int en type double
        double doubleNum = (double) num;
        // Affichage
        System.out.println(" La valeur de " + num + " apres conversion du type en double est : " + doubleNum);
        // Resultat : La valeur de 5004 apres conversion du type en double est : 5004.0

        // Conversion du type double en type int
        int convertedInt = (int) doubleNum;
        // Affichage
        System.out.println("La valeur de " + doubleNum + " apres conversion du type en int est " + convertedInt);
        // Resultat : La valeur de 5004.0 apres conversion du type en int est 5004
    }
}
