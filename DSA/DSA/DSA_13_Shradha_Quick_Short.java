package Shradha.DSA;

public class DSA_13_Shradha_Quick_Short {
    public static int partiation(int []arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap laste element (pivot)
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int []arr,int low,int high){
        if(low<high){
            int pvidx = partiation(arr,low,high);
            quickSort(arr,low,pvidx-1);
            quickSort(arr,pvidx+1,high);
        }
    }

    public static void main(String[] args) {
        int []arr = {6,3,9,5,2,1,8};
        int l = arr.length;
        quickSort(arr,0,l-1);

        // print
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
