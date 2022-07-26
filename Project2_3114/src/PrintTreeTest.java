/**
 * Test calss for PrintTree
 * 
 * @author yindrew
 * @version 2021.07.25
 */
public class PrintTreeTest extends student.TestCase {
    private PrintTree printTree;

    /**
     * setting up the tests
     */
    public void setUp() {
        // printTree = new PrintTree("ViennaOpen", "2");
        printTree = new PrintTree("f", "2");
    }


    /**
     * testing the print method
     */
    public void testPrint() {

        printTree.print();
    }

}
