/*----- Exemple de variables d'instance Java -----*/

public class Employee {

    // la variable d'instance est visible pour n'importe quelle classe enfant.
    public String nom;

    // la variable de salaire est visible dans la classe Employee uniquement.
    private double salaire;

    // la variable nom est attribuee dans le constructeur.
    public Employee(String empNom) {
        nom = empNom;
    }

    // la variable salaire recoit une valeur.
    public void setSalaire(double empSal) {
        salaire = empSal;
    }

    // Cette methode affiche les details de l'employe
    public void printEmp() {
        System.out.println("nom  : " + nom);
        System.out.println("salaire :" + salaire);
    }

    public static void main(String args[]) {
        Employee employe1 = new Employee("Ransika");
        employe1.setSalaire(1000);
        employe1.printEmp();
    }
}
