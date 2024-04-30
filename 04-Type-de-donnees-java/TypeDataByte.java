// Type de données byte Java :
/* 
Le type de données byte est un entier signé en complément à deux de 8 bits.
La valeur minimale est -128 (-2^7)
La valeur maximale est 127 (inclus)(2^7 -1)
La valeur par défaut est 0
Le type de données Byte est utilisé pour économiser de l'espace dans les grands tableaux, 
principalement à la place des entiers, puisqu'un octet est quatre fois plus petit qu'un entier.
Exemple : byte a = 100, byte b = -50 
*/

public class TypeDataByte {

    public static void main(String[] args) {

        byte byteValeur1 = 2;
        byte byteValeur2 = 4;
        byte byteResultat = (byte) (byteValeur1 + byteValeur2);

        System.out.println("Le resultat des valeurs de type byte de " + byteValeur1 + " et " + byteValeur2 + " est : "
                + byteResultat);
    }
}