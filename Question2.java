package Assignment_2_Arrays;

public class Question2 {
    public static int candyAns(int[]candy){
        boolean [] candyType = new boolean[100000];
        int uCount=0;
        for (int i = 0; i < candy.length; i++) {
            if (!candyType[i]){
                candyType[i]=true;
                uCount++;
            }
        }
        int maxEat = candy.length/2;
        if (uCount<maxEat){
            maxEat=uCount;
        }
        return maxEat;
    }
    public static void main(String[] args) {
        int [] candy={1,1,2,2,3,3};
        System.out.println(candyAns(candy));
    }
}
