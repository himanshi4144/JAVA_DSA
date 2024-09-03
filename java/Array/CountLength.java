package Array;

public class CountLength {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        int count = 0;

        // for (int i : arr) {
        // count++;
        // }
        // System.out.println(count);
        int index = 0;
        while (true) {
            count++;
            index++;
            System.out.println(arr[index]);

        } 
    }
}
