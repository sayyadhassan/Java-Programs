package Interview_Practice_Question.Array;

public class Question13_Array_Second_LargestElement {
    public static void main(String []args){
        int[] arr = {3,10,2,7,8,9};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdlargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                thirdlargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("Second largest element is "+thirdlargest);
    }
}
