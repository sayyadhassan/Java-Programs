package Interview_Practice_Question.Array;

public class Question06_Array_CheckArraySorted {
    public static void main(String []args){
        int []arr = {5,4,3,2};
        int ascending=0;
        int decending=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                ascending ++;
            }
            else if(arr[i]>arr[i+1]){
                decending++;
            }
            if(ascending>0 && decending>0){
                break;
            }
        }
        System.out.println(ascending);
        System.out.println(decending);
        if(ascending == arr.length-1){
            System.out.println("Array is sorted in ascending order");
        }
        else if(decending == arr.length-1){
            System.out.println("Array is sorted in decending order");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
}
