// Type de données double Java :
/*
 * le type de données double est une virgule flottante IEEE 754 64 bits double
 * précision
 * Ce type de données est généralement utilisé comme type de données par défaut
 * pour les valeurs décimales, généralement le choix par défaut
 * Le type de données double ne doit jamais être utilisé pour des valeurs
 * précises telles que la devise
 * La valeur par défaut est 0.0d
 * Exemple : double d1 = 123.4
 */

public class TypeDataDouble {

    public static void main(String[] args) {

        double doubleValeur1 = 2.0d;
        double doubleValeur2 = 4.0d;
        double doubleResultat = doubleValeur1 + doubleValeur2;

        System.out.println("Le resultat des valeurs de type double de " + doubleValeur1 + " et " + doubleValeur2
                + " est : " + doubleResultat);
    }

}
