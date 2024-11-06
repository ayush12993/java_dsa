class countTrailingZeroesFactorialNumber{
    int countTrailingZeroes(int n){
        int zeroes = 0;
        for(int i=5;i<=n;i*=5){
        zeroes=zeroes+n/i;
        };
        return zeroes;//Time complexity theta of logn
        }
}
//123
/**
 * x=100
 * 
 * zeroes=0
 * 
 * 100/5
 * 20  
 * 20
 * 
 * 100/25
 * 20+4
 * 24
 * 
 * 
 * 100/125 
 * 0
 * 24+0
 * 
 * loop will break
 * 
 * 
 */