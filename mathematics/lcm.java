class lcm{
    int gcd_hcf(int a, int b){
        if(b==0){
            return a;
        }
        return gcd_hcf(b, a%b);
    }

    int lcm(int a, int b){
        return (a*b)/gcd_hcf(a, b);
    }
}