import org.junit.Test;

/**
 * Node Test
 * @author yindrew
 * @version 2021.07.22
 */
public class NodeTest extends student.TestCase {
    private Node node;
    private Node node1;

    /**
     * setting up the tests
     */
    public void setUp() {
        node = new Node("5");
        node1 = new Node("3");

    }


    /**
     * testing the next method
     */
    @Test
    public void testNext() {
        node.setNext(node1);
        assertEquals(node.next(), node1);
    }


    /**
     * testing the val method
     */
    @Test
    public void testVal() {
        assertEquals(node.val(), "5");
    }


    /**
     * testing the setNext method
     */
    @Test
    public void testSetNext() {
        node.setNext(node1);
        assertEquals(node.next(), node1);
    }


    /**
     * testing the setVal method
     */
    @Test
    public void testSetVal() {
        node.setVal("4");
        assertEquals(node.val(), "4");
    }
}
