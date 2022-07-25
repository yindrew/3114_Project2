
public class DFSTest extends student.TestCase {
    private DFS dfs;
    
    public void setUp() {
        dfs = new DFS("ViennaOpen", "2", "VXennWOpen");
        
    }
    
    
    public void testPrint() {
        dfs.print();
    }

}
