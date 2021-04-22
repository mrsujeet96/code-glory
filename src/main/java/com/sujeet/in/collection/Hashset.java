package com.sujeet.in.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs= new HashSet<>();
        hs.add("India");
        hs.add("US");
        hs.add("UK");
        hs.add("UAE");
        hs.add(" China");

        System.out.println("Hash Set= "+ hs);

        Iterator it=hs.iterator();

        System.out.println("Element using Iterator: ");
        while (it.hasNext()){
            String s=(String)it.next();
            System.out.println(s);
        }
    }
}
