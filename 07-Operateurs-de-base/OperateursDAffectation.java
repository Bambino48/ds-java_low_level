// Les opérateurs d'affectation

public class OperateursDAffectation {

    public static void main(String[] args) {

        // = Opérateur d'affectation simple.
        // Attribue des valeurs des opérandes du côté droit à l’opérande du côté gauche.
        int a = 23;
        int b = 12;
        int c = a + b;
        System.out.println(c);

        // += Ajouter un opérateur d’affectation AND.
        // Il ajoute l'opérande droit à l'opérande gauche et attribue le résultat à
        // l'opérande gauche.
        int d = 6;
        c += d;
        System.out.println(c);

        // -= Opérateur de soustraction ET d’affectation.
        // Il soustrait l'opérande droit de l'opérande gauche et attribue le résultat à
        // l'opérande gauche.
        int e = 15;
        d -= e;
        System.out.println(d);

        // *= Opérateur de multiplication ET d’affectation.
        // Il multiplie l'opérande droit par l'opérande gauche et attribue le résultat à
        // l'opérande gauche.
        int f = 2;
        e *= f;
        System.out.println(e);

        // /= Opérateur de division ET d’affectation.
        // Il divise l'opérande gauche avec l'opérande droit et attribue le résultat à
        // l'opérande gauche.
        int g = 6;
        e /= g;
        System.out.println(e);

        // %= Opérateur d’affectation module ET.
        // Il prend un module en utilisant deux opérandes et attribue le résultat à
        // l'opérande de gauche.
        int h = 4;
        e %= h;
        System.out.println(e);

        // <<= Opérateur de décalage à gauche ET d’affectation.
        System.out.println(e <<= 2);

        // >>= Opérateur de décalage à droite ET d'affectation.
        System.out.println(e >>= 2);

        // &= Opérateur d'affectation ET au niveau du bit.
        System.out.println(e &= 2);

        // ^= Opérateur OU exclusif au niveau du bit et affectation.
        System.out.println(e ^= 2);

        // |= Opérateur OR inclusif au niveau du bit et affectation.
        System.out.println(e |= 2);
    }

}
