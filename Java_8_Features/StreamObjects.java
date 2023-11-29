package Java_8_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjects {
    public static void main(String []args){
        // Stream Object can be created with the help of several ways

        //Method- 1 Blank
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e-> System.out.println(e));

        // Method - 2 String Array
        String []name = {"Rahul","Javed","Mahesh","Gopal"};
        Stream<String> stream1 = Stream.of(name);
        stream1.forEach(e-> System.out.println(e));

        // Stream.of() method only can be used with the objects of wrapper class, it can't be used with Collection

        Integer []arr = {2,3,5,9,8};
        Stream<Integer> stream = Stream.of(arr);
        stream.forEach(e-> System.out.println(e));


        //Mehod-3 Builder
        Stream<Object> stream2 = Stream.builder().build();
        stream2.forEach(e-> System.out.println(e));

        // Method-4 Arrays
        IntStream stream3 = Arrays.stream(new int[] {2,3,5,6,3,8});
        stream3.forEach(e-> System.out.println(e));

        // Mehtod-5 Important- Collection
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(7);

        Stream<Integer> stream4 = list.stream();
        stream4.forEach(e-> System.out.println(e));
    }
}
