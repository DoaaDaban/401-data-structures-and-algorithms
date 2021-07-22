package stack.and.queue;

public class Queue<T> {
    Node<T> front;
    Node<T> rear;

    public Queue(){
        this.front = this.rear = null;
    }

    public void enqueue(T value){
        Node<T> newNode = new Node<>(value);

        if(this.rear == null){
            this.front = this.rear = newNode;
        }

        this.rear.next = newNode;
        this.rear = newNode;
    }

    public T dequeue() {

        if(this.front == null){
            System.out.println("No values to dequeue, the queue is empty");
            return null;
        }else{
            Node temp = this.front;
            this.front = this.front.next;
            return (T) temp.getData();
        }
    }

    public T peek(){
        if(front == null){
            throw new IllegalArgumentException("Empty");
        }else{
            return front.getData();
        }
    }

    public boolean isEmpty(){
        if(front == null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        String queueValue = "Queue { ";
        Node trav = front;
        while (trav != null){
            queueValue += trav.getData() + " --> ";
            trav = trav.next;
        }
        queueValue += "Null }";
        return queueValue;
    }
}
