
public class Addno {
    public static int add(int n) {
        // while(n%10==0)
        // {
        // int rem=rem/10;
        // int sum=n*10+rem;
        // }
        // }
        if (n == 0) {
            return 0;
        }
        return n % 10 + add(n / 10);
    }

    public static void main(String[] args) {
        int n = 2345;
        int result = add(n);
        System.out.println(result);

    }

}
