package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class DSA_Saurabh_63_Collection_List_ArrayList {
    public static void main(String[] args) {
        ArrayList l2 = new ArrayList(3);
        l2.add("Abhisek");
        l2.add(2);
        l2.add("Anil");
        // Printing the list
        Iterator i = l2.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        l2.add(2,"Subhankar");     // Add Subhankar at index no.2
        l2.remove(0);                     // Remove element of index no.0

        System.out.println();

        ArrayList l = new ArrayList();
        l.add("Hassan");
        l.add(3);
        l.add("Naveen");
        l.add(2);
        l.add(l2);
        Iterator i2 = l.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
        System.out.println(l.contains("Hassan"));  // Return true if specified object/value is present in this list
        System.out.println(l.get(2));              // Return the object at the specified index no.
        System.out.println(l.isEmpty());      // If Collection l is empty then return true otherwise false
        l.clear();                            // Remove all the elements of Collection l
        System.out.println(l.isEmpty());

    }
}