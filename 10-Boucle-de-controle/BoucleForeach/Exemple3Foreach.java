package BoucleForeach;
//------------------------------ Exemple 3 : itération sur un tableau d’objets ---------------------------------------------------

/* 
 * Dans cet exemple, nous montrons l’utilisation d’une boucle foreach pour afficher le contenu d’un tableau d’objets étudiants. 
 * Ici, nous créons un tableau de Students en tant qu’objet Student et l’initialisons de quelques valeurs. 
 * Ensuite, à l’aide de la boucle foreach, chaque nom est imprimé. 
 */

public class Exemple3Foreach {
    public static void main(String[] args) {
        Student[] students = { new Student(1, "Julis"), new Student(3, "Adam"), new Student(2, "Robert") };

        for (Student student : students) {
            System.out.println(student);
            System.out.println(",");
        }
    }
}

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ " + this.rollNo + "," + this.name + "]";
    }
}