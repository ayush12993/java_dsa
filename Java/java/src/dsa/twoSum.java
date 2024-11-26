package dsa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class twoSum {
	 public static int[] twoSum(int[] nums, int target) {
	        int diff =0;
	        int[] psoitions = new int[2] ;
	        HashMap<Integer, Integer> objStoreMap = new HashMap();
	        for(int i=0;i<nums.length;i++) {
	        	if(objStoreMap.containsKey(target-nums[i])) {
	        		
	        		psoitions[0] = objStoreMap.get(target-nums[i]);
	        		psoitions[1] = i;
	        		
	        	}
	        	objStoreMap.put(nums[i], i);
	        }
	        return new int[]{psoitions[0],psoitions[1]};
	    }
	 public static void main(String[] args) {
		System.out.println(twoSum(new int[] {2,6,11,7}, 9));
	}
	 
}
