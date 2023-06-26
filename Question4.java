package Assignment_2_Arrays;

public class Question4 {
    public static boolean ans(int []arr,int n){
        int oneC=0;
        int zeroC=0;
        int st=0;
        if (arr.length==0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
             oneC++;
            }
            else{
                zeroC++;
            }
        }
        if (zeroC==arr.length){
            return true;
        }
        if (oneC==arr.length){
            return false;
        }
        for(int num:arr){
            if (arr[st]==1 && arr[st+1]!=1 && arr[st+2]==0 && arr[st+3]==0){
                n--;
                return true;
            }
            if (arr[st]==0 && arr[st+1]==0){
                n--;
                return true;
            }
        }
    return false;
    }
    public static void main(String[] args) {
        int [] arr={1,0,0,0,1};
        System.out.println(ans(arr,1));
    }
}
