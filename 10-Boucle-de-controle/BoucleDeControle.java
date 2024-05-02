// Quand les boucles sont-elles nécessaires ?
/*
 * Il peut arriver que vous deviez exécuter un bloc de code plusieurs fois.
 * En général, les instructions sont exécutées de manière séquentielle :
 * la première instruction d'une fonction est exécutée en premier, suivie
 * de la seconde, et ainsi de suite.
 * 
 * Les langages de programmation fournissent diverses structures de contrôle
 * qui permettent des chemins d'exécution plus compliqués.
 */

// Instruction de boucle
/*
 * Une instruction de boucle nous permet d'exécuter une instruction ou un groupe
 * d'instructions plusieurs fois et voici la forme générale d'une instruction de
 * boucle dans la plupart des langages de programmation :
 */

/*
 * @
 * |---------------<-------------
 * | |
 * | |
 * | Conditionnal Code
 * | ^
 * | |
 * | if condition |
 * v is true |
 * Condition------------>--------
 * |
 * |
 * | if condition
 * | is false
 * v
 * 
 */

// Boucles Java
// Le langage de programmation Java fournit les types de boucles suivants pour
// gérer les exigences de bouclage :
/*
 * 
 * 1-boucle while
 * Répète une instruction ou un groupe d'instructions lorsqu'une condition
 * donnée est vraie.
 * Il teste la condition avant d'exécuter le corps de la boucle.
 * 
 * 2-boucle for :
 * Exécute une séquence d'instructions plusieurs fois et abrége le code qui gère
 * la variable de boucle.
 * 
 * 3-boucle do...while
 * Comme une instruction while, sauf qu'elle teste la condition à la fin du
 * corps de la boucle.
 * 
 * 4-Boucle for améliorée
 * Depuis Java 5, la boucle for améliorée a été introduite. Ceci est
 * principalement utilisé pour parcourir une collection d’éléments, y compris
 * des tableaux.
 */

// Instructions de contrôle de boucle
/*
 * Les instructions de contrôle de boucle modifient l'exécution par rapport à sa
 * séquence normale.
 * Lorsque l'exécution quitte une portée, tous les objets automatiques créés
 * dans cette portée sont détruits.
 * 
 * En Java, voici les instructions de contrôle des boucles :
 */
/*
 * 
 * 1 instruction break
 * Termine l' instruction de boucle ou de commutateur et transfère l'exécution à
 * l'instruction qui
 * suit immédiatement la boucle ou le commutateur.
 * 
 * 2 instruction continue
 * Fait que la boucle ignore le reste de son corps et reteste immédiatement son
 * état avant de réitérer.
 * 
 * 
 */