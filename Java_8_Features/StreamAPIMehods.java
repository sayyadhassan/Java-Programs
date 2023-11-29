package Java_8_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIMehods {
    public static void main(String []args){
        // Filter Mehod
//        List<String> names = List.of("Javed","Farook","Majid","Sahid");
                              // OR
        List<String> names = Arrays.asList("Javed","Farook","Majid","Sahid");
        List<String> newNames = names.stream().filter(i-> i.endsWith("d")).collect(Collectors.toList());
        System.out.println(newNames);

        // Map Mehod
        List<Integer> list = List.of(2,4,8,9,5,7);

//        List<Integer> newList = list.stream().map(e-> e*e).collect(Collectors.toList());
//        System.out.println("Square of no.'s"+newList);
                        //      OR
        // Traverse each elements with the help of for-each lopp
        list.stream().forEach(e-> System.out.print(e*e+" "));
        System.out.println();

        // Sorted Method -- Sort in Ascending order
        list.stream().sorted().forEach(e-> System.out.print(e+" "));
        Collections.sort(list);    // why it's not supported here
        System.out.println(list);


        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,3,8,5,9,4,2);
        Collections.sort(list2);
        System.out.println(list2);


    }
}
