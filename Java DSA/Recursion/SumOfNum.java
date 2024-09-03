package Recursion;

public class SumOfNum {
    public static int sumNumber(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumNumber(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;
        int result = sumNumber(n);
        System.out.println(result);
    }

}
