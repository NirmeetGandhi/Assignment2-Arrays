package Assignment_2_Arrays;

public class Question6 {
    static int binarySearch(int[]arr,int target){
        if (arr.length==0){
            return -1;
        }
        int st=0;
        int en=arr.length-1;
        while (st<=en){
            int mid=st+(en-st)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (target>arr[mid]){
                st=mid+1;
            }
            else {
                en=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int [] arr={}
        System.out.println(binarySearch(new int[]{-1,0,3,5,9,12},9));
    }
}
