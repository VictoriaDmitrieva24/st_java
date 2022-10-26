package Lesson2;

public class FirstTask {

    public static void main(String[] args) {
        int n = 2147483647;
        double x = 0.00001;
        double res = myPow(x, n);
        System.out.println(res);
    }

    public static double myPow(double x, int n) {
        if (n < 0) {
            return 1.0 / pow(x, n);
        }
        else {
            return pow(x, n);
        }
    }

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double y = pow(x, n / 2);
        if (n % 2 == 0) {
            return y * y;
        } else {
            return y * y * x;
        }
    }
}