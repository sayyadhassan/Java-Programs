package Practice.DSA;

public class DSA_Practice02_Array {
    // Reversing array not only print using Recursion
    public static void reverseArray(int firstIndex,int lastIndex,int []arr){
        if(firstIndex>=lastIndex){
            return;
        }
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
        reverseArray(firstIndex+1,lastIndex-1,arr);
    }

    // Printing array using Recursion
    public static void printArray(int firstIndex, int []arr){
        if(firstIndex ==arr.length-1){
            System.out.print(" "+arr[firstIndex]);
            return;
        }
        System.out.print(arr[firstIndex]+" ");
        printArray(firstIndex +1,arr);
    }


    public static void main(String[] args) {
        int []arr = {2,4,5,9,7,38};
        int m = Math.floorDiv(arr.length,2);

//        // Reversing array using Iterative Mehod
//        for(int i=0;i<m;i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
//        // Printing array using Iterative Method
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        // Reversing array using Recursion
        reverseArray(0,arr.length-1,arr);
        // Printing array using Recursion
        printArray(0,arr);
    }
}
