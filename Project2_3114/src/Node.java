/**
 * 
 * @author yindrew
 * @version 2021.07.22
 */
public class Node {
    private Node next;
    private String val;

    /**
     * constructor for a node.
     * 
     * @param entry
     *            a digit within the number
     */
    Node(String entry) {
        val = entry;
        next = null;
    }


    /**
     * @return next node
     */
    public Node next() {
        return next;
    }
    



    /**
     * @return val
     */
    public String val() {
        return val;
    }


    /**
     * setting next
     * 
     * @param newNode
     *            is the node being added in
     */
    public void setNext(Node newNode) {
        next = newNode;
    }
    



    /**
     * setting value
     * 
     * @param val
     *            is the value being added in
     */
    public void setVal(String val) {
        this.val = val;
    }

}