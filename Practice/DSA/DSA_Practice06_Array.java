package Practice.DSA;

public class DSA_Practice06_Array {
    // Sorting in ascending order
    public static void conqure(int []arr,int si,int mid,int ei){
        int []merged = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x=0;
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int []arr,int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conqure(arr,si,mid,ei);
    }

    // Solving problem from here
    public static int mindifference = Integer.MAX_VALUE;
    public static int currdifference ;
    public static void findMinimum(int []arr,int minindex,int maxindex){
        if(maxindex >= arr.length){
            System.out.println("Minimum difference is : "+mindifference);
            return;
        }
        currdifference = arr[maxindex] - arr[minindex];
        if(currdifference < mindifference){
            mindifference = currdifference;
        }
        findMinimum(arr,minindex+1,maxindex+1);
    }
    public static void main(String []args){
        int []arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m =5;
        int l = arr.length;
        // Sorting array using merge sort
        divide(arr,0,l-1);

        // Printing array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();

        // Finding minimum differece
        findMinimum(arr,0,m-1);
    }
}

// Question :  Given an array of N integers where each value represents the number of chocolates in a packet.
//    Each packet can have a variable number of chocolates. There are m students,
//    the task is to distribute chocolate packets such that:
//
//    >  Each student gets one packet.
//    >  The difference between the number of chocolates in the packet with maximum chocolates and
//       the packet with minimum chocolates given to the students is minimum.

// Example1 1 : Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
//           Output: Minimum Difference is 2

//Explanation: We have seven packets of chocolates and we need to pick three packets for 3 students
//             If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

//Example 2 : Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5
//            Output: Minimum Difference is 6
