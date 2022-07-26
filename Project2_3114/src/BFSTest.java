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
     * set up
     */
    public void setUp() {
        bfs = new BFS("f");

    }


    /**
     * test BFS
     */
    public void testPrint() {
        bfs.print();
    }

}
