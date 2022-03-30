

public class Ch2EnumDemo {
    // Define two enum types -- the definitions 
    // go outside the main() subroutine.

    enum dayOfWeek { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
    enum monthOfYear { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }

    
    public static void main(String[] args){
      dayOfWeek tgif;
      monthOfYear libra;

      tgif = dayOfWeek.FRIDAY;
      libra = monthOfYear.OCT;

      System.out.println( "\nMy sign is Libra as I was born in " + libra + ".\n" );
      System.out.println("That's the " + libra.ordinal() + "-nth month of the year,counting from 0.\n");

      System.out.println("Isn't it nice to get to " + tgif + "?\n");

      System.out.println(tgif + " is the " + tgif.ordinal() + " day of the week.\n");
    
    }
    
}


