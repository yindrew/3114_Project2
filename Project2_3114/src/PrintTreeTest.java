/**
 * Test calss for PrintTree
 * 
 * @author yindrew
 * @version 2021.07.25
 */
public class PrintTreeTest extends student.TestCase {
    private PrintTree printTree;
    private PrintTree printTree1;

    /**
     * setting up the tests
     */
    public void setUp() {
        // printTree = new PrintTree("ViennaOpen", "2");
        printTree = new PrintTree("ViennaOpen", "3");
        printTree1 = new PrintTree("quickWin", "5");

    }


    /**
     * testing the print method
     */
    public void testPrint() {

        printTree.print();
        
        assertTrue(systemOut().getHistory().contains("ViennaOSen"));
        assertTrue(systemOut().getHistory().contains("+ Pa7 + Pe4"));
        
        
    }
    
    /**
     * testing the print method
     */
    public void testPrint1() {

        printTree1.print();
        
        assertTrue(systemOut().getHistory().contains("ZUOHRWYP"));
        assertTrue(systemOut().getHistory().contains("Pe8 + Bf4 + Ba4 + Pg1 + Bh6"));
        
        
    }


}
