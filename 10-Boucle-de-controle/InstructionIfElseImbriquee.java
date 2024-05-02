/* Instruction if-else imbriquée Java

L' instruction if else imbriquée est utilisée pour une meilleure prise de décision 
lorsque d'autres conditions doivent être vérifiées lorsqu'une condition donnée est vraie. 
Dans l'instruction if else imbriquée, 
vous pouvez demander à une instruction if-else de bloquer un autre bloc if (ou else).
 */

/*Syntaxe de l'instruction if-else imbriquée
Vous trouverez ci-dessous la syntaxe de l'instruction if else imbriquée :

if(condition1){    
	// code block    
	if(condition2){  
		//code block
	}    
}
 */

/* Exemple : instruction Java Nested if else
 * Les exemples suivants trouvent le plus grand nombre parmi trois à l’aide de l’instruction if..else imbriquée.
 */
public class InstructionIfElseImbriquee {
    public static void main(String[] args) {

        int x = 10, y = 20, z = 30;

        if (x >= y) {
            if (x >= z)
                System.out.println(x + " est la plus grande.");
            else
                System.out.println(z + " est la plus grande.");
        } else {
            if (y >= z)
                System.out.println(y + " est la plus grande.");
            else
                System.out.println(z + " est la plus grande.");
        }
    }

}
