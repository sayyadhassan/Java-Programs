package Practice.DSA;

public class DSA_Practice04_Array {

    // Using itterative method
//    static boolean isDuplicate = false;
//    public static boolean containsDuplicte(int []num){
//        for(int i=0;i< num.length;i++) {
//            for (int j = i+1; j < num.length; j++) {
//                if (num[i] == num[j]) {
//                    isDuplicate = true;
//                    break;          // This break terminate the inner for loop when condition being met
//                }
//            }
//
//            if(isDuplicate){
//                break;                // This brek terminate the outer for loop/main loop
//            }
//        }
//        return isDuplicate;
//    }

    //Using Recursive Method
    public static boolean isDuplicate = false;
    public static boolean containsDuplicate(int []arr,int index,int currIndex){
        if(index == arr.length-2){
            return isDuplicate;
        }
        if(currIndex == arr.length-1){
            index++;
            currIndex = index + 1;
        }
        if(arr[index] == arr[currIndex]){
            isDuplicate = true;
        }
        return containsDuplicate(arr,index,currIndex+1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 8, 3, 6};
        // Using itterative method
//        System.out.println(containsDuplicte(arr));

        // Using recursive method
        containsDuplicate(arr,0,1);
    }
}

// Question - Given an integer array nums, return true if any value appears at least twice in the array, and
//            return false if every element is distinct.

// Example 1 :
//    Input : nums = [1,2,3,1]
//    Output :  true

// Example 2 :
//   Input : nums = [1,2,3,4]
//   Output :  false