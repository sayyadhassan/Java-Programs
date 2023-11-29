package Practice.DSA;

public class DSA_Practice03_Array {
    // Using Kadan's Algorithm
    public static void maxSubarray(int []arr){
        int sum =0;
        int maxsum =0;
        for(int i=0;i<arr.length;i++){     //[-2,1,-3,4,-1,2,1,-5,4]
            sum += arr[i];
            if(sum<0){
                sum =0;
            }
            if(sum>maxsum)
            {
                maxsum = sum;
            }
        }
        System.out.println("Maximum sum of max subArray is : "+maxsum);
    }
    public static void main(String[] args) {
        int []arr = {-2,1,-3,4,-1,2,1,-5,4};
//        int []arr = {5,4,-1,7,8};
//        Using itterative method
        maxSubarray(arr);
    }
}

// Question - Given an integer array nums, find the subarray which has the largest sum and return its sum.

//Example 1:
//   Input : nums = [-2,1,-3,4,-1,2,1,-5,4]
//   Output :  6
//   Explanation : [4,-1,2,1] has the largest sum = 6

//Example 2:
//   Input : nums = [ 5,4,-1,7,8]
//   Output : 23

