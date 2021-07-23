package day31_MethodOverloading;

import java.util.Arrays;

public class WarmUpTask2 {

    public static int[] addElement(int[] array, int number){
        int[] result = new int[array.length+1];
        int i = 0;
        for (int each: array){
            result [i++] = each;
        }
        result[i] = number;
        return result;
    }// same fuctionality different way

    public static double[] addElement(double[] array, double number){
        double[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = number;
        return result;
    } // returns double

    public static String[] addElement(String[] array, String str){
        String[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = str;
        return result;
    } // returns String


}
