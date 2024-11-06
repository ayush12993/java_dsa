 class isPrime {
     boolean checkPrime(int n){//checking whether it is a prime number or not

        if(n==1) {return false;}// if nis 1 then it is not prime
        if(n==2 || n==3){ return true;}// if n is 2 or 3 it is prime
        if(n%2==0 || n%3==0){//divisible by 2 or 3 then it is not prime
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){//5,11,17,23,29like this as follows
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
     }
}
