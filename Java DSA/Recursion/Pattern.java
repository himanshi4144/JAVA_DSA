package Recursion;

public class Pattern {
    static void printstar(int cur) {
        if (cur == 0) {
            return;
        }
        System.out.print("*");
        printstar(cur - 1);

    }

    static void pattern(int n, int a) {
        // int cur = 5;
        if (n == 0) {
            return;
        }
        printstar(a);
        System.out.println();
        pattern(n - 1, a + 1);

    }

    public static void main(String[] args) {
        pattern(5, 1);
    }

}
