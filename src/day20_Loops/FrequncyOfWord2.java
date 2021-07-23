package day20_Loops;

import java.util.Scanner;

public class FrequncyOfWord2 {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word = new Scanner(System.in).nextLine();
        String sentence = "Java Language is used for programming, java is also used in all different aspects, java owned by Oracle";

        int count = 0;
        //"Python"
        /*
        String str1 = sentence.substring(0, 5);
        String str2 = sentence.substring(1, 6);
        String str3 = sentence.substring(2, 7);
        String str4 = sentence.substring(3, 8);
        String str5 = sentence.substring(4, 9);
        String str6 = sentence.substring(5, 10);
        String str7 = sentence.substring(6, 11);
                 */
        for (int i = 0; i <= sentence.length()-word.length() ; i++) {
            String each = sentence.substring(i, i+word.length());

            if (each.equalsIgnoreCase(word)){
                count++;
            }

        }
        System.out.println("count = " + count);

    }
}
