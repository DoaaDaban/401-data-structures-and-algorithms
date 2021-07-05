package linkedList;

public class Node {
    public Node next;
    private int data;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }



    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
