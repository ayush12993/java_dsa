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
