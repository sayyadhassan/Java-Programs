package Collection_FrameWork;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection13_Map_Using_Collection {
    public static void main(String []args){


        Map<String,Integer> mp = new HashMap<>();
        mp.put("One", 1);
        mp.put("Two",2);
        mp.put("Three",3);
        mp.put("Four",4);
        mp.put(null,5);
        mp.put(null,null);

        mp.put("Two",23);  // Here 23 will override with 2 because key-"Two" is alredy present in the map

//        if(!mp.containsKey("Two")){
//            mp.put("Two",23);
//        }

        mp.putIfAbsent("Two",23);// It will first check "Two" key is present or not if not present then insert 23 for specified key

        System.out.println(mp);

        // Traverse using EntrySet Interface
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.print(e+" ");
        }

        System.out.println();
        System.out.println("All Keys of Collection "+mp.keySet());   // Will print all the keys

        System.out.println("All Values Coresponding to key "+mp.values());    // Will print all the values

        System.out.println("All Entries of Collection "+mp.entrySet());  // Will print all the entries(Key and values)


        // Traverse using KeySet
        Set<String> keys = mp.keySet();
        for(String i : keys){
            System.out.println(i+ " "+mp.get(i));
        }

        System.out.println();

        // Traverse using EntrySet, along with key and value
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.print(e.getKey()+" "+e.getValue()+" ");
        }

        //  entrySet() and keySet() method is defined in Map interface

    }
}
