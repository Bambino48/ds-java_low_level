public class TypesDeVariables {
    // Les trois types variables en java :

    /*
     * 1. Variables locales Java :
     * 
     * Les variables locales sont déclarées dans des méthodes , des constructeurs ou
     * des blocs.
     * 
     * Les variables locales sont créées lorsque la méthode, le constructeur ou le
     * bloc est entré et
     * la variable sera détruite une fois sortie de la méthode, du constructeur ou
     * du bloc.
     * 
     * Les modificateurs d'accès ne peuvent pas être utilisés pour les variables
     * locales.
     * 
     * Les variables locales ne sont visibles que dans la méthode, le constructeur
     * ou le bloc déclaré.
     * 
     * Les variables locales sont implémentées au niveau de la pile en interne.
     * 
     * Il n'y a pas de valeur par défaut pour les variables locales, donc les
     * variables locales
     * doivent être déclarées et une valeur initiale doit être attribuée avant la
     * première utilisation.
     */

    // Exemple voir la classe VariableLocalePorter.java et
    // VariableLocalePorter2.java

    /*
     * 2. Variables d'instance Java :
     * 
     * Les variables d'instance sont déclarées dans une classe , mais en dehors
     * d'une méthode, d'un constructeur ou de tout bloc.
     * 
     * Lorsqu'un espace est alloué à un objet dans le tas, un emplacement pour
     * chaque valeur de variable d'instance est créé.
     * 
     * Les variables d'instance sont créées lorsqu'un objet est créé à l'aide du
     * mot-clé « nouveau » et détruites lorsque l'objet est détruit.
     * 
     * Les variables d'instance contiennent des valeurs qui doivent être référencées
     * par plusieurs méthodes, constructeurs ou blocs,
     * ou des parties essentielles de l'état d'un objet qui doivent être présentes
     * dans toute la classe.
     * 
     * Les variables d'instance peuvent être déclarées au niveau de la classe avant
     * ou après utilisation.
     * 
     * Des modificateurs d'accès peuvent être donnés par exemple à des variables.
     * 
     * Les variables d'instance sont visibles pour toutes les méthodes,
     * constructeurs et blocs de la classe.
     * Normalement, il est recommandé de rendre ces variables privées (niveau
     * d'accès). Cependant,
     * la visibilité des sous-classes peut être donnée pour ces variables à l'aide
     * de modificateurs d'accès.
     * 
     * Les variables d'instance ont des valeurs par défaut. Pour les nombres, la
     * valeur par défaut est 0, pour les booléens,
     * elle est fausse et pour les références d'objet, elle est nulle.
     * Les valeurs peuvent être attribuées lors de la déclaration ou au sein du
     * constructeur.
     * 
     * Les variables d'instance sont accessibles directement en appelant le nom de
     * la variable à l'intérieur de la classe.
     * Cependant, dans les méthodes statiques (lorsque les variables d'instance sont
     * accessibles),
     * elles doivent être appelées en utilisant le nom complet.
     * ObjectReference.VariableName .
     */

    // Exemple voir classe Employee

    /*
     * 3. Classe Java/Variables statiques :
     * 
     * Les variables de classe également appelées variables statiques sont déclarées
     * avec le mot-clé static dans une classe,
     * mais en dehors d'une méthode, d'un constructeur ou d'un bloc.
     * 
     * Il n'y aurait qu'une seule copie de chaque variable de classe par classe,
     * quel que soit le nombre d'objets créés à partir de celle-ci.
     * 
     * Les variables statiques sont rarement utilisées autrement que pour être
     * déclarées comme constantes.
     * Les constantes sont des variables déclarées comme publiques/privées, finales
     * et statiques.
     * Les variables constantes ne changent jamais par rapport à leur valeur
     * initiale.
     * 
     * Les variables statiques sont stockées dans la mémoire statique.
     * Il est rare d'utiliser des variables statiques autres que celles déclarées
     * finales et utilisées comme constantes publiques ou privées.
     * 
     * Les variables statiques sont créées au démarrage du programme et détruites à
     * l'arrêt du programme.
     * 
     * La visibilité est similaire aux variables d'instance. Cependant,
     * la plupart des variables statiques sont déclarées publiques puisqu'elles
     * doivent être disponibles pour les utilisateurs de la classe.
     * 
     * Les valeurs par défaut sont les mêmes que les variables d'instance.
     * Pour les nombres, la valeur par défaut est 0 ; pour les booléens, c'est faux
     * ; et pour les références d'objet, c'est nul.
     * Les valeurs peuvent être attribuées lors de la déclaration ou au sein du
     * constructeur.
     * De plus, des valeurs peuvent être attribuées dans des blocs d'initialisation
     * statiques spéciaux.
     * 
     * Les variables statiques sont accessibles en appelant avec le nom de classe
     * ClassName.VariableName .
     * 
     * Lorsque vous déclarez des variables de classe comme public static final,
     * les noms de variables (constantes) sont tous en majuscules.
     * Si les variables statiques ne sont pas publiques et finales, la syntaxe de
     * dénomination est la même que celle des variables d'instance et locales.
     */
}
