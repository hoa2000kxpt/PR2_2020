package Tut_03;

import java.util.Arrays;

public class test {
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;

        int  j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
                System.out.println (i + " "+ j);
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,3,3,3,5};
        removeDuplicates (arr);
        System.out.println (Arrays.toString (arr));
    }
}
