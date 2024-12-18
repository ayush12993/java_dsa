import java.util.Arrays;

public class arrSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference(new int[]{10,4,8,3})));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] leftArr = new int[nums.length];
         int left=0,right=0;
        for (int i=0;i<nums.length;i++){
              leftArr[i] += (left+=nums[i]);
              leftArr[nums.length-i-1] +=(-(right+=nums[nums.length-i-1]));
            if (i>=nums.length/2){
                if (leftArr[nums.length-i-1]<0){
                    leftArr[nums.length-i-1] = -(leftArr[nums.length-i-1]);
                }
                if (leftArr[i]<0){
                    leftArr[i] = -(leftArr[i]);
                }
            }
          }
        return leftArr;
    }
}
