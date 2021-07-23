package utilities;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {





    }


    public static int[] addElement(int[] array, int number) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = number;
        return result;
    }// same fuctionality different way

    public static double[] addElement(double[] array, double number) {
        double[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = number;
        return result;
    } // returns double

    public static String[] addElement(String[] array, String str) {
        String[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = str;
        return result;
    } // returns String

    public static int max(int[] array) {
        int max = array[0];
        for (int each :
                array) {
            max = Math.max(each, max);
        }
        return max;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (double each :
                array) {
            max = Math.max(each, max);

        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int each :
                array) {
            min = Math.min(each, min);
        }
        return min;
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double each :
                array) {
            min = Math.min(each, min);
        }
        return min;
    }

    //merge two arrays of int

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }
        return arr3;

    }
    //merge two arrays of double

    public static double[] merge(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];

        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }
        return arr3;
    }
    //merge two arrays of String

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];

        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }
        return arr3;
    }

    // create a method named remove that accepts one int and one int(index)

    // array = {10, 20, 30, 40}
    // index = 2;

    // remove(array, index) = {10,20,40}
    public static int[] removeElement(int[] array, int index) {
        int[] result = new int[array.length-1];
        for (int i = 0, j=0; i < array.length ; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];


        }
        return result;



    }

}

