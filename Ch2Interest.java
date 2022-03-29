
/**
 * This class implements a program that will
 * compute the amount of interets that is earned 
 * on R1000 invested at an annual interest rate of 
 * 0.027 for one year The value of the investment after one year 
 * are printed to standard output
 */
public class Ch2Interest{

    public static void main(String[] args){
        
        double principalAmount;     //The value of the initial investment
        double interestRate;        //The annual interest rate
        double interestEarned;      //The interest earned in one year
        
        principalAmount = 1000;
        interestRate = 0.027;

        interestEarned = principalAmount * interestRate;
        principalAmount = principalAmount + interestEarned;

        /*Output the results. */
        System.out.println("");
        System.out.print("Interest earned = R");
        System.out.println(interestEarned);
        System.out.println("");
        System.out.print("The value of the investemt after one year = R");
        System.out.println(principalAmount);
        System.out.println("");
    
    }
    
}


