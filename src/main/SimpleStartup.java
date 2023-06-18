package main;
// 1. Prep code
/*
 *      DECLARE an int array to hold the location cells. Call it locationCells.
 *      DECLARE an int to hold the number of hits. Call it numOfHits and SET it to 0.
 * ------------------------------------------------------------------------------
 *      DECLARE a checkYourself() method that takes a int for the user's guess (1, 3, etc.), check it, and return a result representing a "hit", "miss" or "kill".
 *      DECLARE a setLocationCells() setter method that takes an int array (which has 3 sell locations as ints (2, 3, 4 etc.)).
 * -------------------------------------------------------------------------------
 *      METHOD: String checkYourself(int userGuess)
 * 
 *          GET the user guess as an int paremeter
 * |-       REPEAT with each of the location cells in the int array
 * |
 * |            // COMPARE the user guess to the locationCells
 * | |-         IF the user guess matches 
 * | |              INCREMENT the number of hits
 * | |
 * | |              // FIND OUT if it was the last location cell:
 * | | |-           IF number of hits is 3. RETURN "kill" as a result
 * | | |            ELSE it was not a kill, so RETURN "hit"
 * | | |-           END IF
 * | |
 * | |          ELSE the user guess did not match, so RETURN "miss"
 * | |-         END IF
 * |
 * |-       END REPEAT    
 * 
 *      END METHOD
 * 
 * 
 *      METHOD: void setLocationCells(int[] cellLocations)
 * 
 *          GET the cell locations as an int parameter
 *          ASSIGN the cell locations parameter to the cell locations instance variabel
 * 
 *      END METHOD
 *   
 */
// 2. Test code

// 3. Real code
public class SimpleStartup {
    private int[] locationCells;
    private int numberOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "mess";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numberOfHits++;
                break;
            }
        }

        if (numberOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);

        return result;
    }
}
