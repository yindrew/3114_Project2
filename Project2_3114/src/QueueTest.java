/**
 * Queue Test
 *
 * @author Haodong Li (hadenlee)
 * @version 0.1
 */
public class QueueTest extends student.TestCase {
    // field
    private Queue q;

    /**
     * set up
     */
    public void setUp() {
        q = new Queue();

    }


    /**
     * test Queue
     */
    public void testQueue() {
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");

        assertEquals("A", q.dequeue());
        assertEquals("B", q.dequeue());
        assertEquals("C", q.dequeue());
        assertNull(q.dequeue());

    }

}
