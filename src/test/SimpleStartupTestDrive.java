package test;

import main.SimpleStartup;

/**
 * What to test:
 * 1. instantiate a SimpleStartup object.
 *  // invoke a SimpleStartup object
 * 2. Assign it a location (an array of 3 ints, like {2,3,4}).
 *  // make an int array for the location of the Startup
 *  // invoke the setter methos on the Startup
 * 3. Create an int to represent a user guess (2,0, etc).
 *  // make a fake user guess
 * 4. Invoke the checkYourself() method passing it the fake user guess.
 *  // invode the checkYurself() method on Startup object, and pass it the fake guess.
 *  // if fake guess give back a hit it is working
 * 5. Print out the result to see if it's correct ("passed" of "failed").
 *  // print the test result "passed" or "failed"
 * 
 */
public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        // 1
        SimpleStartup dot = new SimpleStartup(); 

        // 2
        int[] locations = {2, 3, 4}; 
        dot.setLocationCells(locations); 

        // 3
        int userGuess = 3; 
        // 4
        String result = dot.checkYourself(userGuess); 
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed"; 
        }

        // 5
        System.out.println(testResult); 
    }
}
