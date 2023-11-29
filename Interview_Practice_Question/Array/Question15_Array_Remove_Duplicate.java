package Interview_Practice_Question.Array;

import java.util.Arrays;

public class Question15_Array_Remove_Duplicate {
    public static void main(String []args){
        int []arr = {3,4,2,1,1,8,9,0,9,8};

        Arrays.sort(arr);
        int l = arr.length;
        int []temp = new int [l];
        int j=0;
        for(int i=0;i<l-1;i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }

        }
        temp[j++] = arr[l-1];

        for(int k=0;k<temp.length;k++){
            System.out.print(temp[k]+" ");
        }

    }
}
