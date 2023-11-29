package com.company;

public class SMH_28_Ch6_2D_Arrays {
    public static void main(String[] args) {
//        int []marks;                // 1-D Array

//        int [][]flat;              // 2-D Array
//        flat = new int [2][3];

        // Initalization using index in 2-D Array
//        flat[0][0]=1001;     //  Row - 0
//        flat[0][1]=1002;
//        flat[0][2]=1003;
//
//        flat[1][0]=2001;    // Row - 1
//        flat[1][1]=2002;
//        flat[1][2]=2003;

        //Initialization and decalaration together in 2-D array
        int [][]flat = {{2002,203,204},{205,206,207}};

        // Displaying 2-D Array using (for loop)
        for(int i =0;i<flat.length;i++){
            for(int j=0;j<flat[i].length;j++){
                System.out.print(flat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
