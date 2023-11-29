package Shradha.DSA;

//          Ninja Technique to check all type of sorting array

public class DSA_Shradha_Rough2 {
    public static void maing (String []args){
        int []arr = {4,2,6,3,8,9};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
