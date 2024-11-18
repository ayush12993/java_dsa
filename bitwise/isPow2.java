package bitwise;

public class isPow2 {
  boolean isPow2(int n){
    return n>0 && (n&(n-1))==0;
  }
}
