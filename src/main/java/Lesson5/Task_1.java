package Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_1 {

    public static void main(String[] args) {
        int[] num1 = new int[]{4, 9, 5};
        int[] mum2 = new int[]{9, 4, 9, 8, 4};
        System.out.println(intersect(num1, mum2));
    }

    static public int[] intersect(int[] num1, int[] num2) {
        if (num1.length > num2.length)
            return intersect(num2, num1);

        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (final int num : num1)
            count.put(num, count.getOrDefault(num, 0) + 1);

        for (final int num : num2)
            if (count.containsKey(num) && count.get(num) > 0) {
                ans.add(num);
                count.put(num, count.get(num) - 1);
            }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
