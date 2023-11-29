package Practice.DSA;

//  Ninja Technique of sorting

public class DSA_Practice05_Array {
    public static int ascending = 0;
    public static int decending = 0;

    public static void checkSorting(int[] array, int index) {
        if (index == array.length - 1) {
            return;
        }
        if (ascending > 0 && decending >0) {
            return;
        }
        if (array[index] < array[index + 1]) {
            ascending++;
        }
        else {
            decending++;
        }
        checkSorting(array, index + 1);
    }

    public static void main(String[] args) {
//        int []arr = {1,2,3,4,5};
        int []arr = {8,7,6,5,4};
//        int[] arr = {1, 2, 3, 0, 4, 5};
        checkSorting(arr, 0);
        System.out.println(ascending + " " + decending);

        if (ascending > 0 && decending > 0) {
            System.out.println("Array is not sorted");
        }

        else if (ascending == arr.length - 1) {
            System.out.println("Array is sorted in Ascending order");

        }

        else {
            System.out.println("Array is sorted in Decending order");
        }
    }
}

// Question - If array is given then we need to check array is sorted in ascending order or array is sorted in
//            decending order or array is not sorted.

// Example 1 :
// Input : array = [1,2,3,4,5]
// Output : Array is sorted in ascending order

// Example 2 :
// Input : array = [5,4,3,2,1]
// Output : Array is sorted in decending order

// Example 3 :
// Input : array = [1,2,3,0,4,5]
// Output : Array is not sorted