package com.sujeet.in.stacks.linkedlist;

import com.sujeet.in.stacks.linkedlist.Employee;
import com.sujeet.in.stacks.linkedlist.LinkedStack;

public class Stack {
    public static void main(String[] args) {

        Employee sujeetKumar = new Employee("Sujeet", "Kumar", 124);
        Employee shubhamKumar = new Employee("Shubham", "Kumar", 107);
        Employee vickyChetri= new Employee("vicky", "Chetri", 136);
        Employee indrajeetGupta = new Employee("Indrajeet", "Gupta", 050);
        Employee vijayJoshi = new Employee("Vijay", "Joshi", 150);

        LinkedStack stack = new LinkedStack();
        stack.push(sujeetKumar);
        stack.push(shubhamKumar);
        stack.push(vickyChetri);
        stack.push(indrajeetGupta);
        stack.push(vijayJoshi);

        //stack.printStack();

        //System.out.println(stack.peek());
        //stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());


    }
}
