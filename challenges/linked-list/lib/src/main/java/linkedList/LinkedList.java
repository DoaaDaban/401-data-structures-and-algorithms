package linkedList;

public class LinkedList<T> {

    Node<T> head;
    int size; // this value for test

    public LinkedList() {

        this.head = null;
    }

//    ADD NODES TO THE LIST
    public void insert (T data){
        Node<T> newNode = new Node<T>(data);
        Node<T> temp;
        if(head == null){
            head =newNode;
        }else{
            temp = head;
            head = newNode;
            head.next = temp;
        }
        size ++;
    }


//    CHECK IF THE NODE IS INCLUDED IN THE LIST OR NOT
    public boolean isInclude(T data){
        Node<T> node = head;

        while (node != null)
        {
            if (node.getData() == data){
                return true;
            }

            node = node.next ;

        }
        return false;
    }


// ADD NEW NODE AT THE END OF THE LINKED LIST
    public void addNewNodeAtEnd(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null){

            head = newNode;

        }else{

            Node<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size ++;
    }

//    ADD NEW NODE BEFORE THE SPECIFIC NODE

    public void addNewNodeBefore(T refNodeData, T newNodeData){
        Node<T> newNode = new Node<T>(newNodeData);
        if(head == null){
            head = newNode;
        }else if(refNodeData == head.getData()){
            newNode.next = head;
            head = newNode;
        }else{
            Node<T> temp = head;
            while (temp.next.getData() != refNodeData){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
        size ++;
    }

//    ADD NEW NODE AFTER THE SPECIFIC NODE

    public void  addNewNodeAfter(T refNodeData, T newNodeData ){

        Node<T> newNode = new Node<T>(newNodeData);

        if(head == null){
            head = newNode;
        }else{
            Node<T> temp = head;

            while (temp.getData() != refNodeData){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size ++;
    }

    public T kthFromEnd(int k){
        int maxIdx = size - 1;
        int idxValue = maxIdx - k;

        Node<T> temp = head;
        int n = 0;


        if(k >= size || k < 0){
            return null;
        }
        else if(idxValue == n){
            return temp.getData();
        }else {
            while (idxValue != n){
                temp = temp.next;
                n++;

            }
            return temp.getData();

        }

    }




    public String stringPath(){
        String path = "";
        Node<T> node = head;

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
