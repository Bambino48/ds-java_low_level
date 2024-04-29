public class VariableLocalePorter {

    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String[] args) {
        VariableLocalePorter test = new VariableLocalePorter();
        test.pupAge();
    }

}