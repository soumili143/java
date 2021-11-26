package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
       int[][] arr = new int [2][2];
       System.out.println("enter the elements:");

       for (int r=0; r < arr.length; r++){
           for(int col = 0; col < arr[r].length;col++){
               arr[r][col]=in.nextInt();
           }
       }
     for(int[] a: arr){
         System.out.println(Arrays.toString(a));
     }
    }
}
