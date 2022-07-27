/**
 * Queue
 *
 * @author Haodong Li (hadenlee)
 * @version 0.1
 */
public class Queue {
    // field
    private Node first;
    private Node last;

    /**
     * constructor
     */
    public Queue() {
        first = null;
        last = null;
    }

    /**
     * getter for the first node
     * @return firstNode
     */
    public Node getFirst() {
        return first;
    }
    
    /**
     * getter for the last node
     * @return last
     */
    public Node getLast() {
        return last;
    }


    /**
     * Enqueue
     * 
     * @param element
     *            insert element
     */
    public void enqueue(String element) {
        // get last
        Node temp = last;

        // set last
        last = new Node(element);
        last.setNext(null);

        // check is empty and insert
        if (first == null) {
            first = last;
        }
        else {
            temp.setNext(last);
        }

    }


    /**
     * Dequeue
     * 
     * @return String
     *         return element
     */
    public String dequeue() {

        // check is empty
        if (first == null) {
            return null;
        }

        String temp = first.val();

        first = first.next();

        // after dequeue check again
        if (first == null) {
            last = null;
        }

        return temp;
    }
}
