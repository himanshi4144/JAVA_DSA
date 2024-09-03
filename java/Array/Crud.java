package Array;
import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        int ch = 9;
        int index = -1;
        System.out.println("Enter The Size Of Array");
        int n = sc.nextInt();
        arr = new int[n];
        do {
            System.out.println("-----Welcome To CRUD");
            System.out.println("Press 1 For Add Element In Array");
            System.out.println("Press 2 Read Array");
            System.out.println("Press 3 Update Element using Index");
            System.out.println("Press 4 Delete Element using Index");
            System.out.println("Press 9 Exit");
            System.out.print("Enter your input");
            ch = sc.nextInt();

            switch (ch) {
                case 1:if (index < arr.length) {
                    System.out.println("Enter Value To store");
                    int value = sc.nextInt();
                    index = index + 1;
                    arr[index] = value;
                    System.out.println("\n\nValue is Successfully Stored\n");
                } else {
                    System.out.println("Array is Full");
                }
                break;
                case 2:
                    System.out.println("\n\n");
                    for (int i = 0; i <= index; i++) {
                        System.out.print(arr[i] + " --> ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter index");
                    int i = sc.nextInt();
                    System.out.println("Enter Value ");
                    int value = sc.nextInt();

                    arr[i] = value;
                    break;

                case 4:
                    System.out.println("delete");
                    break;

                default:
                    System.out.println("Wrong Input");
                    break;
            }
                   
        } while (ch != 9);
        System.out.println("Thank You");

        sc.close();
    }
}





    

