package bitwise;

public class occurTwoOdd {
    void oddAppearing(int arr[], int n){
        int x=arr[0];
        for(int i=1;i<n;i++){
            x=x^arr[i];
        }
        int k = (x&(~(x-1)));
        int res1=0, res2=0;
        for(int i=1;i<n;i++){
            if((arr[i]&k)!=0){
                res1 = res1^arr[i];
            }
            else{
                res2 = res2^arr[i];
            }
        }
        System.out.println(res1+res2);
    }
}
