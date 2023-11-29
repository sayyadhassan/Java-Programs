package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast_FailSafe_Iteration {
    public static void main(String []args){
        List<String> list = new ArrayList<>();
        list.add("Naveen");
        list.add("Javed");
        list.add("Saif");
//
//        // FailFast Iteration, got ConcurrentModification Exception
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            it.remove();
            System.out.println(name);
            list.add("Noman");
        }
        System.out.println(list);


        System.out.println("------------FailFast and FailSafe Iteration----------");

        // FailFast Iteration
        List<String> list2 = new ArrayList<>();
        list2.add("Mohan");
        list2.add("Rohan");
        list2.add("Rakesh");

        Iterator<String> it2 = list2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
            list2.add("Hassan");     // will not add, generate CuncurrentModification Exception
            list2.remove("Rohan");   // not allowed
            list2.add(1,"Rakesh");   // not allowed
        }
        System.out.println(list2);

        // FailSafe Iteration
        List<String> list3 = new CopyOnWriteArrayList<>();
        list3.add("Naveen");
        list3.add("Javed");
        list3.add("Saif");

        Iterator<String> it3 = list3.iterator();
        while (it3.hasNext()){
            String name = it3.next();
            System.out.println(name);
            list3.add("Noman");    // we can add because it is fail safe itteration
        }
        System.out.println(list3);   // Print 3 time "Noman" because iterator will iterate 3 times
    }
}
