package linkedList;

public class LinkedList {

    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void insert (Node newNode){
        newNode.next = head;
        head = newNode;
    }

    public void view(){
        Node firstNode = head;
        while ((firstNode!=null)){
            System.out.println(firstNode.getData());
            firstNode=firstNode.next;
        }
    }

    public boolean isInclude(Node head, int item){
        Node node = head;

        while (node != null)
        {
            if (node.getData() == item){
                return true;
            }

            node = node.next ;

        }
        return false;
    }

    public String stringPath(){
        String path = "";
        Node node = head;

        while (node != null){
            path += "{ ";
            path += node.getData();
            path += " }";
            path += " --> ";
            node = node.next;
        }
        path += "Null";
        return  "LinkedList = " +path;
    }

}
