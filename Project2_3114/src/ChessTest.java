
/**
 * testing the Chess class
 * 
 * @author yindrew
 * @version 0.1
 */
public class ChessTest extends student.TestCase {

    /**
     * testing the main method
     * 
     */
    public void testMainPrint() {
        Chess.main(new String[] { "ViennaOpen", "2" });

        assertTrue(systemOut().getHistory().contains("+ Pa7 + Pe4"));
        assertTrue(systemOut().getHistory().contains("ViPnnaOpWn"));

    }


    /**
     * testing the main method
     * 
     */
    public void testMainDFS() {
        Chess.main(new String[] { "ViennaOpen", "2", "ViPnZaOpen" });

        assertTrue(systemOut().getHistory().contains("Pg8 + Qe2"));

    }


    /**
     * testing the main method
     * 
     */
    public void testMainBFS() {
        Chess.main(new String[] { "f" });

        assertTrue(systemOut().getHistory().contains("Na7 + Pf1"));
        assertTrue(systemOut().getHistory().contains("Target fitness: 210"));

    }

}
