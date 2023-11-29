package Java_8_Features;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPi {

    // Q) Create a list and filter even number

    public static void main(String []args){
        // Question without using Stream
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,3,4,7,98,35,45);
        // Question without using Stream
        List<Integer> listEven = new ArrayList<>();
        for(Integer i : list){
            if(i%2==0){
                listEven.add(i);
            }
        }

        System.out.println(list);
        System.out.println(listEven);


        // Question using Stream
        Stream<Integer> stream = list.stream();
        List<Integer> newList = stream.filter(i-> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
                       //     OR
        List<Integer> newList2 = list.stream().filter(i-> i % 2 ==0).collect(Collectors.toList());
        System.out.println(newList2);

    }
}
