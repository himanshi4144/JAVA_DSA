import java.util.Scanner;

public class Condition {
     public static void main(String[] args) {

        // user
        // input take input from user
        int a = 10;

        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        System.out.println(userInput);
        if (a > 20 == true) {

        System.out.println("yes a is greater then 20 " + a);
        } else {
        System.out.println("No a is not grater then 20 " + a);
        }
    }
}
