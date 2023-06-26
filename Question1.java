package Assignment_2_Arrays;
import java.util.Arrays;

class Solution {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }

        return maxSum;
    }
}

    public class Question1 {
        public static void main(String[] args) {
            int[] nums = {1, 4, 3, 2};
            Solution s=new Solution();
            int maxSum = s.arrayPairSum(nums);
            System.out.println("Maximized sum: " + maxSum);
        }
    }
