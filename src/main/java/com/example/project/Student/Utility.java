package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        // Sorting by last name 
        for (int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size() - 1; j++){
                if(list.get(j).getLastName().compareTo(list.get(j + 1).getLastName()) > 0){
                    Student temp = list.set(j , list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        // Sort by full name
        for (int i = 0; i < list.size() - 1; i++){
            if (list.get(i).getLastName().equals(list.get(i + 1).getLastName()) == true){
                if(list.get(i).getFirstName().compareTo(list.get(i + 1).getFirstName()) > 0){
                    Student temp = list.set(i , list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }

        // Sort by grade
        for (int i = 0; i < list.size() - 1; i++){
            if (list.get(i).getFirstName().equals(list.get(i + 1).getFirstName()) == true){
                if (list.get(i).getLastName().equals(list.get(i + 1).getLastName()) == true){
                    if(list.get(i).getGpa() < list.get(i + 1).getGpa()){
                        Student temp = list.set(i , list.get(i + 1));
                        list.set(i + 1, temp);
                    }
                }
            }
        } 

        return list;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Abby", "Smith", 96.7);
        Student s2 = new Student("Michelle", "Jones", 98.1);
        Student s3 = new Student("Chase", "Bean", 95.2);
        Student s4 = new Student("Jack", "Clancy", 97.3);
        Student s5 = new Student("Brittany", "Jones", 95.5);
        Student s6 = new Student("Lisa", "Frank", 92.4);
        Student s7 = new Student("Marie", "Angelina", 96.5);
        Student s8 = new Student("Peter", "Frank", 97.9);
        Student s9 = new Student("Lisa", "Frank", 99.5);
        Student s10 = new Student("Dean", "Jones", 93.2);

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
        ArrayList<Student> expected = new ArrayList<Student>(Arrays.asList(s7,s3,s4,s9,s6,s8,s5,s10,s2,s1));
        sortStudents(students);

        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}

