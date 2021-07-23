package day28_CustomMethodsIntro;

public class VoidMethodsPractice {

    public static void main(String[] args) {

        printEvenNumbers(20, 250);
        printOddNumbers(150, 300);
    }

    public static void printEvenNumbers (int from, int to){
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers (int from, int to){
        for (int i = from; i <= to; i++) {

            if (i % 2 != 0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
}
