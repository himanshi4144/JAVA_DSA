package Array;

import java.util.Scanner;

public class MaximumAvgSubarray {

    static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        double MaxAvg = sum * 1.0 / k;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            MaxAvg = Math.max(MaxAvg, sum * 1.0 / k);
        }
        return MaxAvg;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 12, -5, -6, 50, 3 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(findMaxAverage(nums, k));
    }

}
