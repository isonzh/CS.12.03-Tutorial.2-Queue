


/** Ison attempting queue using array**/

// public class queue {
//
//    public int[] queue = new int[0];
//
//
//    public void queue(int n){
//       int[] newQueue=new int[queue.length+1];
//       for(int i=0;i<queue.length;i++){
//           newQueue[i]=queue[i];
//       }
//       newQueue[queue.length+1]=n;
//       queue=newQueue;
//    }
//    public void pop(){
//        int[] newQueue=new int[queue.length-1];
//        for(int i=0;i<queue.length-1;i++){
//            newQueue[i]=queue[i];
//        }
//        queue=newQueue;
//    }
//    public int getQueue(int n){
//        return queue[n];
//    }
//    public void setQueue(int t,int n){
//        queue[t]=n;
//    }
//    public int[] array(){
//    return queue;
//    }
//}
public class queue {
    private int[] items;
    private int head;
    private int tail;
    private int size;

    public queue() {
        this.items = new int[0];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == items.length;
    }

    public void enqueue(int item) {
        if (isFull()) {
          int[] newItems = new int[items.length*2];
          for(int i =0;i<items.length;i++){
              newItems[i]=items[i];
          }
        }
        items[tail] = item;
        tail = (tail + 1) % items.length;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = items[head];
        head = (head + 1) % items.length;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return items[head];
    }
    public int[] array(){
        return items;
    }

    public int size() {
        return size;
    }
}
