
public class Reverseno {
    public static int reversedigit(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + n % 10;
        return reversedigit(n / 10, rev);
    }

    public static void main(String[] args) {
        int result = reversedigit(2365, 0);
        System.out.println(result);
    }

}
