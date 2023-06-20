package tree.binary;

import java.util.HashMap;

public class Binary_Tree_from_Inorder_and_Postorder {
    static class Node {
        int data;
        Node left, right;
    };

    // Utility function to create a new node
    /* Helper function that allocates a new node */
    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return (node);
    }

    /* Recursive function to construct binary of size n
    from Inorder traversal in[] and Postorder traversal
    post[]. Initial values of inStrt and inEnd should
    be 0 and n -1. The function doesn't do any error
    checking for cases where inorder and postorder
    do not form a tree */
    static Node buildUtil(int in[], int post[], int inStrt,
                          int inEnd)
    {

        // Base case
        if (inStrt > inEnd)
            return null;

        /* Pick current node from Postorder traversal
        using postIndex and decrement postIndex */
        int curr = post[index];
        Node node = newNode(curr);
        (index)--;

        /* If this node has no children then return */
        if (inStrt == inEnd)
            return node;

        /* Else find the index of this node in Inorder
        traversal */
        int iIndex = mp.get(curr);

        /* Using index in Inorder traversal, con
        left and right subtrees */
        node.right = buildUtil(in, post, iIndex + 1, inEnd);
        node.left = buildUtil(in, post, inStrt, iIndex - 1);
        return node;
    }
    static HashMap<Integer, Integer> mp
            = new HashMap<Integer, Integer>();
    static int index;

    // This function mainly creates an unordered_map, then
    // calls buildTreeUtil()
    static Node buildTree(int in[], int post[], int len)
    {

        // Store indexes of all items so that we
        // we can quickly find later
        for (int i = 0; i < len; i++)
            mp.put(in[i], i);

        index = len - 1; // Index in postorder
        return buildUtil(in, post, 0, len - 1);
    }

    /* This function is here just to test */
    static void preOrder(Node node)
    {
        if (node == null)
            return;
        System.out.printf("%d ", node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    // Driver code
    public static void main(String[] args)
    {
       int in[] ={ 1, 2, 3, 4, 5};// { 4, 8, 2, 5, 1, 6, 3, 7 };
        int post[] = { 2, 1, 4, 5,3};//{ 8, 4, 5, 2, 6, 7, 3, 1 };
        int n = in.length;
        Node root = buildTree(in, post, n);
        System.out.print(
                "Preorder of the constructed tree : \n");
        preOrder(root);
    }
}
