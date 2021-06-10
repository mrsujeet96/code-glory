package com.sujeet.in.bst;

import java.util.ArrayList;
import java.util.List;

public class GetFloorCeil {


    public List<Node> getFloorCeil(Node node, int val) {
        if (node == null) {
            return new ArrayList<>();
        }

        Node floor = null;
        Node ceil = null;

        while (node != null) {
            if (val < node.data) {
                ceil = node;
                node = node.left;
            } else if (val > node.data) {
                floor = node;
                node = node.right;
            } else {
                ceil = floor = node;
                break;
            }
        }

        List<Node> result = new ArrayList<>();
        result.add(floor);
        result.add(ceil);

        return result;
    }


}
