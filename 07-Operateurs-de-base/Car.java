// Exemple d'operateur d'instanceof
// Dans cet exemple, nous créons une variable a de classe Vehicle, puis en utilisant l'opérateur instanceof, 
// nous vérifions que le nom est de type Car ou non.

public class Car extends Vehicle {

    public static void main(String[] args) {

        Vehicle a = new Vehicle();
        boolean result = a instanceof Car;
        System.out.println(result);

    }

}
