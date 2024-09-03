public class Sort012 {

    static void sort012(int arr[]) {
        int n = arr.length;
        int zerocount = 0;
        int onecount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zerocount++;
            } else if (arr[i] == 1) {
                onecount++;
            }
        }
        for (int i = 0; i < zerocount; i++) {
            arr[i] = 0;
        }
        for (int i = zerocount; i < zerocount + onecount; i++) {
            arr[i] = 1;
        }
        for (int i = zerocount + onecount; i < n; i++) {
            arr[i] = 2;
        }

    }

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 2, 1, 2, 0, 2, 1, 0, 1, 2, 0, 2, 1, 2, 0 };
        sort012(arr);
        printArr(arr);
    }

}
