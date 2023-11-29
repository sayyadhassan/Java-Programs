package Interview_Practice_Question.Array;

import java.util.Arrays;

public class Rough {
    public static void main(String []args) {
        int[] arr = {2, 3, 4,5,6,7,8};

        int tem,size;
        size = arr.length;

        for(int i=0;i<size; i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]) {
                    tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        System.out.println("Third Largest element is "+arr[size-3]);
    }

}
