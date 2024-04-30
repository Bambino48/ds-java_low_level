// Type de données Java int :
/*
 * Le type de données Int est un entier complémentaire à deux signé de 32 bits.
 * La valeur minimale est - 2 147 483 648 (-2 ^ 31)
 * La valeur maximale est de 2 147 483 647 (inclus) (2 ^ 31 -1)
 * Integer est généralement utilisé comme type de données par défaut pour les
 * valeurs intégrales, sauf en cas de problème de mémoire.
 * La valeur par défaut est 0
 * Exemple - int a = 100 000, int b = -200 000
 */

public class TypeDataInt {

    public static void main(String[] args) {

        int intValeur1 = 2;
        int intValeur2 = 4;
        int intResultat = intValeur1 + intValeur2;

        System.out.println("Le resultat des valeurs de type int de " + intValeur1 + " et " + intValeur2 + " est : "
                + intResultat);
    }
}
