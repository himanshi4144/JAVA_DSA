package Array;

import java.util.HashMap;

public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, 1);

            } else {
                map.put(i, map.get(i) + 1);

            }
        }
        System.out.println(map);
        for (int i : arr) {
            if (map.get(i) > 1) {
                System.out.println(i);
                break;
            }
        }

    }

}
