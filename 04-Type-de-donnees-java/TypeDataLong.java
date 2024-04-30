// Type de données long Java :
/*
 * Le type de données long est un entier complémentaire à deux signé de 64 bits.
 * La valeur minimale est -9 223 372 036 854 775 808(-2^63)
 * La valeur maximale est de 9 223 372 036 854 775 807 (inclus) (2 ^ 63 -1)
 * Ce type est utilisé lorsqu'une plage plus large que int est nécessaire
 * La valeur par défaut est 0L
 * Exemple − long a = 100 000 L, long b = -200 000 L
 */

public class TypeDataLong {

    public static void main(String[] args) {

        long longValeur1 = 2L;
        long longValeur2 = 4L;
        long longResultat = longValeur1 + longValeur2;

        System.out.println("Le resultat des valeurs de type long de " + longValeur1 + " et " + longValeur2 + " est : "
                + longResultat);
    }
}