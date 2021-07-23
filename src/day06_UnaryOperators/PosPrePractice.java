package day06_UnaryOperators;

public class PosPrePractice {
    public static void main(String[] args) {

        int a = 1;
        a = -a-- + a++ / -a-- * --a;//a=1-1=0
        System.out.println("a = " + a);
            // -1 + 0 + 1 = 0

        int x = 10;

        x = ++x - x-- + x++ + --x;
        System.out.println("x = " + x);
        int y = 50; //y = 50+1=51
        int z = -y++ + --y - ++y + y--;
        // z = -50 + 50
        System.out.println("z = " + z);

    }
}
