package day23_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        System.out.println(array);

        System.out.println(Arrays.toString(array));

        String[] array2 = new String[5];
        System.out.println(array2);

        System.out.println(Arrays.toString(array2));

        double[] nums = new double[5];

        System.out.println(Arrays.toString(nums));

        String[] students = {"Boburbek", "Aysu", "Abbos", "Sabir"};
        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));


    }
}
