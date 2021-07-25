# Trees

**Binary Tree Data Structure** has  elements and each elemnt has at most 2 children and each child called left and right child. Each `Node` contains:

1. Data

2. Pointer to left child

3. Pointer to right child

**Traversals**:
Traversing a tree allows us to search for a node and print out the contents of a tree.

**Depth First**
Depth first traversal is where we prioritize going through the height of the tree first. There are three methods for depth first traversal:

1. Pre-order: `root >> left >> right`

2. In-order: `left >> root >> right`

3. Post-order: `left >> right >> root`

![Binary Tree Data Structure](https://www.geeksforgeeks.org/wp-content/uploads/binary-tree-to-DLL.png)

## Challenge

This challenge about how to build a binary tree, store **Nodes** in it and apply **Depth First** methods. Also how to build binary search tree class contains `add()` method and `contains` method.

### Methods in Binary Tree class

* `postOrder(Node node)`: depth-first traversal to print and store the nods in array list by `left >> right >> root` way.

* `inOrder(Node node )`: depth-first traversal to print and store the nods in array list by`left >> root >> right` way.

* `preOrder(Node node)`:  depth-first traversal to print and store the nods in array list by`root >> left >> right` way.

### Methods in Binary Search Tree class

* `add(int key)`: Adds a new node with that value in the correct location in the binary search tree.

* `contains(int key)`: Returns boolean indicating whether or not the value is in the tree at least once.

* `traverse (Node current, int key)`: Check the value from `add()` method to put it in the right location.

