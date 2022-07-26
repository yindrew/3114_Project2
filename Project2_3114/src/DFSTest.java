/**
 * 
 * @author yindrew
 * @version 2021.07.25
 */
public class DFSTest extends student.TestCase {
    private DFS dfs;

    /**
     * setting up the tests
     */
    public void setUp() {
        dfs = new DFS("ViennaOpen", "2", "VXennWOpen");

    }


    /**
     * testing the print method
     */
    public void testPrint() {
        dfs.print();
    }

}
