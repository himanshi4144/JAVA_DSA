package Recursion;

public class Recursion {
    static void print_name(int n) {
        // termination condition for the recursion....
        if (n == 0) {
            return;
        }
        System.out.println("Riya");
        // updation and recursive call....
        print_name(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;// intialisation
        print_name(5);
    }

}
