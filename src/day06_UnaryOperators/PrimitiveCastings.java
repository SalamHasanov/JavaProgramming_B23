package day06_UnaryOperators;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 10;
        long b = a; // implicit casting. automatically done

        double d = 10.0;
        int f = (int) (long) d; // explicit casting

        System.out.println("-------------------------------------------");

        long n = 100;
        short m = (short)n;

        float q = 2.5f;
        int u =(int) q;

        long r = (long) q;

        short s = (short) q;

    }
}
/*
Primitive Castings: converting one primitive type to another

    double > float > long > int > short > byte
    larger primitive type connot be directrly assigned to smaller type
    2 types:
        implicit casting:

        explicit casting:
 */