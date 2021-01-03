package com.sujeet.in.doublylinkedlist;

public class DoublyLinkedList {
    public static void main(String[] args) {
      Employee sujeetkumar= new Employee("Sujeet", "Kumar", 124);
      Employee shubhamsingh = new Employee("Shunham", "Singh", 107);
       Employee vijayjoshi = new Employee("Vijay", "Joshi", 150);
       Employee vickychetri = new Employee("Vicky", "Chetri", 136);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();



        list.addToFront(sujeetkumar);
        list.addToFront(shubhamsingh);
        list.addToFront(vijayjoshi);
        list.addToFront(vickychetri);
        list.printList();
        System.out.println(list.getSize());

    }
}
