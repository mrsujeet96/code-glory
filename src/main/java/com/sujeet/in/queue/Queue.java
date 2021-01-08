package com.sujeet.in.queue;

public class Queue {
    public static void main(String[] args) {

        Employee sujeetKumar = new Employee("Sujeet", "kumar", 124);
        Employee ShubhamKumar = new Employee("Shubham", "Kumar", 107);
        Employee vickyChetri = new Employee("Vicky", "Chetri", 136);
        Employee indrajeetGupta = new Employee("Indrajeet", "Gupta", 050);
        Employee vijayJoshi = new Employee("Vijay", "Joshi", 150);

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(sujeetKumar);
        queue.add(ShubhamKumar);
        queue.remove();
        queue.add(vickyChetri);
        queue.remove();
        queue.add(indrajeetGupta);
        queue.remove();
        queue.add(vijayJoshi);
        queue.remove();
        queue.add(sujeetKumar);

        queue.printQueue();

    }
}