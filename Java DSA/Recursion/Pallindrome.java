package Recursion;

public class Pallindrome {
    static int pallindromeno(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + n % 10;
        return pallindromeno(n / 10, rev);
    }

    public static void main(String[] args) {
        int n = 1221;
        int result = pallindromeno(n, 0);
        // System.out.println(result);
        if (n == result) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not");
        }
    }

}
