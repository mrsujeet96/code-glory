package com.sujeet.in.bst;

public class Node {
    int data;
   Node left;
   public Node right;



     static Node insert(Node node, int val) {
        if (node == null) {
            return CreateNode(val);
        }

        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if ((val > node.data)) {
            node.right = insert(node.right, val);
        }

        return node;
    }


       public static Node CreateNode(int i) {
        Node node1 = new Node();
        node1.data = i;
        node1.left = null;
        node1.right = null;

        return node1;

    }


}
