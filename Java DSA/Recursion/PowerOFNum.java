package Recursion;

public class PowerOFNum {
    static int powerofdigit(int n, int power) {
        if (power == 0) {
            return 1;
        }
        return n * powerofdigit(n, power - 1);
    }

    public static void main(String[] args) {
        int n = 2;
        int power = 4;
        int result = powerofdigit(n, power);
        System.out.println(result);
    }

}
