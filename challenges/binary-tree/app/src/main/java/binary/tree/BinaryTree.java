package binary.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    List<Integer> postOrderList = new ArrayList<>(); // FOR TEST and use it in code challenge 16
    List<Integer> inOrderList = new ArrayList<>();  // FOR TEST
    List<Integer> preOrderList = new ArrayList<>(); // FOR TEST


    public void postOrder(Node node){

        if(node == null){
            return;
        }

        // recur left
        postOrder(node.getLeft());

        // recur right
        postOrder(node.getRight());

       //  print the value
        System.out.print(node.getKey() + " ");
        postOrderList.add(node.getKey());
    }

    public void inOrder(Node node ){

        if(node == null){
            return;
        }

        inOrder(node.getLeft());

        System.out.print(node.getKey()+" ");
        inOrderList.add(node.getKey());

        inOrder(node.getRight());

    }

    public void preOrder(Node node){

        if(node == null){
            return;
        }

        System.out.print(node.getKey() + " ");
        preOrderList.add(node.getKey());

        preOrder(node.getLeft());

        preOrder(node.getRight());
    }


    //        <<< Code Challenge 16 >>>



    public int findMaxvalue() {

        if(root == null){
            throw new IllegalArgumentException("the tree is empty");
        }

        int max = root.getKey();

        postOrder(root);

        for(int i = 0; i<postOrderList.size(); i++){
            if(max<postOrderList.get(i)){
                max = postOrderList.get(i);
            }
        }
        return max;
    }


    //        <<< Code Challenge 17 >>>

    public ArrayList breadthFirst(BinaryTree tree) {

        if (tree.getRoot() == null) {
            return null;
        }

        LinkedList<Node> nodes = new LinkedList<>() ;
        ArrayList<Integer> finalNodes = new ArrayList<>();

        nodes.add(tree.getRoot());

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();
            finalNodes.add(node.getKey());

            if (node.getLeft() != null) {
                nodes.add(node.getLeft());
            }

            if (node.getRight() != null) {
                nodes.add(node.getRight());
            }
        }
        return finalNodes;
    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    public String toString() {

        if(root == null){
            return "BinaryTree{ " +
                    " root = " + root + " }";

        }else if(root != null && root.getLeft() == null && root.getRight() == null){

            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + null+
                    " right = " + null+
                    " }";

        }else if(root != null && root.getLeft() != null && root.getRight() == null){
            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + root.getLeft().getKey()+
                    " right = " + null+
                    " }";

        }else if(root != null && root.getLeft() == null && root.getRight() != null){
            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + null+
                    " right = " + root.getRight().getKey()+
                    " }";
        }else{
            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + root.getLeft().getKey()+
                    " right = " + root.getRight().getKey()+
                    " }";
        }

    }
}
