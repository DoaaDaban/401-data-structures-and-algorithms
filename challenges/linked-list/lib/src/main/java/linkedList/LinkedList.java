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


// FIND ELEMENT FROM THE END OF LINKED LIST DEPENDS ON THE K VALUE

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

//    ZIP THE TWO LINKED LIST LISTS TOGETHER INTO ONE LINKED LIST
    public static LinkedList zipLists(LinkedList list1, LinkedList list2){

        Node node1 = list1.head;
        Node node2 = list2.head;
        LinkedList zipLists = new LinkedList();

        int length;

        if(list1.size> list2.size){
            length = list1.size;
        }else if(list1.size< list2.size){
            length = list2.size;
        }else{
            length = list1.size;
        }

        while (length > 0){

            if(node1 != null){
                zipLists.addNewNodeAtEnd(node1.getData());
                node1 = node1.next;
            }

            if(node2 != null){
                zipLists.addNewNodeAtEnd(node2.getData());
                node2 = node2.next;
            }

            length --;

        }
        zipLists.sortList();
        return zipLists;
    }

    public void sortList()
    {

        // Node current will point to head
        Node current = head, index = null;

        T temp;

        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;

                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if ((int)current.getData() > (int) index.getData()) {
                        temp = (T) current.getData();
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

//    isPalindrome
public boolean isPalindrome(Node head) {
    if(head == null) return true;
    Node fast = head, slow = head;

    /** find middle element */
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    /** when the length is odd */
    if(fast != null) slow = slow.next;

    /** reverse the second half */
    Node prev = null;
    while(slow != null){
        Node temp = slow.next;
        slow.next = prev;
        prev = slow;
        slow = temp;
    }

    /** compare the first and second half */
    slow = prev;
    while(slow != null) {
        if(head.data != slow.data) return false;
        head = head.next;
        slow = slow.next;
    }
    return true;
}

// delete the middle
public int countOfNodes(Node head)
{
    int count = 0;
    while (head != null) {
        head = head.next;
        count++;
    }
    return count;
}

    // Deletes middle node and returns
    // head of the modified list
    public Node deleteMid(Node head)
    {
        // Base cases
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }
//        Node copyHead = head;

        // Find the count of nodes
        int count = countOfNodes(head);

        // Find the middle node
        int mid = count / 2;

        // Delete the middle node
        while (mid-- > 1) {
            head = head.next;
        }

        // Delete the middle node
        head.next = head.next.next;


        return head.next.next;
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
