//this is a basic Java program for sum of n natural numbers
//Time taken c1
int fun1(int n){
       return n* (n+1)/2;
}
//Time taken C2n+c3
int fun2(int n){
int sum =0;
for(int i=0;i<=n;i++){
 sum+=i;

}
return sum;

}

//time taken c4n*n+ c5n+c6

int fun3(int n){
int sum = 0;
for(int i=0;i<=n;i++){
for(int j=1;j<=i;j++){
sum++;
}
}
return sum;

}
