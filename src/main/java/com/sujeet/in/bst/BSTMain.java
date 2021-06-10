package com.sujeet.in.bst;


import java.util.List;

public class BSTMain {
    public static void main(String[] args) {


        Node node = new Node();


// Preorder Bst Main


        PreOrder pr = new PreOrder();
        Node root = null;

        int[] preOrder = {10, 4, 2, 8, 5, 9, 15, 12, 20};


        root = pr.createPreOrderBST(preOrder, 0, preOrder.length - 1);
        System.out.println("PreOrder root node " + root.data);


//          Post Order Main

        PostOrder post = new PostOrder();
        Node root1 = null;

        int[] postOrder = {2, 5, 9, 8, 4, 12, 20, 15, 10};


        root1 = post.createBST(postOrder, 0, postOrder.length - 1);
        post.display(root1);



//Find Closet Element Main

        FindCloset fc = new FindCloset();
        Node root2 = null;

        root2 = node.insert(root2, 9);
        root2 = node.insert(root2, 10);
        root2 = node.insert(root2, 6);
        root2 = node.insert(root2, 8);
        root2 = node.insert(root2, 4);
        root2 = node.insert(root2, 11);
        root2 = node.insert(root2, 5);
        root2 = node.insert(root2, 13);

        Node closestNode = fc.findClosest(root2, 10);

        if (closestNode != null) {
            System.out.println("Find Closet" + closestNode.data);
        }


//        Get Floor and Ceil

        GetFloorCeil getFloorCeil = new GetFloorCeil();
        Node root3 = null;

        root3 = node.insert(root, 6);
        root3 = node.insert(root, 11);
        root3 = node.insert(root, 8);
        root3 = node.insert(root, 4);
        root3 = node.insert(root, 7);
        root3 = node.insert(root, 19);
        root3 = node.insert(root, 9);

        List<Node> data = getFloorCeil.getFloorCeil(root, 4);

        if (data.get(0) != null) {
            System.out.println(data.get(0).data);
        } else {
            System.out.println("Floor doesn't exist for given value");
        }

        if (data.get(1) != null) {
            System.out.println(data.get(1).data);
        } else {
            System.out.println("Ceil doesn't exist for given value");
        }


//        Inorder Predecessor Main
        InorderPredecessor ip = new InorderPredecessor();

        Node root4 = null;

        root4 = node.insert(root, 8);
        root4 = node.insert(root, 15);
        root4 = node.insert(root, 6);
        root4 = node.insert(root, 2);
        root4 = node.insert(root, 7);
        root4 = node.insert(root, 20);
        root4 = node.insert(root, 5);

        Node inorderPredecessor = ip.getInorderPredecessor(root, 7);
        if (inorderPredecessor != null) {
            System.out.println("Inorder Predecessor: " + inorderPredecessor.data);
        } else {
            System.out.println("Inorder Predecessor doesn't exists");
        }

    }


}

