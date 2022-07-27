/**
 * Test calss for PrintTree
 * 
 * @author yindrew
 * @version 2021.07.25
 */
public class PrintTreeTest extends student.TestCase {
    private PrintTree printTree;
    private PrintTree printTree1;
    private PrintTree printTree2;

    /**
     * setting up the tests
     */
    public void setUp() {
        printTree = new PrintTree("ViennaOpen", "2");
        printTree1 = new PrintTree("quickWin", "5");
        printTree2 = new PrintTree("ViennaOpen", "1");

    }


    /**
     * testing the print method
     */
    public void testPrint() {

        printTree.print();

        assertTrue(systemOut().getHistory().contains("ViPnnaOpWn"));
        assertTrue(systemOut().getHistory().contains("+ Pa7 + Pe4"));

    }


    /**
     * testing the print method
     */
    public void testPrint1() {

        printTree1.print();

        assertTrue(systemOut().getHistory().contains("ZUOHRWYP"));
        assertTrue(systemOut().getHistory().contains(
            "Pe8 + Bf4 + Ba4 + Pg1 + Bh6"));

    }
    
    /**
     * testing the print method
     */
    public void testPrint2() {

        printTree2.print();

        assertTrue(systemOut().getHistory().contains("+ Bg6 "));


    }

}
