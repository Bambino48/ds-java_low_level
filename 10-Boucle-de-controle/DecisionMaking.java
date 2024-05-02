/*
 * Les structures de prise de décision ont une ou plusieurs conditions à évaluer ou tester par le programme, 
 * ainsi qu'une ou plusieurs instructions qui doivent être exécutées si la condition est déterminée comme 
 * étant vraie, et facultativement, d'autres instructions à exécuter si la condition est déterminée. être faux.

Voici la forme générale d'une structure de prise de décision typique trouvée dans la plupart des langages de 
programmation :
 */
//
//                                           @
//                                           |
//                                           |
//                                           |
//                                           v
//                                       Condition-----------------------------
//                                           |                                |
//                                           |                                |
//                                           |                                |
//                           if condition    |            if condition        |
//                           is true         |            is false            |
//                                           |                                |                             
//                                           |                                v
//                                           |                                |
//                                           |                                |
//                                           v                                |
//                                      conditional----------------------------                                 
//                                          code
//                                           |
//                                           |                                                                 
//                                           |
//                                           |
//                                           |
//                                           v

// Le langage de programmation Java fournit les types suivants d'instructions de prise de décision.
/*
 * 
1	déclaration if
Une instruction if consiste en une expression booléenne suivie d'une ou plusieurs instructions.

2	déclaration if...else
Une instruction if peut être suivie d'une instruction else facultative , qui s'exécute lorsque l'expression booléenne est fausse.

3	instruction if imbriquée
Vous pouvez utiliser une instruction if ou else if dans une autre instruction if ou else if .

4	instruction switch
Une instruction switch permet de tester l’égalité d’une variable par rapport à une liste de valeurs.
 */

// Le ? : Opérateur
/*
 * Nous avons couvert l'opérateur conditionnel ? : dans le chapitre précédent qui peut être utilisé 
 * pour remplacer les instructions if...else . Il a la forme générale suivante :

Exp1 ? Exp2 : Exp3;
Où Exp1, Exp2 et Exp3 sont des expressions. Notez l'utilisation et le placement du côlon.
 */

/*
 * Pour déterminer la valeur de l’expression entière, exp1 est initialement évalué.

Si la valeur de exp1 est vraie, alors la valeur de Exp2 sera la valeur de l’expression entière.

Si la valeur de exp1 est fausse, alors Exp3 est évaluée et sa valeur devient la valeur de l'expression entière.
 */

/*Exemple
Dans cet exemple, nous créons deux variables a et b et en utilisant l'opérateur ternaire, 
nous avons décidé des valeurs de b et les avons imprimées.
 */
public class DecisionMaking {

    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("La valeur de b est : " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("La valeur de b est : " + b);
    }

}
