package Lesson2;

public class SecondTask {
    public static void main(String[] args) {
        int n = 16;
        boolean res = isPowerOfTwo(n);
        System.out.println(res);
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n % 2 != 0 || n <= 0) return false;

        return isPowerOfTwo(n / 2);
    }
}
