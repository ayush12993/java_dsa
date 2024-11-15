class primeFactors {
  void primeFactors(int n){
    if(n<=1){
        return;
    }
    if(n%2==0){
        System.out.println(2);
    }
    if(n%3==0){
        System.out.println(3);
    }
    for(int i=5;i*i<=n;i=i+6){
        if(n%i==0){
            System.out.println(i);
            n=n/i;
        }
        if(n%(i+2)==0){
            System.out.println(i+2);
            n=n/(i+2);
        }
    }
    if(n>3){
        System.out.println(n);
    }
  }    
}
