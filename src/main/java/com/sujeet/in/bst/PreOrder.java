package com.sujeet.in.bst;


class PreOrder {



    public Node createPreOrderBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        Node node = Node.CreateNode(arr[start]);
        int i;
        for (i = start + 1; i < end; i++) {
            if (arr[i] > node.data) {
                break;
            }
        }
        node.left = createPreOrderBST(arr, start + 1, i - 1);
        node.right = createPreOrderBST(arr, i, end);

        return node;
    }
    
}
