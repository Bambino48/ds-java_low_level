// Les opérateurs arithmétiques
/*
 * Les opérateurs arithmétiques sont utilisés dans 
 * les expressions mathématiques de la même manière qu’ils le sont en algèbre.
 */

public class OperateursArithmetiques {
    public static void main(String[] args) {

        // + (Ajout) -> Ajoute des valeurs de chaque côté de l'opérateur.
        int a = 10, b = 20;
        int Addition = a + b;
        System.out.println("La somme de (a + b) est : " + Addition);

        // - (Soustraction) -> Soustrait l’opérande de droite de l’opérande de gauche.
        int c = 10, d = 20;
        int Soustraction = c - d;
        System.out.println("La soustraction de (c - d) est: " + Soustraction);

        // * (Multiplications) -> Multiplie les valeurs de chaque côté de l'opérateur.
        int e = 10, f = 20;
        int Multiplication = e * f;
        System.out.println("La multiplication de (e * f) est: " + Multiplication);

        // / (Division) -> Divise l'opérande de gauche par l'opérande de droite.
        int g = 10, h = 20;
        int Division = h / g;
        System.out.println("La division de (g / h) est: " + Division);

        // % (module) -> Divise l'opérande de gauche par l'opérande de droite et renvoie
        // le reste.
        int i = 10, j = 20;
        int modulo = i % j;
        System.out.println("Le modulo de (j % i) est " + modulo);

        // ++ (Incrément) -> Augmente la valeur de l'opérande de 1.
        int k = 20;
        k++;
        System.out.println("L'incrementation de k donne: " + k);

        // -- (Décrément) -> Diminue la valeur de l'opérande de 1.
        int l = 20;
        l--;
        System.out.println("La decrementation de l donne: " + l);
    }

}
