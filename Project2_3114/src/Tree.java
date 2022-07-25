/**
 * Tree
 *
 * @author Haodong Li (hadenlee)
 * @version 0.1
 */

public class Tree {
  
    private String root;
    private Tree[] leaves;

    public Tree(String root)
    {
        this.root = root;
    }
    
    public void setLeaves(Tree[] leaves)
    {
        this.leaves = leaves;
    }
    
    public String getRoot()
    {
        return root;
    }

    public Tree[] getLeaves()
    {
        return leaves;
    }



}
