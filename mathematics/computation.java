public class computation {
   int power(int x, int n){
    if(n%2==0){
        return 1;
    }
    int temp = (int) Math.pow(x, n/2);
    temp=temp*temp;
    if(n%2==0){
        return  temp;
    }
    else{
        return temp*x;
    }
   }
}
