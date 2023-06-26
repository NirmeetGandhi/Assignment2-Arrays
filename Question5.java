package Assignment_2_Arrays;

import java.util.Arrays;

public class Question5 {
    static int ans(int[]arr){
        Arrays.sort(arr);

        int en=arr.length-1;
        int ans = arr[en] * arr[en-1] *arr[en-2];
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(ans(new int[]{1,2,3}));
    }
}
