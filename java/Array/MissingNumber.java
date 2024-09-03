public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int arrsum = 0;
        for (int i : nums) {
            arrsum += i;
        }
        return sum - arrsum;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

}
