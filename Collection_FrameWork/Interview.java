package Collection_FrameWork;

import java.util.*;

public class Interview {
    public static void main(String []args){
        Map<Integer,String> mp = new HashMap<>();
        mp.put(1,"Hassan");
        mp.put(2,"Vinod");
        mp.put(3,"Rakesh");
        mp.put(4,"Govind");

       Set<Integer> keys = mp.keySet();
       for(Integer e : keys){
           System.out.println(mp.get(e));
       }

       for(Map.Entry<Integer,String> e : mp.entrySet()){
           System.out.println(e.getKey()+" "+e.getValue());
       }
    }
}
