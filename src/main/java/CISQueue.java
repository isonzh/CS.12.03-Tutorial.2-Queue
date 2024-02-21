public class CISQueue<T> {

    // A property of our Queue class is a Linked List.
    // Use your Linked List class that you created in Lab 1!
    // Thought 1: is aggregation or composition going to be used here?
    // Thought 2: meditate on the word 'abstraction'.
    private CISLinkedList<T> queue;
    // Our CISQueue class will have a constructor.
    // Our CISQueue constructor will instantiate a Queue of size 1.

    public CISQueue(int n) {
        this.queue = new CISLinkedList(n);
    }




    // isEmpty
    // Returns a boolean.
    // Indicates whether the Queue is empty.
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // size
    // Returns an integer.
    // Indicates how many elements are currently in our Queue.
    public int size() {
        return queue.size();
    }
    // dequeue
    // Returns the data stored in the node that will be polled.
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }
    // enqueue
    // Adds a node to the end of our Queue.
    public void enqueue(T item) {
        queue.addLast(item);
    }
    // toString
    // Returns a String representation of our Queue.

    @Override
    public String toString() {
        return queue.toString();
    }

}
