
public class PrintTreeTest extends student.TestCase{
    PrintTree printTree;
    LinkedList linkedList;
    
    public void setUp() {
        printTree = new PrintTree();
        linkedList = new LinkedList();
    }
    
    public void testPrint() {
        
        printTree.print1("ViennaOpen", 2, "");
    }

}
