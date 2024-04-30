// Type de données short Java :
/*
 * Le type de données short est un entier complémentaire à deux signé de 16
 * bits.
 * La valeur minimale est -32 768 (-2^15)
 * La valeur maximale est de 32 767 (inclus) (2^15 -1)
 * Le type de données short peut également être utilisé pour économiser de la
 * mémoire en tant que type de données byte.
 * Un short est 2 fois plus petit qu'un entier
 * La valeur par défaut est 0.
 * Exemple : short s = 10 000, short r = -20 000
 */

public class TypeDataShorts {

    public static void main(String[] args) {

        short shortValeur1 = 2;
        short shortValeur2 = 4;
        short shortResultat = (short) (shortValeur1 + shortValeur2);

        System.out
                .println("Le resultat des valeurs de type short de " + shortValeur1 + " et " + shortValeur2 + " est : "
                        + shortResultat);
    }

}
