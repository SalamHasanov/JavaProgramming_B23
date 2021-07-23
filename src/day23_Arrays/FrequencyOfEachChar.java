package day23_Arrays;

public class FrequencyOfEachChar {
    public static void main(String[] args) {

        String str = "aabbccc";

        String removeDup = "";

        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch = str.charAt(i);

            if (removeDup.contains(""+ch)) { // if the character is already contained in removeDup
                continue; // skip it
            }
            removeDup += ch;
        }
        System.out.println(removeDup);
        String result = "";


        for (int j = 0; j <= str.length()-1; j++) {


        char ch = removeDup.charAt(0);
        int frequency = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            char each = str.charAt(i);
            if (each == ch){
                frequency++;
            }
        }


        }
    }
}
