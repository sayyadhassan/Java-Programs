package Practice.DSA;


public class DSA_Practice01_Array {
    // Question 1 -
//    public static void maxElement(int index,int []arr,int max){
//        if(index>=arr.length){
//            System.out.println("Max element of the array is : "+max);
//            return;
//        }
//        if(arr[index] >= max){
//            max = arr[index];
//        }
//        maxElement(index+1,arr,max);
//    }



    // Question 2 -
    public static void minElement(int index,int []arr,int min){
        if(index>=arr.length){
            System.out.println("Minimun element of the array is : "+min);
            return;
        }
        if(arr[index]<=min){
            min = arr[index];
        }
        minElement(index+1,arr,min);
    }




    public static void main(String[] args) {
        // Question 1 - Maximum element of the array
//        int[] arr = {2, 6, 9, 0, 99, 9};
//        int max = Integer.MIN_VALUE;

//        // Using itterative method
////        for (int i = 0; i < arr.length; i++) {
////            if(arr[i]>max){
////                max = arr[i];
////            }
////        }
////        System.out.println("Max element of the array is : "+max);
//
//        // Using Recursion
//        maxElement(0,arr,max);


        // Question 2 - Minimum element of the array
        int[] arr = {2, 3, 4, 8, 1, 9};
        int min = Integer.MAX_VALUE;

        // Using iterative method
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("Minimun element of the array is : " + min);

        // Using Recursion
        minElement(0, arr, min);
    }

}
