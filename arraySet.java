class arraySet {
    public static  boolean canPartition(int[] nums) {
        int max = nums[0];
        int totalSum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];

            }
            totalSum+=nums[i];
        }
       
        System.out.println(max);
        System.out.println(totalSum-max);

        return false;
    }
    public static void main(String[] args) {
        
        canPartition(new int[]{1,5,11,5});
            }
}