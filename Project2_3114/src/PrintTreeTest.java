
public class PrintTreeTest extends student.TestCase{
    PrintTree printTree;
    
    public void setUp() {
        printTree = new PrintTree();
    }
    
    public void testPrint() {
        printTree.print("ViennaOpen", 2);
        
    }

}
