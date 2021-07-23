package day29_ReturnMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

        minNumber(99,102);

        maxNumber(206,205);

    }

    public static int maxNumber(int num1,int num2){
        int max = 0;
        if (num1 > num2){
            max = num1;
        }else{
            max = num2;
        }
        System.out.println(max);
        return max;
    }

    public static int minNumber (int a, int b){
        int min = 0;
        if (a<b){
            min = a;
        }else{
            min = b;
        }
        System.out.println(min);
        return min;
    }

    public static int maxNumberFromIntArray(int[] numbers){
        int max = numbers[0];
        for (int number : numbers) {
            max = maxNumber(max, number);
        }
        return  max;

    }
    public static int minNumberFromIntArray(int[] numbers){
        int min = numbers[0];
        for (int number:numbers){
            min = minNumber(min, number);
        }
        return min;
    }


}
