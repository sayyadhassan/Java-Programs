package Interview_Practice_Question.Array;

public class Question06_Array_Duplicate_Element {
    static boolean isDuplicate;
    public static boolean checkDuplicate(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    System.out.println(arr.length);
                    System.out.println(arr.length-1);
                    System.out.println(i+" "+j);
                    break;
                }
                if(isDuplicate){
                    break;
                }
            }
        }
        return isDuplicate;
    }

    public static void main(String []args){
        int []arr = {2,3,7,7};
        System.out.println(checkDuplicate(arr));
    }
}
