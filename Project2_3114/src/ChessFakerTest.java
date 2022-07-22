/**
 * testing the ChessFaker class
 * 
 * @author yindrew
 * @version 07.21.22
 *
 */
public class ChessFakerTest extends student.TestCase {

    /**
     * testing the getNextMoves method
     */
    public void testGetNextMoves() {

        String[] l = ChessFaker.getNextMoves("a");
        String[] test = { "Nc6", "Rd7" };

        for (int i = 0; i < l.length; i++) {
            assertEquals(l[i], test[i]);
        }

    }


    /**
     * testing the getNextBoard method
     */
    public void testGetNextBoard() {
        String nextBoard = ChessFaker.getNextBoard("a", "Rd7");
        assertEquals(nextBoard, "r");
    }


    /**
     * testing the getFitness method
     */
    public void testGetFitness() {
        int fitness = ChessFaker.getFitness("a");
        assertEquals(fitness, 15);
    }
}
