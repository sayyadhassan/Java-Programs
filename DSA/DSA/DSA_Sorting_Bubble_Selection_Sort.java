package Shradha.DSA;

public class DSA_Sorting_Bubble_Selection_Sort {
    // Print Array
    public static void printArray(int []arr){
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
    public static void main(String []args) {
        int[] arr = {7, 8, 3, 2, 1};

        // 1 - Bubble Short
//        for (int i = 0; i < arr.length - 1;i++){    // Count No. of itteration
//            for(int j=0;j<arr.length-1-i;j++){      // Checking element upto n-1 index
//                // Swap
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        printArray(arr);

        // Selection Short
        int a=0;      // Not need here only to check the no. of itteration
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            a++;
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
        System.out.println();
        System.out.println(a);
    }
}
