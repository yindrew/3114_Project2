/**
 * Linked list class that represents a integer
 * 
 * @author yindrew
 * @version 2021.07.22
 */
public class LinkedList {
    private Node head;
    private Node cur;
    private int size;

    /**
     * constructor
     */
    public LinkedList() {
        this.head = null;
        this.cur = head;
        this.size = 0;

    }



    /**
     * 
     * @return head node
     */
    public Node getHead() {
        return head;
    }




    /**
     * 
     * @return the cur node.
     */
    public Node getCur() {
        return cur;
    }


    /**
     * 
     * @return size
     */
    public int getSize() {
        return size;
    }


    /**
     * set Cur
     * @param node is the node getting set
     */
    public void setCur(Node node) {
        cur = node;
    }





    /**
     * 
     * @return if the linked list is empty
     */
    public boolean isEmpty() {
        return size == 0;

    }


    /**
     * inserts data at the end of the linkedList
     * 
     * @param data
     *            the digit to be added
     */
    public void insert(String data) {
        Node newNode = new Node(data);
        
        if(isEmpty()) {
            head = newNode;
            cur = head;
        }
        
        cur.setNext(newNode);
        cur = cur.next();
        size++;

    }





    /**
     * @return the value of the integer.
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node temp = head;

        while (temp != null) {
            builder.append(temp.val());
            builder.append(" ");
            temp = temp.next();
        }
        return builder.toString();

    }

}
