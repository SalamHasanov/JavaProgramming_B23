package day06_UnaryOperators;

public class OperatorPrecedence {

    public static void main(String[] args) {

        int a = 10, b = 2;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subrtaction: " + (a - b) );
        System.out.println("MultiPlication: " + a * b);
        System.out.println("Division: " + a / b);
        System.out.println("Remainder " + a % b);

        /*
        operator precedence:

        highest: *, /, %
        lowest: -, +
         */

    }
}
