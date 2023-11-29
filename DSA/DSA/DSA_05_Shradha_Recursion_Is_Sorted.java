package Shradha.DSA;

// Question - Check array is strictly sorted or not.
// Input : {1,2,3,4}
// Output : Array is strictly sorted

// Input : {1,2,2,3}
// Output : Array is not sorted

public class DSA_05_Shradha_Recursion_Is_Sorted {

    public static boolean isSorted(int index,int []arr){
        // Method 1
//        if(index == arr.length-1){
//            return true;
//        }
//        if(arr[index] < arr[index+1]){
//            // array is sorted till now
//             return isSorted(index+1,arr);
//        }
//        else{
//            return false;
//        }

        // Method 2
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] >= arr[index+1]){
            return false;
        }
        return isSorted(index+1,arr);
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,0};
        if(isSorted(0,arr)){
            System.out.println("Array is Strictly Sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
