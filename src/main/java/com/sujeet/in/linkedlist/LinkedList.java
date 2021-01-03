package com.sujeet.in.linkedlist;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {

        Employee sujeetkumar= new Employee("Sujeet", "Kumar", 124);
        Employee shubhamsingh = new Employee("Shunham", "Singh", 107);
        Employee vijayjoshi = new Employee("Vijay", "Joshi", 150);
        Employee vickychetri = new Employee("Vicky", "Chetri", 136);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(sujeetkumar);
        list.addToFront(shubhamsingh);
        list.addToFront(vijayjoshi);
        list.addToFront(vickychetri);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();



    }
}
