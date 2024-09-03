package Array;

import java.util.Scanner;

public class MinimumAvgSubarray {
    static double findMinAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        double MinAvg = sum * 1.0 / k;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            MinAvg = Math.min(MinAvg, sum * 1.0 / k);
        }
        return MinAvg;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 12, -5, -6, 50, 3 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(findMinAverage(nums, k));
    }

}
