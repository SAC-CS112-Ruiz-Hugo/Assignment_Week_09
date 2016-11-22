/**
 * Created by Culebra on 11/21/2016.
 */
/*
   Design and Implement a Dice game
     User to decide number of dices to roll
     - One dice:  1- 6
     - Two dices: 2-12
     - Three dices: 3-18
     ….
     . System rolls dice(s)
     . User guess points
     . Requirements
        - Dice class
        - Member variable
        - Constructor
        - Method
        - Main program
*/
import java.util.Scanner;

public class Dice {

    // ==================== MAIN PROGRAM =========================

    public static void main (String[] args)
    {
        // variables
        int numOfrolls = 0;

        // To scan user input
        Scanner in = new Scanner(System.in);

        // User Decides number of dices to roll
        System.out.println("How many dices would you like to roll?");
        numOfrolls = in.nextInt();

    }

    // ============= METHODS =======================================
    // Constructor and Method needed

    public int Throw ()
    {
        if (numOfrolls)
    }


}
