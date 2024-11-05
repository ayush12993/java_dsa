int countTrailingZeroes(int n){
int zeroes = 0;
for(int i=5;i<=n;i*5){
zeroes=zeroes+n/i;
}
return zeroes;//Time complexity theta of logn
}
