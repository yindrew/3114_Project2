/**
 * Breadth First Search Test
 *
 * @author Haodong Li (hadenlee)
 * @version 0.1
 */
public class BFSTest extends student.TestCase {
    // field
    private BFS bfs;

    /*
     * setting up tests
     */
    public void setUp() {
        bfs = new BFS("f");

    }


    /**
     * test BFS
     */
    public void testPrint() {
        bfs.print();
        
        assertTrue(systemOut().getHistory().contains("Na7 + Pf1"));
        assertTrue(systemOut().getHistory().contains("Target fitness: 210"));


    }

}
