/**
 * DFS TEST
 * 
 * @author yindrew
 * @version 2021.07.25
 */
public class DFSTest extends student.TestCase {
    private DFS dfs;
    private DFS dfs1;
    private DFS dfs2;

    /**
     * setting up the tests
     */
    public void setUp() {
        dfs = new DFS("ViennaOpen", "2", "ViPnnaOpWn");
        dfs1 = new DFS("ViennaOpen", "3", "VJennaKSeb");
        dfs2 = new DFS("quickWin", "5", "ZUOHRWYP");

        
        
    }


    /**
     * testing the print method - different
     */
    public void testPrint() {
        dfs.print();
        assertTrue(systemOut().getHistory().contains("Pg8 + Pf4"));
        assertFalse(systemOut().getHistory().contains(" + Pg8 + Pf4"));
        
    }
    
    
    /**
     * testing the print method - three
     */
    public void testPrint1() {
        dfs1.print();
        assertTrue(systemOut().getHistory().contains("Pa7 + Pc1 + Bf8"));



        
    }
    
    /**
     * testing the print method long
     */
    public void testPrint2() {
        System.out.println();
        dfs2.print();
        assertTrue(systemOut().getHistory().contains("Pe8 + Bf4 + Ba4 + Pg1 + Bh6"));
    }
    
    
    public void testGetNodesTotal() {
        dfs.print();
        assertEquals(dfs.getNodesTotal(), 60);
    }
    

    


}
