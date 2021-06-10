package com.sujeet.in.bst;

public class PostOrder {

    public Node createBST(int[] arr, int start, int end) {
        if(start > end) {
            return null;
        }

        Node node = Node.CreateNode(arr[end]);

        int i;
        for(i = end - 1; i >= start; i--) {
            if(arr[i] < node.data) {
                break;
            }
        }

        node.left = createBST(arr, start, i);
        node.right = createBST(arr, i + 1, end - 1);

        return node;
    }
       public void inorder(Node node) {
        if(node == null) {
            return;
        }

        inorder(node.left);

        System.out.print(node.data + " ");

        inorder(node.right);
    }
}
