package com.sujeet.in.hashtable.array;

public class ArrayHashtable {
    private Employee[] hashtable;
    public ArrayHashtable(){
        hashtable=new Employee[10];
    }

    public int hasKey(String key){
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee){
        int hashedKey=hasKey(key);
        if(hashtable[hashedKey]!=null){
            System.out.println("sorry this is position already taken "+ hashedKey);
        }else {
            hashtable[hashedKey]=employee;
        }

    }
    public Employee get(String key){
        int hashedKey=hasKey(key);
        return hashtable[hashedKey];
    }

    public void printHastable(){
        for (int i=0;i<hashtable.length;i++){
            System.out.println(hashtable[i]);
        }
    }
}
