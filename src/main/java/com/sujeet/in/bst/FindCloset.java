package com.sujeet.in.bst;

public class FindCloset {
    public Node findClosestElement(Node node, int value) {
        if (node == null) {
            return null;
        }

        int minDiff = Integer.MAX_VALUE;
        Node closestNode = null;

        while (node != null) {
            int curDiff = Math.abs(node.data - value);

            if (curDiff < minDiff) {
                minDiff = curDiff;
                closestNode = node;
            }

            if (value < node.data) {
                node = node.left;
            } else if (value > node.data) {
                node = node.right;
            } else {
                break;
            }
        }
        return closestNode;
    }
    }
