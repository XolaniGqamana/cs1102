
import textio.TextIO;

/**
* This class implements a simple program that will compute
* the amount of interest that is earned on an investment over
* a period of one year  The initial amount of the investment
* and the interest rate are input by the user The value of
* the investment at the end of the year is output The
* rate must be input as a decimal, not a percentage (for
* example, 0.05 rather than 5).
*/

public class Ch2Interest2 {

    public static void main(String[] args){
        
        double principalAmount;     //The value of the initial investment
        double interestRate;        //The annual interest rate
        double interestEarned;      //The interest earned in one year
        
        System.out.print( "\nEnter the initial investment amount: " );
        principalAmount = TextIO.getlnDouble();

        System.out.print("\nEnter the annual interest rate (as a decimal): ");

        interestRate = TextIO.getlnDouble();


        System.out.printf("The amount of interest is %1.2f%n", interestRate);
        System.out.println("");
        System.out.printf("The value of the investemt after one year = $%1.2f%n ", principalAmount);
            
    }
    
}


