package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {
        int [] num1 = {1,2,3};
        int [][] num2 = {{1,2,3},{4,5,6}};
        int [][][] nums = {{{1,2,3},{4,5,6}} ,  {{7,8,9},{10,11,12}}};

        for (int[][] each2d:nums) {

            for (int[] each1D:each2d) {
                System.out.println(Arrays.toString(each1D));
                for (int element : each1D) {
                    System.out.print(element+" ");
                }
                System.out.println();
            }

        }
        System.out.println("_____________________________________________");


        int [][][][] arr4D = {{{{1,2,3},{4,5,6}} ,  {{7,8,9},{10,11,12}}}, {{{13,14,15},{16,17,18}} ,  {{19,8,9},{10,11,25}}}};

    }
}
