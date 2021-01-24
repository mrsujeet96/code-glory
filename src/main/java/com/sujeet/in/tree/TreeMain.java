package com.sujeet.in.tree;

public class TreeMain {

    public static void main(String[] args) {
        Tree intTree=new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.traverseInOrder();
        System.out.println();

        System.out.println(intTree.get(27));
        System.out.println(intTree.get(20));
        System.out.println(intTree.get(474));

        System.out.println(intTree.min());
        System.out.println(intTree.max());

        intTree.delete(22);
        intTree.traverseInOrder();
        System.out.println();
    }


}
