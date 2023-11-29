package Collection_FrameWork;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Collection10_Set_HashSet_Using_Collection {
    public static void main(String []args){
        Integer [] A = {33,23,88,34,66,77,98};
        Integer [] B = {23,76,66,29,88};

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(A));  // Convert array A into list and add in set1

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(B));  // Convert array B into list and in set 2

        // Union of set1 and set2
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.print("Union of set1 and set2 is : ");
        System.out.println(union);

        union.retainAll(set2);   // Here it will retain the element of set2 which is in the set union
        System.out.println(union);

        // Intersection of set1 and set2
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);      // Here it will retain element of set2 which is in the set intersection
        System.out.print("Intersection of set1 and set2 is : ");
        System.out.println(intersection);

        // Defference of set1 and set2
        Set<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);   // Here it will remove all the element of set2 from set diff
        System.out.println("Difference of set1 and set2 is : ");
        System.out.println(diff);

    }
}
