package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray1 {
    public static void main(String[] args) {

        int [][] arr2D = {{1,2,3},{4,5},{6,7,8}};

        System.out.println(arr2D.length);

        System.out.println(arr2D[1][1]);
        System.out.println("____________________________");

        for (int i = 0; i < arr2D.length; i++) {
            int [] each1DArray = arr2D[i];
            for (int each :
                    each1DArray) {
                System.out.println(each);

            }
        }
    }
}
