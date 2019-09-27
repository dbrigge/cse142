/*
Song v0.1
by Derrick Brigge
2019.9.27
CSE 142
TA: Elizabeth Lin

This program uses static methods to print the verses of a song
*/

public class Song {
    public static void main(String[] args) {
        printVerseOne();
        printVerseTwo();
        printVerseThree();
        printVerseFour();
        printVerseFive(); 
        printVerseSix();
        printVerseSeven();
    }

    // Prints the Refrain
    public static void printRefrain() {
        System.out.println("I don't know why she swallowed that fly,\nPerhaps she'll die.\n");
        
    }

    //Prints Verse One lines and the Refrain
    public static void printVerseOne() {
        System.out.println("There was an old woman who swallowed a fly.");
        printRefrain();
    }

    // Prints Verse Two lines and the Refrain
    public static void printVerseTwo() {
        System.out.println("There was an old woman who swallowed a spider,\nThat wriggled and iggled and jiggled inside her.\nShe swallowed the spider to catch the fly,");
        printRefrain();
    }

    // Prints Verse 3 Lines and the Refrain
    public static void printVerseThree() {
        System.out.println("There was an old woman who swallowed a bird,\nHow absurd to swallow a bird.\nShe swallowed the bird to catch the spider,\nShe swallowed the spider to catch the fly,");
        printRefrain();
    }

    // Prints Verse 4 lines and Refrain
    public static void printVerseFour() {
        System.out.println("There was an old woman who swallowed a cat,\nImagine that to swallow a cat.\nShe swallowed the cat to catch the bird,\nShe swallowed the bird to catch the spider,\nShe swallowed the spider to catch the fly,");
        printRefrain();
    }

    // Prints Verse 5 lines and Refrain
    public static void printVerseFive() {
        System.out.println("There was an old woman who swallowed a dog,\nWhat a hog to swallow a dog.\nShe swallowed the dog to catch the cat,\nShe swallowed the cat to catch the bird,\nShe swallowed the bird to catch the spider,\nShe swallowed the spider to catch the fly,");
        printRefrain();
    }

    // Prints Verse 6 lines and Refrain
    public static void printVerseSix() {
        System.out.println("There was an old woman who swallowed a goat,\nThe odds of that, how remote!\nShe swallowed the goat to catch the dog,\nShe swallowed the dog to catch the cat,\nShe swallowed the cat to catch the bird,\nShe swallowed the bird to catch the spider,\nShe swallowed the spider to catch the fly,");
        printRefrain();
    }

    // Prints the Seventh (last) Verse
    public static void printVerseSeven() {
        System.out.println("There was an old woman who swallowed a horse,\nShe died of course.");
    }
}


