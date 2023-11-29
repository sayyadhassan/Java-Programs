package Sufiyan_Bhai;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Question : Given list of the objects of Student Class. Find the total avg marks of students "Abu"

class Student3_Class {
    String name;
    int marks;

    Student3_Class(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Student3 {
    public static void main(String args[]) {
        List<Student3_Class> l3 = new ArrayList<>();
        Student3_Class s = new Student3_Class("Abu", 99);
        Student3_Class s2 = new Student3_Class("Hassan", 90);
        Student3_Class s3 = new Student3_Class("Abu", 89);
        Student3_Class s4 = new Student3_Class("Abu", 80);

        Collections.addAll(l3, s, s2, s3, s4);
        List<Student3_Class> list3 = l3.stream().filter(e -> e.equals("Abu")).collect(Collectors.toList());
//        int sum = list3.stream().collect(Collectors.summingInt(value -> value.marks));
//        int avg = sum / list3.size();
//        System.out.println(avg);




        int sum2 = 0;
        for (Student3_Class st2 : list3) {
            sum2 = sum2 + st2.marks;
        }
        System.out.println(sum2);
//
//        Map<String, List<Integer>> stringListMap = new HashMap<>();
//
//
////       list3.forEach(e->{ int avg +=e});


    }
}
