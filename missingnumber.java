public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int n = nums.length;

        int missing = findMissingNumber(nums, n);
        System.out.println("Output: " + missing);
    }

    static int findMissingNumber(int[] nums, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}