package com.careerit.cj.day7;

import java.util.Arrays;

public class ArrayExample2D {

    public static void main(String[] args) {

            int[][] arr = new int[][]
                    {
                            {1,1,1,1,1,1},
                            {1,0,0,0,0,1},
                            {1,0,0,0,0,1},
                            {1,0,0,0,0,1},
                            {1,1,1,1,1,1},
                            {1,0,0,0,0,1},
                            {1,0,0,0,0,1},
                            {1,0,0,0,0,1},
                            {1,0,0,0,0,1}
                    };
           /*for(int[] ar: arr){
              for(int ele: ar){
                  if(ele == 1){
                      System.out.print("* ");
                  }else{
                      System.out.print("  ");
                  }
              }
               System.out.println();
           }*/

            for(int i=0;i<arr.length;i++){
                int[] ar = arr[i];
                for(int j=0;j<ar.length;j++){
                    if(ar[j] == 1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }
}
