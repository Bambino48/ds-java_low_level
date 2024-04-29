/*----- Exemple de classe Java/variables statiques -----*/

public class Employee1 {

    // la variable salaire est une variable statique privee
    private static double salaire;

    // DEPARTEMENT est une constante
    public static final String DEPARTEMENT = "Developpemen";

    public static void main(String[] args) {
        salaire = 1000;
        System.out.println(DEPARTEMENT + " salaire moyen : " + salaire);
    }
}
