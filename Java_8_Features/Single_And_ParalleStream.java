package Java_8_Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Single_And_ParalleStream {
    public static void main(String []args){
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8);
        // By Single Stream
        list.stream().forEach(System.out::println);
                   // OR
        Stream<Integer> str = list.stream();
        str.forEach(System.out::println);


        // By Parallel Stream
        list.parallelStream().forEach(System.out::println);
                   // OR
        Stream<Integer> st = list.parallelStream();
        st.forEach(System.out::println);

    }
}
