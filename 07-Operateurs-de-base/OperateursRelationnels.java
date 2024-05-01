// Les opérateurs relationnels
/*
 * Il existe les opérateurs relationnels suivants pris en charge par le langage Java.
 */

public class OperateursRelationnels {
    public static void main(String[] args) {

        // == (égal à) -> Vérifie si les valeurs de deux opérandes sont égales ou non,
        // si oui, la condition devient vraie.
        int a = 10, b = 20;
        if (a == b) {
            System.out.println("Vrai");
        } else {
            System.out.println("Faux");
        }

        // != (différent de) -> Vérifie si les valeurs de deux opérandes sont égales ou
        // non,
        // si les valeurs ne sont pas égales, la condition devient vraie.
        if (a != b) {
            System.out.println("Vrai");
        } else {
            System.out.println("Faux");
        }

        // > (supérieur à) -> Vérifie si la valeur de l'opérande gauche est supérieure à
        // la valeur de l'opérande droit, si oui, la condition devient vraie.
        if (a > b) {
            System.out.println("Vrai");
        } else {
            System.out.println("Faux");
        }

        // < (Inférieur à) -> Vérifie si la valeur de l'opérande gauche est inférieure à
        // la valeur de l'opérande droit, si oui, la condition devient vraie.
        if (a < b) {
            System.out.println("Vrai");
        } else {
            System.out.println("Faux");
        }

        // >= (supérieur ou égal à) -> Vérifie si la valeur de l'opérande gauche est
        // supérieure ou égale
        // à la valeur de l'opérande droit, si oui, la condition devient vraie.
        if (a >= b) {
            System.out.println("Vrai");
        } else {
            System.out.println("Faux");
        }

        // <= (inférieur ou égal à) -> Vérifie si la valeur de l'opérande gauche est
        // inférieure ou égale
        // à la valeur de l'opérande droit, si oui, la condition devient vraie.
        if (a <= b) {
            System.out.println("Vrai");
        } else {
            System.out.println("Faux");
        }

    }
}
