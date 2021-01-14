package com.sujeet.in.queue.circular;

import com.sujeet.in.queue.array.ArrayQueue;
import com.sujeet.in.queue.array.Employee;

public class Queue {
    public static void main(String[] args) {

        Employee sujeetKumar = new Employee("Sujeet", "kumar", 124);
        Employee shubhamKumar = new Employee("Shubham", "Kumar", 107);
        Employee vickyChetri = new Employee("Vicky", "Chetri", 136);
        Employee indrajeetGupta = new Employee("Indrajeet", "Gupta", 50);
        Employee vijayJoshi = new Employee("Vijay", "Joshi", 150);

        ArrayQueue queue = new ArrayQueue(5);

//        queue.add(sujeetKumar);
//        queue.add(shubhamKumar);
//        queue.remove();
//        queue.add(vickyChetri);
//        queue.remove();
//        queue.add(indrajeetGupta);
//        queue.remove();
//        queue.add(vijayJoshi);
//        queue.remove();
//        queue.add(sujeetKumar);
//
//        queue.printQueue();

        queue.add(sujeetKumar);
        queue.add(shubhamKumar);
        queue.add(vickyChetri);
        queue.add(indrajeetGupta);
        queue.add(vijayJoshi);

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
//        queue.remove();
        queue.add(vickyChetri);

        queue.printQueue();

//        System.out.println(queue.peek());
    }
}