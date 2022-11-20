package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task_3 {

    public static void main(String[] args) {
        boolean res = containsNearbyDuplicate(new int[] {1,0,1,1}, 1);
        System.out.println(res);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();

        for (int i=0; i< nums.length; i++){
            if (map.containsKey(nums[i])) {

                if (i - map.get(nums[i]) <= k)
                    return true;

            }
            map.put(nums[i], i);
        }
        return false;
    }
}
