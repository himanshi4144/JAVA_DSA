public class Palindrome {
    static int reversedigit(int n, int rev) {
        if (n == 0) {
            return rev;

        }
        rev = rev * 10 + n % 10;
    
        return reversedigit(n/10, rev);
    
    if(rev==n)

    {
        System.out.println("Palindrome");
    }else
    {
        System.out.println("not");
    }

    public static void main(String[] args) {
        int n = 1223;
        int result = reversedigit(n, 0);
        System.out.println(result);
    }
}
