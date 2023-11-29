package Collection_FrameWork;
import java.util.ArrayList;

class DSA_Saurabh_63_Collection_ArrayList2 {
    public static void main(String[] args) {
        // Can enter Hetrogenous elements
        ArrayList l = new ArrayList(4);
        l.add(7);
        l.add("Rohan");
        l.add('a');
        l.add(99);
        System.out.println(l);

        // Can enter Hetrogenous Elements
        ArrayList a = new ArrayList();
        a.add(2);
        a.add(8);
        a.add(5);
        a.add(9);
        System.out.println(a);

        // Can enter only String objects/values
        ArrayList<String> b = new ArrayList<>();
        b.add("Hassan");
        b.add("Balla");
        b.add("Naveen");
        System.out.println(b);

        // Can inter only Integer Values
        ArrayList<Integer> c = new ArrayList<>();
        c.add(2);
        c.add(4);
        c.add(9);
        c.add(7);
        c.add(2,3);   // Add the element 3 at index no.2 and rest of the elements shifted to imediate to the next index
        c.set(2,9);                // Replace the element of index no. 2 with 9
        c.remove(3);         // Remove the element of index no. 3
        System.out.println(c);

        System.out.println(c.size());  // Print the size of no. of elements in the ArrayList not the total size of ArrayList

        c.addAll(a);                   // Add all the elements of list a to the list c
        System.out.println(c);

        c.retainAll(a);             // Remove all the elements of the list c except duplicate elements and retain all the elements of list a only
        System.out.println(c);

        b.addAll(l);               // Add all the elements of the list l to the list b
        System.out.println(b);

        b.removeAll(l);           // Remove all the elements of list l from list b
        System.out.println(b);

        b.clear();                 // Remove all the elements of list b
        System.out.println(b.isEmpty());  // If list is empty then return true otherwise return false

    }
}