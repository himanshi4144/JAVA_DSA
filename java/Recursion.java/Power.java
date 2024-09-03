public class Power {
    public static int powerno(int num, int power) {
        if (power == 0) {
            return 1;
        }
        return num * powerno(num, power - 1);
    }

    public static void main(String[] args) {
        int num = 2;
        int power = 3;
        int result = powerno(num, power);
        System.out.println(result);
    }

}
