package Collection_FrameWork;

import java.util.*;

public class Rough {
    public static void main(String []args){
        Map<Integer,String> mp = new HashMap<>();
        mp.put(1,"One");
        mp.put(2,"Two");
        mp.put(3,"Three");

        for(Map.Entry<Integer,String> e : mp.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        Set<Integer> key = mp.keySet();
        for(Integer e : key){
            System.out.println(mp.get(e));
        }

    }
}
