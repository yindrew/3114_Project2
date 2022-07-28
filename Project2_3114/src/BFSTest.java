/**
 * Breadth First Search Test
 *
 * @author Haodong Li (hadenlee)
 * @version 0.1
 */
public class BFSTest extends student.TestCase {
    // field
    private BFS bfs;

    /**
     * setting up tests
     */
    public void setUp() {
        bfs = new BFS("quickWin");

    }


    /**
     * test BFS
     */
    public void testPrint() {
        bfs.print();
        
        assertTrue(systemOut().getHistory().contains("Pe8 + Bf4 + Ba4"));
        assertTrue(systemOut().getHistory().contains("Target fitness: 138"));

    }

}
