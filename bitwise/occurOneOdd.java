package bitwise;

public class occurOneOdd {
     int findOdd(int arr[], int n){
        int res=arr[0];
        for(int i=1;i<n;i++){
            res=res^arr[i];
        }
        return res;
     }
}
