/*
 * TODO: Add your name!
 * 2/12/2019
 *
 * Description: Debugging examples used to practice Java debugging in CS 1101.
 */

import java.util.Scanner;

public class intellijTipsAndTricks {
    public static void main(String[] args) {
// Prompt for user input
         Scanner console = new Scanner(System.in);
        System.out.println("What word would you like to use to debug?");

            String str = console.nextLine();
        debuggingExample(str);
    }

// TODO: Fix Javadoc comment block
/*
* isSame - this compares a and b
*/
public boolean isSame(boolean a, boolean b) {
if (a && b) {
return true;
} else if (!a && !b) {return true;} else {
return false;
        // You could write this in one line! Try it!
}}


    /**
     * badstyleexampl2 - an example of BAD style
     */
    public static void badstyleexampl2() {
        char myChar = '\0';              // this is a valid char
        String word = "hello";

        for (int i = 0; i < 4; i++) {
            myChar = word.charAt(i);
        }

        System.out.println(myChar);
        // What the heck does this print out???
        // Why couldn't you have just written `char printLetter = 'l';`?
        // Is there a time when myChar _isn't_ a valid char?
    }

    /**
     * debuggingExample - helps demonstrate basic functionality of a debugger.
     * Calls debuggingHelper() on every letter.
     *
     * This method is a good example of javadoc comments.
     *
     * @param str String to debug
     */
    public static void debuggingExample(String str) {
        char[] arr = str.toCharArray(); // Converts str to a char[]

        // Iterate through arr and do something fun with every char
        for (char c : arr) {
            debuggingHelper(c);
        }
    }

    /**
     * debuggingHelper - helper function for debuggingExample()
     * @param c char to print
     */
    public static void debuggingHelper(char c) {
        // Rick and morty joke
        System.out.println("Ooh wee, Rick, I'm helping with the letter " + c + "!");
    }
}
