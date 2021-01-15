package com.sujeet.in.hashtable.array;



public class HashtableMain {
    public static void main(String[] args) {

        Employee sujeetKumar = new Employee("Sujeet", "kumar", 124);
        Employee ShubhamKumar = new Employee("Shubham", "Kumar", 107);
        Employee vickyChetri = new Employee("Vicky", "Chetri", 136);
        Employee indrajeetGupta = new Employee("Indrajeet", "Gupta", 050);
        Employee vijayJoshi = new Employee("Vijay", "Joshi", 150);

        ArrayHashtable ht=new ArrayHashtable();
        ht.put("Kumar", sujeetKumar);
        ht.put("Kumar",ShubhamKumar);
        ht.put("Chetri",vickyChetri);
        ht.put("Gupta",indrajeetGupta);
        ht.put("Joshi",vijayJoshi);
//        ht.printHastable();
        System.out.println(ht.get("Kumar"));
    }
}
