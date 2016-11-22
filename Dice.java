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
        - Dice class (Check)
        - Member variable (needed)
        - Constructor (needed)
        - Method (check)
        - Main program (check)
*/
import java.util.Scanner;
import java.util.Random;

public class Dice {

    // ==================== MAIN PROGRAM =========================
    // Member variables are still needed?

    public static void main (String[] args)
    {
        // variables
        int numOfRolls = 0;
        int userGuess = 0;

        Dice access = new Dice();

        // To scan user input
        Scanner in = new Scanner(System.in);

        // Game Description
        System.out.println("You decide how many dices to roll \n");
        System.out.println("You get points depending on your roll!");
        System.out.println("One dice: 1-6");
        System.out.println("Two dices: 2-12");
        System.out.println("Three dices 3-18");
        System.out.println("and so on . . . \n");

        // User Decides number of dices to roll
        System.out.println("How many dices would you like to roll?");
        numOfRolls = in.nextInt();

        // User guesses points
        System.out.println("How many points would you like to guess?");
        System.out.println("Your guess should depend on the amount of dices rolled");
        userGuess = in.nextInt();

        System.out.println("Computer threw " + access.Throw(numOfRolls) + " points!");
        System.out.println("You guessed " + userGuess + " points!");

        if (userGuess == access.Throw(numOfRolls))
        {
            System.out.println("\nYou guessed right bro! Congratulations!! ");
        }
        else
            System.out.println("\nDamn dude, you lost.");

    }

    // ============= METHODS =======================================
    // Constructor and Method needed
    // Need constructor ?


    public int Throw (int numOfRolls)
    {
        int sum = 0;
        Random random = new Random();
        int diceRolled = random.nextInt(6) + 1;

        for (int i = 0; i < numOfRolls; i++)
        {
            sum += diceRolled;
        }

        return sum;
    }


}
