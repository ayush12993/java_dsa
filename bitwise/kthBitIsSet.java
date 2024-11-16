package bitwise;

public class kthBitIsSet {
    public void isKthBit(int n,int k){
        int x = (1<<(k-1));
        if((n&x)!=0){
          System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
