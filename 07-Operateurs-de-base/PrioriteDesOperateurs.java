public class PrioriteDesOperateurs {

    // Priorité des opérateurs Java
    /*
     * La priorité des opérateurs détermine le regroupement des termes dans une
     * expression.
     * Cela affecte la façon dont une expression est évaluée.
     * Certains opérateurs ont une priorité plus élevée que d'autres ; par exemple,
     * l'opérateur de multiplication a une priorité plus élevée que l'opérateur
     * d'addition.
     */
    /*
     * Par exemple, x = 7 + 3 * 2 ; ici, x se voit attribuer 13, et non 20,
     * car l'opérateur * a une priorité plus élevée que +,
     * il est donc d'abord multiplié par 3 * 2, puis ajouté à 7.
     */
    /*
     * Ici, les opérateurs ayant la priorité la plus élevée apparaissent en haut du
     * tableau,
     * ceux avec la priorité la plus basse apparaissent en bas.
     * Dans une expression, les opérateurs de priorité supérieure seront évalués en
     * premier.
     */

    // Postfix -> expression++ expression-- -> De gauche à droite
    // Unaire -> ++expression --expression +expression -expression ⁓ ! -> De droite
    // à gauche
    // Multiplicatif -> */% -> De gauche à droite
    // Additif -> + - -> De gauche à droite
    // Changement -> << >> >>> -> De gauche à droite
    // Relationnel -> < > <= >= instanceof -> De gauche à droite
    // Égalité -> == != -> De gauche à droite
    // ET au niveau du bit -> & -> De gauche à droite
    // XOR au niveau du bit -> ^ -> De gauche à droite
    // OU au niveau du bit -> | -> De gauche à droite
    // ET logique -> && -> De gauche à droite
    // OU logique -> || -> De gauche à droite
    // Conditionnel -> ?: ->De droite à gauche
    // Affectation -> =, +=, -=, *=, /=, %=, ^=,, |=, <<=, >>=. >>>= -> De droite à
    // gauche
}
