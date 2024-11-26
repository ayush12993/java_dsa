import java.util.HashSet;

public class removeDuplicatesFromArray {
    int removeDuplicates(int[] arr){
        int idx=0;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!hashSet.contains(arr[i])){
                hashSet.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
}
