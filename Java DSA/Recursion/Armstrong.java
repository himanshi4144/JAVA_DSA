package Recursion;

public class Armstrong {
    static int countDigit(int n, int digits) {
        if (n == 0) {
            return digits;
        }
        return countDigit(n / 10, digits + 1);
    }

    static int findArm(int n, int exponent, int sum) {
        if (n == 0) {
            return sum;
        }
        sum += Math.pow(n % 10, exponent);
        return findArm(n / 10, exponent, sum);
    }

    static boolean isArmstrong(int n) {
        int exponent = countDigit(n, 0);
        int result = findArm(n, exponent, 0);
        System.out.println(result);
        return n == result;
    }

    public static void main(String[] args) {
        if (isArmstrong(1)) {
            System.out.println("Number is an Armstrong..");
        } else {
            System.out.println("Number is not an Armstrong..");
        }
    }
}
