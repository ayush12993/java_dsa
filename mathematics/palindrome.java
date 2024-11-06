class palindrome{
    boolean isPalindrome(int n){
        int rev=0;//initializing reverse with 0
        int temp=n;//initializing temp with n
        while(temp!=0){
        int ld=temp%10;//suppose 768 then in 1(8)2(6)3(7)
        rev = rev*10+ld;//1(0*10+8)2(8*10+6)3(86*10+7)
        temp=temp/10;//1(76)2(7)3(0)
        
        }
        return (rev==n);//check if 768 is equal to 867
        }
}

