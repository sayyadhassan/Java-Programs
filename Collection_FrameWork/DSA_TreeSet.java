package Collection_FrameWork;

import java.util.Iterator;
import java.util.TreeSet;

public class DSA_TreeSet {
    public static void main(String []args){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(43);
        ts.add(32);
        ts.add(89);
        ts.add(54);
        System.out.println(ts);

        // Print list using Iterator
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Print list using for-each-loop

        for(Integer e : ts){
            System.out.print(e+" ");
        }
    }
}
