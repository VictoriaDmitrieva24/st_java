package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {

    public static void main(String[] args) {
        String[] words1 = new String[]{"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = new String[]{"amazing", "leetcode", "is"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        Map<String, Integer> count = new HashMap<>();

        for (final String word : words1)
            count.merge(word, 1, Integer::sum);

        for (final String word : words2)
            if (count.containsKey(word) && count.get(word) < 2)
                count.merge(word, -1, Integer::sum);

        return (int) count.values().stream().filter(v -> v == 0).count();
    }
}
