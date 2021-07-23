package day08_ifStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println( !true );//false
        System.out.println( !false  );//true

        System.out.println( true == !false );// true
                           // true == true


        //                  true ! = false
        System.out.println("____________________________________");

        int score = 80;
        boolean passed = score >= 60;
        boolean failed = !passed ;
        // boolean failed = score < 60;
        System.out.println("________________________________________");

        int age = 21;

        boolean eligible = age >=21;
        boolean notEligible = !eligible;
        System.out.println("result A" + 0 + 1);
        System.out.println("rus B" + (1) + (2));
        System.out.println("5 + 2 =" + 3 + 4 );






    }
}
