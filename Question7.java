package Assignment_2_Arrays;

public class Question7 {
    static boolean ans(int [] nums){
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(ans(new int[]{1,2,2,3}));
    }
}
