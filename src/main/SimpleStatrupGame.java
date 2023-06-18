package main;

// PREP CODE
/** 
 *      METHOD: public static void main(String[] args)
 *          DECLARE an int variable to hold the number of user guesses, named numberOfGuesses
 *          MAKE a new SimpleStatup instance
 *          COMPUTE a random number between 0 and 4 that will be the starting location cell position
 *          MAKE an int array with 3 ints using the randomluy generated number, that number incrementd by 1 and that number incremented by 2
 *          INVOKE the setLocationCells() method on SimpleStatup instance
 *          DECLARE a boolean variable representing the state of the game, named isAlive SET it true
 *          
 *          WHILE the Startup is still alive (isAlive == true)
 *              GET user input from the command line 
 *              // check the user guess
 *              INVOKE the checkYourself() method on SimpleStatup instance
 *              INCREMENT numberOfGuesses variable
 *              // check for Startup death
 *              IF result is "kill"
 *                  SET isAlive to false (loop ends)
 *                  PRINT the number of user guesses
 *              END IF
 *          END WHILE
 *      END METHOD
 */
public class SimpleStatrupGame {
    // REAL CODE
    public static void main(String[] args) {
        int numberOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleStartup theStartup = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStartup.setLocationCells(locations);
        
        boolean isAlive = true;
        while (isAlive) {
            int guess = helper.getUserInput("enter a number");
            String result = theStartup.checkYourself(guess);
            numberOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numberOfGuesses + "guesses");
            }
        }
    }
}
