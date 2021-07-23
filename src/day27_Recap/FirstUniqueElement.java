package day27_Recap;

import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {


        int[] nums = {1, 1, 2, 3, 3, 4};
        int firstUniqueElement = 0;
        int frequency = 0;

        for (int j = 0; j < nums.length; j++) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums[j]) {
                    frequency++;
                }

            }
            if (frequency == 1);
            // firstUniqueElement = nums[j];
            //break;


            System.out.println(nums[j]);
            break;
        }
        System.out.println(frequency);

    }
}


