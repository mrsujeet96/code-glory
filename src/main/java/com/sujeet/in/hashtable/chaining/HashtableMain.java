package com.sujeet.in.hashtable.chaining;




public class HashtableMain {
    public static void main(String[] args) {
        Employee sujeetKumar = new Employee("Sujeet", "Kumar", 124);
        Employee ShubhamKumar = new Employee("Shubham", "Kumar", 107);
       Employee vickyChetri = new Employee("Vicky", "Chetri", 136);
        Employee indrajeetGupta = new Employee("Indrajeet", "Gupta", 050);
       Employee vijayJoshi = new Employee("Vijay", "Joshi", 150);


       ChainedHashtable ht=new ChainedHashtable();
       ht.put("Kumar",sujeetKumar);

        ht.put("Kumar",ShubhamKumar);
        ht.put("Chetri",vickyChetri);
        ht.put("Gupta",indrajeetGupta);
        ht.put("Joshi",vijayJoshi);
        ht.printHashtable();

//        System.out.println("Retrieve key Chetri: "+ ht.get("Chetri"));
        System.out.println("Retrieve key Kumar: "+ht.get("Kumar"));

        ht.remove("Chetri");
        ht.remove("Kumar");

        System.out.println("\n");
        ht.printHashtable();

//        System.out.println("Retrieve Key Joshi"+ ht.get("Joshi"));
    }
}
