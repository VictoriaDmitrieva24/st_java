package Lesson2;

public class ThirstTask {
    public static void main(String[] args) {
        int n = 10;
        int res = climbStairs(n);
        System.out.println(res);
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int x1 = 1, x2 = 2;
        for (int i = 3; i < n; i++) {
            int temp = x2;
            x2 += x1;
            x1 = temp;
        }
        return (x1 + x2);
    }
}
