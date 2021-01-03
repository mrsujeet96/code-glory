package com.sujeet.in.vector;

import java.util.List;

public class Vector {
    public static void main(String[] args) {
        List<Employee> employeeList=new java.util.Vector<>();
        employeeList.add(new Employee("sujeet","kumar",124));
        employeeList.add((new Employee("Shubham","Singh", 107)));
        employeeList.add((new Employee("Vijay","Joshi", 150)));
        employeeList.add((new Employee("Vicky","Chetri", 136)));

        employeeList.forEach(employee-> System.out.println(employee));



    }
}
