public class Node {
    public int value;
    public Node next;

    // Constructor to initialize the node with a value
    public Node(int value) {
        this.value = value;
        this.next = null; // Initially, the next pointer is set to null
    }

    // Default constructor
    public Node() {
        this.value = 0; // Default value
        this.next = null; // Initially, the next pointer is set to null
    }

}
