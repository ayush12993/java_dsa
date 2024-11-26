package com.ayushm;

import java.util.HashMap;

public class romantointeger {
	 public static int romanToInt(String s) {
	        String[] romanNumbersArray =s.split("(?!^)");
			HashMap<String, Integer> mapStringHashMap = new HashMap<String, Integer>();
			mapStringHashMap.put("I",1);
			mapStringHashMap.put("IV",4);
			mapStringHashMap.put("V",5);
			mapStringHashMap.put("IX",9);
			mapStringHashMap.put("X",10);
			mapStringHashMap.put("XL",40);
			mapStringHashMap.put("L",50);
			mapStringHashMap.put("XC",90);
			mapStringHashMap.put("C",100);
			mapStringHashMap.put("CD",400);
			mapStringHashMap.put("D",500);
			mapStringHashMap.put("CM",900);
			mapStringHashMap.put("M",1000);
			int total = 0;
			int i=0;
			while(i<romanNumbersArray.length) {
			

				total+= mapStringHashMap.get(romanNumbersArray[i]+romanNumbersArray[i+1]);
					i++;				
				
	
			}
		
			return total;
	    }

public static void main(String[] args) {
		System.out.println(romanToInt("III"));
}
}
