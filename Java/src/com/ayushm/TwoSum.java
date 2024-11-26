package com.ayushm;

import java.util.HashMap;

public class TwoSum {
public int[] twoSum(int[] nums, int target) {
        int firstArrayValue = nums[0];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=1;i<nums.length;i++) {
        	if(target-(nums[i]+firstArrayValue)==0) {
        	map.put(0,i );
        		return new int[] {0,1};
        	}
        	System.out.println(map.get(0));
        }
        
        return new int[] {0,1};
    }

public static void main(String[] args) {
	TwoSum twoSumm = new TwoSum();
 System.out.print(twoSumm.twoSum(new int[] {2,7,11,15}, 9));	
}
}
