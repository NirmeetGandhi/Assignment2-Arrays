package Assignment_2_Arrays;

public class Question8 {
    public static int miniScore(int[] nums, int k) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }

        int initialScore = maxNum - minNum;

        if (initialScore == 0) {
            return 0;
        }

        int minScore = initialScore;

        for (int i = 0; i < nums.length; i++) {
            int candidate = nums[i];

            int newMin = Math.min(minNum, candidate - k);
            int newMax = Math.max(maxNum, candidate + k);

            int newScore = newMax - newMin;

            minScore = Math.min(minScore, newScore);
        }

        return minScore;
    }
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = miniScore(nums, k);
        System.out.println(minScore);
    }
}
