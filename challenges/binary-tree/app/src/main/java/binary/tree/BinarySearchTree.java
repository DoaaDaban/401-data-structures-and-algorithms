package binary.tree;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(int key){

        if (root == null){
            root = new Node(key);
        }else{
            Node current = root;
            traverse(current,key);
        }
    }

    private void traverse (Node current, int key){

        if(key > (int) current.getKey()){
            if(current.getRight() == null){
                current.setRight(new Node(key));
                return;
            }

            current = current.getRight();
        }else{
            if(current.getLeft() == null){
                current.setLeft(new Node (key));
                return;
            }
            current = current.getLeft();
        }
        traverse(current,key);
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node root){
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.println(root.getKey());
            inorderRec(root.getRight());
        }
    }

    public boolean contains(int key){
        while (root != null) {
            if (key > (int) root.getKey())
                root = root.getRight();
            else if (key < (int) root.getKey())
                root = root.getLeft();
            else
                return true;
        }
        return false;
    }
}
