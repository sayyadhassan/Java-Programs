package Interview_Practice_Question.Array;

 // Find mximum sum of the sub array

public class Question05_Array_MaxSum_SubArray {
    public static void main(String []args){
        int []arr={3,4,-7,4,5,-2,3,-7};

        int sum =0;
        int maxsum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum<0){
                sum =0;
            }
            if(maxsum < sum){
                maxsum = sum;
            }
        }

        System.out.println("Maximum sum of the sub array is "+maxsum);
    }
}
