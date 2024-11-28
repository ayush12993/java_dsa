import java.util.HashMap;

public class NGL {
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2}));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> nums2Map = new HashMap<>();
        int nums1Length = nums1.length, nums2Length = nums2.length,actLength;


        for (int j=0;j<nums2Length;j++){

            nums2Map.put(nums2[j],j);

           // System.out.println(nums2Map.get(i));
        }
        for (int i=0;i<nums1Length;i++){
            System.out.println(nums2Map.containsKey(nums1[i])+" "+nums1[i]+" "+nums2Map.get(nums1[i]));
        }
        return new int[]{0,1};
    }

}
