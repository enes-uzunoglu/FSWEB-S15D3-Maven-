package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("-----------------------");
        List<Employee> employeeList = new LinkedList<>();
        Employee employee1=new Employee(0,"Enes","Uzunoğlu");
        Employee employee2=new Employee(1,"Fatma Zehra","Uzunoğlu");
        Employee employee3=new Employee(2,"Emrah","Uzunoğlu");
        Employee employee4=new Employee(3,"Bayram","Uzunoğlu");
        Employee employee5=new Employee(4,"Fatma","Uzunoğlu");
        Employee employee6=new Employee(5,"Esma","Uzunoğlu");
        Employee employee7=new Employee(6,"Mehmet Eren","Uzunoğlu");
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee5);
        employeeList.add(employee3);
        employeeList.add(employee1);
        employeeList.add(employee7);
    }

    public static List<Employee> findDuplicates(List<Employee> inputList) {
        List<Employee> duplicatesEmployeeList = new ArrayList<>();
        Set<Employee> seen = new HashSet<>();

        // İlk geçişte, duplicate olanları bulalım
        for (Employee employee : inputList) {
            if (employee != null && seen.contains(employee) && !duplicatesEmployeeList.contains(employee)) {
                duplicatesEmployeeList.add(employee);
            } else if (employee != null) {
                seen.add(employee);
            }
        }

        return duplicatesEmployeeList;
    }

    public static Map<Integer,Employee> findUniques(List<Employee> inputList){
        Map<Integer,Employee> uniquesEmployeeMap=new HashMap<>();
        for (Employee employee:inputList){
            if (!uniquesEmployeeMap.containsValue(employee) && employee!=null){
                uniquesEmployeeMap.put(employee.getId(),employee);
            }
        }
        return uniquesEmployeeMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> inputList){
        List<Employee> singleRecords=new ArrayList<>();
        for (Employee employee:inputList){
            if (singleRecords.contains(employee)){
                singleRecords.remove(employee);
            } else if(employee!=null) {
                singleRecords.add(employee);
            }
        }
        return singleRecords;
    }
}