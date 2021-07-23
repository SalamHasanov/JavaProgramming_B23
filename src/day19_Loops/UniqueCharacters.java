package day19_Loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabcceeeejeeeddddldddcccccccc";
        String result = "";

        for (int i = 0; i < str.length()-1; i++) {
            char ch = str.charAt(i); // a, a, b, c, c
            boolean isUnique = str.indexOf(ch) == str.lastIndexOf(ch);
            // if the first and last index number of the character is same , then the character is unique

            if (isUnique){
                result += ch;
            }




        }
        System.out.println("result = " + result);
    }
}
