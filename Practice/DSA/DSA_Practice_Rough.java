package Practice.DSA;

public class DSA_Practice_Rough {
    static boolean duplicate;
    static boolean containsDuplicate(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j= i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    duplicate = true;
                    break;
                }
                if(duplicate){
                    break;
                }
            }
        }
        return duplicate;
    }
    public static void main(String []args){
       int []arr = {2,5,-8,2,9};
        System.out.println(containsDuplicate(arr));
    }
}
