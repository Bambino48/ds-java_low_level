// Les opérateurs logiques

public class OperateursLogiques {
    public static void main(String[] args) {

        boolean A = true;
        boolean B = false;

        // && (logique et) -> Appelé opérateur ET logique.
        // Si les deux opérandes sont non nuls, alors la condition devient vraie.
        boolean C = A && B;
        System.out.println("La valeur de C est : " + C);

        // || (logique ou) -> Appelé opérateur OU logique.
        // Si l’un des deux opérandes est différent de zéro, alors la condition devient
        // vraie.
        boolean D = A || B;
        System.out.println("La valeur de D est : " + D);

        // ! (logique non) -> Appelé opérateur NON logique. Utilisé pour inverser l'état
        // logique de son opérande.
        // Si une condition est vraie, l'opérateur NON logique rendra faux.
        boolean E = !(A && B);
        System.out.println("La valeur de E est : " + E);

    }

}
