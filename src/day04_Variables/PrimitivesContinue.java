package day04_Variables;

public class PrimitivesContinue {
    /*
    char: designed for single character
    boolean: true or false

     */
    public static void main(String[] args) {

        char ch1 = '#';
        char ch2 = 35;
        char ch3 = 'Z', ch4 = 90;

        System.out.println("ch1 = " + ch1);
        System.out.println("ch1 = " + ch2);
        System.out.println("ch3 = " + ch3);
        System.out.println("ch4 = " + ch4);

        char ch5 = 15000;
        System.out.println("ch5 = " + ch5);
        char ch6 = 65000;
        System.out.println("ch6 = " + ch6);
        char ch7 = 15 + 25;
        System.out.println("ch7 = " + ch7);

        boolean r1 = 10 < 9;
        System.out.println("r1 = " + r1);

        boolean r2 = true;
        boolean r3 = false;

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        boolean r4 = "Java" == "Python"; // equal operator: "=="
        System.out.println("r4 = " + r4);


    }


}
