

/*This program performs some mathematical computations and 
 * displays the results. It also displays the value of the 
 * constant Math.PI. It then reports the number of
 * seconds that the computer spent on this task.
 */
public class Ch2TimedComputation {
    
    public static void main(String[] args){
        long startTime;         // start time of program in nanoseconds
        long endTime;           // time when computations are done in nanoseconds
        long compilationTime;   // run time in nanoseconds
        double secondsCompTime; // time difference in seconds

        startTime = System.nanoTime();
        System.out.println("");
        System.out.println(startTime);
        System.out.println("");

        double width, height, hypotenuse; //sides of a triangle
        width = 42.0;
        height = 17.0;
        hypotenuse = Math.sqrt( width * width + height * height );
        System.out.println("A triangle with sides 42 and 17 has hypotenuse " + hypotenuse );
        
        System.out.println("\nMathematically, sin(x)*sin(x) + cos(x)*cos(x) - 1 shoud be zero.");
        System.out.println("Let's check this for x = 100:");
        System.out.println(Math.sin(100)*Math.sin(100) + Math.cos(100)*Math.cos(100) - 1);

        endTime = System.nanoTime();

        compilationTime = endTime - startTime;
        secondsCompTime = compilationTime /  1000000000.0;

        System.out.println("\nRun time in nanoseconds was: " + compilationTime);
        System.out.println("\nThis is probably not perfectly accurate.");
        System.out.println("\nRun time in seconds was: " + secondsCompTime);
    

    }//end of main()

}//end of class 


