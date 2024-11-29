public class goodPairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
    public static int numIdenticalPairs(int[] nums) {
        int validator =  nums[0], counter = 0;

             for (int i=0;i<nums.length;i++){
                 validator=nums[i];
                 for (int j=i+1;j<nums.length;j++){
                     if (validator==nums[j]){
                         counter+=1;
                     }
                 }


             }
             return counter;
    }
}
