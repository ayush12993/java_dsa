import java.util.Arrays;

public class arrayShuffle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[n*2];
        int lo=0;
        for (int i=0;i<n;i++){
           newArray[lo] = nums[i];

           newArray[lo+1]=nums[n+i];

           lo+=2;
           }
        return newArray;
    }
}
