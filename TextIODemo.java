
import textio.TextIO;

/**
* A program that reads an integer that is typed in by the
* user and computes and prints the square of that integer.
*/


public class TextIODemo {
    

    public static void main( String[] args ) {
        int userInput;
        int square;

        System.out.println( "\nPlease, type an intger: " );
        userInput = TextIO.getlnInt();

        square = userInput * userInput;

        System.out.println();
        System.out.println("The number entered was " + userInput + ".");
        System.out.println("The square of " + userInput + " is " + square + ".");
        System.out.println();
        
    
    }//end of main()

}//end of TextIODemo


