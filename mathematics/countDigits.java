class  countDigits{
    int countDigits(int x){
        int res=0;//setting result value to 0
        while(x>0){//iterating x till it is greater than 0
        x=x/10;//we divide until it gives 10
        res++;//we increment it by 1
        }
        return res;//then we will return the result
        }
}
//123
/**
 * x=123
 * 
 * res=0
 * 
 * 123/10
 * 12  
 * 1
 * 
 * 12/10
 * 1
 * 1+1
 * 
 * 
 * 1/10 
 * 0
 * 1+1+1
 * 
 * loop will break
 * 
 * 
 */