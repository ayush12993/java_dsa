package com.ayushm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        // Input array ke liye function call aur result print karna
        System.out.println(nearestGreatestToRight(new int[]{1, 3, 0, 0, 1, 2, 4}));
    }

    private static List<Integer> nearestGreatestToRight(int[] arr) {
        // Stack data structure use ho raha hai bade elements ko store karne ke liye
        Stack<Integer> st = new Stack<>();
        // Reverse order mein result temporary store karne ke liye
        List<Integer> reverseList = new ArrayList<>();
        // Final result ko store karne ke liye
        List<Integer> resList = new ArrayList<>();
        // Input array ka size nikalna
        int size = arr.length;

        // Array ke har element par reverse order mein loop chala rahe hain (last to first)
        for (int i = size - 1; i >= 0; i--) {
            // Agar stack khali hai to koi bada element nahi mila, -1 add karte hain
            if (st.empty()) {
                reverseList.add(-1);
            } 
            // Agar stack ka top (peek) current element se bada hai to wahi result hoga
            else if (st.size() > 0 && st.peek() > arr[i]) {
                reverseList.add(st.peek());
            } 
            // Agar stack ka top current element se chhota ya barabar hai
            else if (st.size() > 0 && st.peek() <= arr[i]) {
                // Tab tak stack ke elements ko pop karte hain jab tak bada element na mil jaye
                while (!st.empty() && st.peek() <= arr[i]) {
                    st.pop();
                }
                // Agar saare elements pop karne ke baad stack khali ho gaya, to -1 add karte hain
                if (st.empty()) {
                    reverseList.add(-1);
                } else {
                    // Agar bada element mil gaya to usko add karte hain
                    reverseList.add(st.peek());
                }
            }
            // Current element ko stack mein push karte hain
            st.push(arr[i]);
        }
        // Reverse list ko ulta karke final result mein daalna
        reverse(reverseList, resList);
        return resList;
    }

    // Reverse list ko ulta karne ka helper method
    private static void reverse(List<Integer> reverseList, List<Integer> resList) {
        // Reverse list ke elements ko last se first tak iterate karte hain
        for (int i = reverseList.size() - 1; i >= 0; i--) {
            // Final result mein add karte hain
            resList.add(reverseList.get(i));
        }
    }
}
