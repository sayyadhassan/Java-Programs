package Collection_FrameWork;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Collection_Arrays_Class {
    public static void main(String []args){
        int []number = {7,9,4,5,6};
        System.out.println(Arrays.binarySearch(number,5));  // it will return index of the element if present

        Arrays.sort(number);
        for(int i : number){
            System.out.print(i+" ");
        }

        List<Integer> li = new ArrayList<>();
//        li.addAll(Arrays.asList(number));
    }
}
