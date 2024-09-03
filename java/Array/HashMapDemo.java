package Array;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1, 2, 3, 4, 5, 7, 8, 8, 5, 3, 1, 1, 4, 6, 4, 2, 2, 9 };
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        // System.out.println(frequencyMap);
        // frequencyMap.put(1, 3);
        // System.out.println(frequencyMap);
        // System.out.println(frequencyMap.get(1));
        // frequencyMap.put(1, frequencyMap.get(1) + 1);
        // System.out.println(frequencyMap);
        // System.out.println(frequencyMap.containsKey(1));
        // getOrDefault
        for (int i : arr) {
            if (frequencyMap.containsKey(i)) {
                frequencyMap.put(i, 1);

            } else {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            }
        }
        System.out.println(frequencyMap);

    }

}