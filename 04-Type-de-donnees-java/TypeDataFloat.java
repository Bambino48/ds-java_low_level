// Type de données float Java :
/*
 * Le type de données Float est une virgule flottante IEEE 754 32 bits simple
 * précision.
 * Float est principalement utilisé pour économiser de la mémoire dans de grands
 * tableaux de nombres à virgule flottante
 * La valeur par défaut est 0.0f
 * Le type de données Float n'est jamais utilisé pour des valeurs précises
 * telles que la devise
 * Exemple : float f1 = 234.5f
 */

public class TypeDataFloat {

    public static void main(String[] args) {

        float floatValeur1 = 2.0f;
        float floatValeur2 = 4.0f;
        float floatResultat = floatValeur1 + floatValeur2;

        System.out
                .println("Le resultat des valeurs de type float de " + floatValeur1 + " et " + floatValeur2 + " est : "
                        + floatResultat);
    }

}
