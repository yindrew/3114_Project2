import org.junit.Test;

/**
 * testing the Linked List class
 * 
 * @author yindrew
 * @version 2021.07.22
 */
public class LinkedListTest extends student.TestCase {
    private LinkedList list1;

    /**
     * Setting up tests
     */
    public void setUp() {
        list1 = new LinkedList();
    }




    /**
     * testing the getHead method
     */
    @Test
    public void testGetHead() {
        assertTrue(list1.isEmpty());
        list1.insert("1");
        assertEquals(list1.getHead().val(), "1");
    }


    /**
     * testing the getCur method
     */
    @Test
    public void testGetCur() {
        list1.insert("1");
        assertEquals(list1.getCur().val(), "1");

    }
    




    /**
     * testing the getSize method
     */
    @Test
    public void testGetSize() {
        list1.insert("1");
        assertEquals(list1.getSize(), 1);

    }
    
    /**
     * testing the setCur method
     */
    @Test
    public void testSetCur() {
        Node node = new Node("5");
        list1.setCur(node);
        assertEquals(list1.getCur().val(), "5");
        
    }
    
    
    /**
     * testing the isEmpty method
     */
    @Test
    public void testIsEmpty() {
        assertTrue(list1.isEmpty());
        list1.insert("h");
        assertFalse(list1.isEmpty());
    }
    
    /**
     * testing the insert method
     */
    @Test
    public void testInsert() {
        list1.insert("hi");
        assertEquals(list1.getSize(), 1);
        assertEquals(list1.getHead().val(), "hi");
        assertEquals(list1.getCur().val(), "hi");
        list1.insert("bye");
        assertEquals(list1.getSize(), 2);
        assertEquals(list1.getHead().val(), "hi");
        assertEquals(list1.getCur().val(), "bye");
        list1.insert("testing");
        assertEquals(list1.getCur().val(), "testing");
    }

    
    /**
     * testing the toString method
     */
    public void testToString() {
        list1.insert("hi");
        list1.insert("bye");
        list1.insert("testing");
        assertEquals(list1.toString(), "hi bye testing ");
        assertEquals(list1.toString(), "hi bye testing ");

    }


}
