package Lesson1;

public class SecondTask {


    public static void main(String[] args) {
        int[] nums = {0, 2, 2, 5, 3, 4};
        int val = 2;
    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
