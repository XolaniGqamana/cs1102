
import textio.TextIO;


public class Ch2TextIODemo {
    

    public static void main(String[] args) {
       
        String userName;
        String emailAddress;
        double yearlySalary;
        String favColour;

        TextIO.putln( "\nGood afternoon! This program will created your profile.\n" );
        TextIO.putln( "You just need to answer a few questions.\n" );

        TextIO.put( "Please, enter your name: " );
        userName = TextIO.getln();
        TextIO.putln();
        TextIO.put( "Please, enter your email address:" );
        emailAddress = TextIO.getln();
        TextIO.putln();
        TextIO.put("What is your yearly income? ");
        yearlySalary = TextIO.getlnDouble();
        TextIO.putln();
        TextIO.put("What is your favorite color? ");
        favColour = TextIO.getln();
        TextIO.putln();

        /* Write the user's information to a file names userprofile.txt. */

        TextIO.writeFile( "userprofile.txt" );
        TextIO.putln( "User name      : " + userName );
        TextIO.putln( "Email address  : " + emailAddress );
        TextIO.putln( "Favourite Color: " + favColour );
        TextIO.putf( "Yearly Income   : %,1.2f%n", yearlySalary );

    
    }
    
}


