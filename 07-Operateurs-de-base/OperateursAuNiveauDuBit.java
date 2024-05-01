// Les opérateurs au niveau du bit
/*
 * Java définit plusieurs opérateurs au niveau du bit, 
 * qui peuvent être appliqués aux types entiers, long, int, short, char et byte.
 */
/*
 * L'opérateur bit à bit fonctionne sur les bits et effectue des opérations bit par bit. 
 * Supposons que a = 60 et b = 13 ; maintenant au format binaire, ils seront les suivants :
 */
/*
 * a = 0011 1100
 * b = 0000 1101
 * a&b = 0000 1100
 * a|b = 0011 1101
 * a^b = 0011 0001
 * ~a  = 1100 0011
 */

public class OperateursAuNiveauDuBit {
    public static void main(String[] args) {

        int A = 60, B = 13;

        // & (au niveau du bit et) -> L'opérateur binaire AND copie un peu le résultat
        // s'il existe dans les deux opérandes.
        int C = A & B;
        System.out.println("C = " + C);

        // | (au niveau du bit ou) -> L'opérateur binaire OU copie un bit s'il existe
        // dans l'un ou l'autre des opérandes.
        int D = A | B;
        System.out.println("D = " + D);

        // ^ (XOR au niveau du bit) -> L'opérateur binaire XOR copie le bit s'il est
        // défini dans
        // un opérande mais pas dans les deux.
        int E = A ^ B;
        System.out.println("E = " + E);

        // ⁓ (compliment au niveau du bit) -> L'opérateur de complément à 1 binaire est
        // unaire et a pour effet de
        // « retourner » les bits.
        int F = ~A;
        System.out.println("F = " + F);

        // << (décalage à gauche) -> Opérateur de décalage binaire vers la gauche.
        // La valeur de l'opérande de gauche est déplacée vers la gauche du nombre de
        // bits spécifié par
        // l'opérande de droite.
        int G = A << 2;
        System.out.println("G = " + G);

        // >> (décalage à droite) -> Opérateur de décalage binaire vers la droite.
        // La valeur de l'opérande de gauche est déplacée vers la droite du nombre de
        // bits spécifié par
        // l'opérande de droite.
        int H = A >> 2;
        System.out.println("H = " + H);

        // >>> (zéro remplissage vers la droite) -> Décaler l'opérateur de remplissage
        // zéro vers la droite.
        // La valeur de l'opérande de gauche est déplacée vers la droite du nombre de
        // bits spécifié par
        // l'opérande de droite et les valeurs décalées sont remplies de zéros.
        int I = A >>> 2;
        System.out.println("I = " + I);
    }
}
