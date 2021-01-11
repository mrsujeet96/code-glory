package com.sujeet.in.stacks.array;

public class ArrayStackMain {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("sujeet", "kumar", 124));
        stack.push(new Employee("Shubham", "kumar", 107));
        stack.push(new Employee("Indrajeet", "Gupta", 150));
        stack.push(new Employee("Vicky", "Chetri", 136));
        stack.push(new Employee("Vijay", "Joshi", 124));


//        stack.printStack();
        System.out.println(stack.peek());
//        stack.printStack();
        System.out.println("Popped" + stack.pop());
        System.out.println(stack.peek());
    }
}
