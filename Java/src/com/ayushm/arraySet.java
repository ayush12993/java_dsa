package com.ayushm;

public class arraySet {
    public static  boolean canPartition(int[] nums) {
        int max = nums[0],totalSum = nums[0],t=0;
        
        for(int i=1;i<nums.length;i++){
        	if(max==nums[i]) {
        		t+=1;
        	}
        	else {
        		max=max*t;
            if(nums[i]>max){
                max=nums[i];

            }
            totalSum+=nums[i];
        }}
       if(max==(totalSum-max)) {
    		   return true;
    }
        System.out.println("Sum of all arrays are "+max);
        System.out.println("Sum of combined arrays are  "+(totalSum-max));

        return false;
    }
    public static void main(String[] args) {
        System.out.print(canPartition(new int[]{3,3,3,4,5}));
        ;
            }
}
