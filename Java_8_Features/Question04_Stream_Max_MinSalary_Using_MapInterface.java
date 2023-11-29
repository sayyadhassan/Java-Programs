package Java_8_Features;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


// Question- Minimum and Maximum Salary of the employee

public class Question04_Stream_Max_MinSalary_Using_MapInterface {
    public static void main(String []args){
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Javed",40000);
        mp.put("Naveen",20000);
        mp.put("Jubair",25000);
        mp.put("Rohit",35000);
        // Max and Min according to salary
        mp.values().stream().min(Comparator.comparing(Integer :: intValue)).ifPresent(e-> System.out.println("Minimum Salary "+e));
        mp.values().stream().max(Comparator.comparing(Integer :: intValue)).ifPresent(e-> System.out.println("Maximum Salary "+e));
        // Max and Min according to name
        mp.keySet().stream().max(Comparator.comparing(String :: valueOf)).ifPresent(e-> System.out.println("Maximum Salary "+e));
        mp.keySet().stream().min(Comparator.comparing(String :: valueOf)).ifPresent(e-> System.out.println("Minimum Salary "+e));

    }
}
