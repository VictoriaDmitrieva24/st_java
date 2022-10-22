package Lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] res = buildArray(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; (0 <= i) && (i < nums.length); i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
