/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.*;

import static basiclibrary.Library.lowHighTemp;
import static basiclibrary.Library.tally;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void testLowHighTemp() {

        int[][] originalArr1 = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String[] acceptedArray = {"High: 72", "Low: 51", "Never saw temperature: 63", "Never saw" +
                " temperature: 67", "Never saw temperature: 68", "Never saw temperature: 69"};
        assertEquals
                (
                        Arrays.toString(acceptedArray),
                        Arrays.toString(lowHighTemp(originalArr1))
                );
    }
    @Test
    public void testWinner() {

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String expectedWinner = "Bush";
        assertEquals
                (
                        expectedWinner,
                        tally(votes)
                );
    }
}
