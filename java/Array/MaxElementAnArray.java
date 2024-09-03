package Array;

public class MaxElementAnArray {
    public static void main(String[] args) {
        int array[] = { 1, 3, 12, 52, 32, 1, 0, -2 };
        int max = array[0];
        for (int ele : array) {
            if (max < ele) {
                max = ele;
            }
        }

        System.out.println("max Ele is " + max);
    }
    
}
