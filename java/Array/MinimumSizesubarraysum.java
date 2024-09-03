package Array;

import java.util.Scanner;

public class MinimumSizesubarraysum {
    static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        // int target = sc.nextInt();

        System.out.println(minSubArrayLen(7, nums));
    }
}
