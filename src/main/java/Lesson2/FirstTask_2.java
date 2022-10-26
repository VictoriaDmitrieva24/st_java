package Lesson2;


public class FirstTask_2 {

    public static void main(String[] args) {
        int n = 2147483647;
        double x = 0.00001;
        double res = myPow(x, n);
        System.out.println(res);
    }

    public static double myPow(double x, int n) {
        if (n == 1) {
            return x;
        }
        if (n == 0 && x == 0) {
            return 1;
        }
        if (n < 0) {
            return myPow(1 / x, -n);
        } else {
            return x * myPow(x, n - 1);
        }
    }
}
