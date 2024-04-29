/*----- Exemple 2 : portée locale de la variable sans initialisation -----*/

public class VariableLocalePorter2 {

    public void pupAge() {
        int age;
        age = age + 7; // lorsque la variable n'est pas initialiser, elle provoque une erreure
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String[] args) {
        VariableLocalePorter2 test = new VariableLocalePorter2();
        test.pupAge();
    }
}