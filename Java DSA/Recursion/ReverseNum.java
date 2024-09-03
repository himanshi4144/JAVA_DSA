package Recursion;

public class ReverseNum {
    static int reverseno(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + n % 10;
        return reverseno(n / 10, rev);

    }
    // static void reversedigit(int n, int rev) {
    // rev = rev + n;
    // }

    public static void main(String[] args) {
        int n = 12345;
        int result = reverseno(n, 0);
        System.out.println("reverse no is:" + result);
        // System.out.println(reversedigit(1234, 0));
    }

}
