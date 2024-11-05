//this is a basic Java program for sum of n natural numbers

int fun1(int n){
       return n* (n+1)/2;
}

int fun2(int n){
int sum =0;
for(int i=0;i<=n;i++){
 sum+=i;

}
return sum;

}

int fun3(int n){
int sum = 0;
for(int i=0;i<=n;i++){
for(int j=1;j<=i;j++){
sum++;
}
}
return sum;

}
