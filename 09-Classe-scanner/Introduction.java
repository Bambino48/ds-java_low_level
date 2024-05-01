// Introduction
/*
 * La classe Java Scanner est un simple scanner de texte qui peut analyser
 * les types primitifs et les chaînes à l'aide d'expressions régulières.
 * Voici les points importants concernant Scanner :
 */
/*
 * Un scanner divise son entrée en jetons à l'aide d'un modèle de délimiteur,
 * qui correspond par défaut aux espaces.
 * Une opération de numérisation peut bloquer l’attente d’une entrée.
 * Un scanner n'est pas sûr pour une utilisation multithread sans
 * synchronisation externe.
 */

// Déclaration de classe

/*
 * Voici la déclaration de la classe java.util.Scanner :
 * 
 * public final class Scanner
 * extends Object
 * implements Iterator<String>
 * 
 */
// Constructeurs de classe
/*
 * Scanner(File source) : Cela construit un nouveau scanner qui produit les
 * valeurs analysées à partir du fichier spécifié.
 * 
 * Scanner(File source, String charsetName) : Cela construit un nouveau scanner
 * qui produit les valeurs analysées à partir du fichier spécifié.
 * 
 * Scanner(File source, Charset charset) : Cela construit un nouveau scanner qui
 * produit les valeurs analysées à partir du fichier spécifié.
 * 
 * Scanner(InputStream source) : Cela construit un nouveau scanner qui produit
 * des valeurs analysées à partir du flux d'entrée spécifié.
 * 
 * Scanner(InputStream source, String charsetName) : Cela construit un nouveau
 * scanner qui produit des valeurs analysées à partir du flux d'entrée spécifié.
 * 
 * Scanner(InputStream source, Charset charset) : Cela construit un nouveau
 * scanner qui produit des valeurs analysées à partir du flux d'entrée spécifié.
 * 
 * Scanner(Readable source) : Cela construit un nouveau scanner qui produit des
 * valeurs analysées à partir de la source spécifiée.
 * 
 * Scanner(String source) : Cela construit un nouveau scanner qui produit des
 * valeurs analysées à partir de la source spécifiée.
 * 
 * Scanner(ReadableByteChannel source) : Cela construit un nouveau scanner qui
 * produit des valeurs analysées à partir du canal spécifié.
 * 
 * Scanner(ReadableByteChannel source, String charsetName) : Cela construit un
 * nouveau scanner qui produit des valeurs analysées à partir du canal spécifié.
 * 
 * Scanner(ReadableByteChannel source, Charset charset) : Cela construit un
 * nouveau scanner qui produit des valeurs analysées à partir du canal spécifié.
 * 
 * Scanner(Path source) : Cela construit un nouveau scanner qui produit les
 * valeurs analysées à partir du fichier spécifié.
 * 
 * Scanner(Path source, String charsetName) : Cela construit un nouveau scanner
 * qui produit les valeurs analysées à partir du fichier spécifié.
 * 
 * Scanner(Path source, Charset charset) : Cela construit un nouveau scanner qui
 * produit les valeurs analysées à partir du fichier spécifié.
 */

// Méthodes de classe :
/*
 * r.No. Method & Description
 * 1 void close()
 * Cette méthode ferme ce scanner.
 * 
 * 2 Pattern delimiter()
 * Cette méthode renvoie le modèle que ce scanner utilise actuellement pour
 * faire correspondre les délimiteurs.
 * 
 * 3 Stream<MatchResult> findAll​(String patString)
 * Cette méthode renvoie un flux de résultats de correspondance qui
 * correspondent à la chaîne de modèle fournie.
 * 
 * 4 String findInLine(Pattern pattern)
 * Cette méthode tente de trouver la prochaine occurrence du modèle spécifié en
 * ignorant les délimiteurs.
 * 
 * 5 String findWithinHorizon(Pattern pattern, int horizon)
 * Cette méthode tente de trouver la prochaine occurrence du modèle spécifié.
 * 
 * 6 boolean hasNext()
 * Cette méthode renvoie true si ce scanner a un autre jeton dans son entrée.
 * 
 * 7 boolean hasNextBigDecimal()
 * Cette méthode renvoie true si le jeton suivant dans l'entrée de ce scanner
 * peut être interprété comme un BigDecimal à l'aide de la méthode
 * nextBigDecimal().
 * 
 * 8 boolean hasNextBigInteger()
 * Cette méthode renvoie true si le jeton suivant dans l'entrée de ce scanner
 * peut être interprété comme un BigInteger dans la base par défaut à l'aide de
 * la méthode nextBigInteger().
 * 
 * 9 boolean hasNextBoolean()
 * Cette méthode renvoie vrai si le jeton suivant dans l'entrée de ce scanner
 * peut être interprété comme une valeur booléenne à l'aide d'un modèle
 * insensible à la casse créé à partir de la chaîne « vrai | faux ».
 * 
 * 10 boolean hasNextByte()
 * Cette méthode renvoie vrai si le jeton suivant dans l'entrée de ce scanner
 * peut être interprété comme une valeur d'octet dans la base par défaut à
 * l'aide de la méthode nextByte().
 * 
 * 11 boolean hasNextDouble()
 * Cette méthode renvoie true si le jeton suivant dans l'entrée de ce scanner
 * peut être interprété comme une valeur double à l'aide de la méthode
 * nextDouble().
 * 
 * 12 boolean hasNextFloat()
 * Cette méthode renvoie vrai si le jeton suivant dans l'entrée de ce scanner
 * peut être interprété comme une valeur flottante à l'aide de la méthode
 * nextFloat().
 * 
 * 13 boolean hasNextInt()
 * Cette méthode renvoie vrai si le jeton suivant dans l'entrée de ce scanner
 * peut être interprété comme une valeur int dans la base par défaut à l'aide de
 * la méthode nextInt().
 * 
 * 14 boolean hasNextLine()
 * Cette méthode renvoie vrai s'il y a une autre ligne dans l'entrée de ce
 * scanner.
 * 
 * 15 boolean hasNextLong()
 * Cette méthode renvoie vrai si le jeton suivant dans l'entrée de ce scanner
 * peut être interprété comme une valeur longue dans la base par défaut à l'aide
 * de la méthode nextLong().
 * 
 * 16 boolean hasNextShort()
 * Cette méthode renvoie vrai si le jeton suivant dans l'entrée de ce scanner
 * peut être interprété comme une valeur courte dans la base par défaut à l'aide
 * de la méthode nextShort().
 * 
 * 17 IOException ioException()
 * Cette méthode renvoie la dernière IOException levée par le Readable
 * sous-jacent de ce scanner.
 * 
 * 18 Locale locale()
 * Cette méthode renvoie les paramètres régionaux de ce scanner.
 * 
 * 19 MatchResult match()
 * Cette méthode renvoie le résultat de correspondance de la dernière opération
 * d'analyse effectuée par ce scanner.
 * 
 * 20 String next()
 * Cette méthode recherche et renvoie le prochain jeton complet de ce scanner.
 * 
 * 21 BigDecimal nextBigDecimal()
 * Cette méthode analyse le jeton suivant de l'entrée en tant que BigDecimal.
 * 
 * 22 BigInteger nextBigInteger()
 * Cette méthode analyse le jeton suivant de l'entrée en tant que BigInteger.
 * 
 * 23 boolean nextBoolean()
 * Cette méthode analyse le jeton suivant de l'entrée en une valeur booléenne et
 * renvoie cette valeur.
 * 
 * 24 byte nextByte()
 * Cette méthode analyse le jeton suivant de l'entrée sous forme d'octet.
 * 
 * 25 double nextDouble()
 * Cette méthode analyse le jeton suivant de l'entrée comme un double.
 * 
 * 26 float nextFloat()
 * Cette méthode analyse le jeton suivant de l'entrée sous forme de flottant.
 * 
 * 27 int nextInt()
 * Cette méthode analyse le jeton suivant de l'entrée en tant qu'entier.
 * 
 * 28 String nextLine()
 * Cette méthode avance ce scanner au-delà de la ligne actuelle et renvoie
 * l'entrée qui a été ignorée.
 * 
 * 29 long nextLong()
 * Cette méthode analyse le jeton suivant de l'entrée en tant que long.
 * 
 * 30 short nextShort()
 * Cette méthode analyse le jeton suivant de l'entrée comme un court-circuit.
 * 
 * 31 int radix()
 * Cette méthode renvoie la base par défaut de ce scanner.
 * 
 * 32 void remove()
 * L'opération de suppression n'est pas prise en charge par cette implémentation
 * d'Iterator.
 * 
 * 33 Scanner reset()
 * Cette méthode réinitialise ce scanner.
 * 
 * 34 Scanner skip(Pattern pattern)
 * Cette méthode ignore les entrées qui correspondent au modèle spécifié, en
 * ignorant les délimiteurs.
 * 
 * 35 Stream<String> tokens()
 * Renvoie un flux de jetons séparés par des délimiteurs à partir de ce scanner.
 * 
 * 36 String toString()
 * Cette méthode renvoie la représentation sous forme de chaîne de ce scanner.
 * 
 * 37 Scanner useDelimiter(Pattern pattern)
 * Cette méthode définit le modèle de délimitation de ce scanner sur le modèle
 * spécifié.
 * 
 * 38 Scanner useLocale(Locale locale)
 * Cette méthode définit les paramètres régionaux de ce scanner sur les
 * paramètres régionaux spécifiés.
 * 
 * 39 Scanner useRadix(int radix)
 * Cette méthode Définit la base par défaut de ce scanner sur la base spécifiée.
 */

// Méthodes héritées
/*
 * Cette classe hérite des méthodes des classes suivantes :
 * 
 * java.util.Object
 */

// Lecture d'une ligne depuis la console à l'aide de l'exemple de classe Scanner
/*
 * L'exemple suivant montre l'utilisation de Java Scanner nextLine() pour lire
 * une ligne de la console et de la méthode close() pour fermer le scanner.
 * Nous avons créé un objet scanner en utilisant une chaîne donnée.
 * Ensuite, nous avons imprimé la chaîne à l’aide de la méthode nextLine(), puis
 * le scanner est fermé à l’aide de la méthode close().
 */