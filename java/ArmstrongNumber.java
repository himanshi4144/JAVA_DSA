import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            int m = i;
            int count = 0;
            while (i != 0) {
                count++;
                i = i / 10;
            }
            // System.out.println("count is " + count);

            i = m;
            int result = 0;

            while (i != 0) {
                int digit = i % 10;
                result = result + (int) Math.pow(digit, count);
                i = i / 10;

            }

            i = m;

            // System.out.println("result is " + result);

            if (m == result) {
                System.out.println("Armstrong Number " + m);
            }
        }

        sc.close();
    }
}
