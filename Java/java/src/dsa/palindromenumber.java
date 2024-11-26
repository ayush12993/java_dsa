package dsa;

public class palindromenumber {
	
	public static boolean isPalindrome(int s) {
		if(s<0) {
			return false;
		}
		int temp=s;
		int onlyForLengthString = Integer.toString(s).length();
		int res=0;
		for (int i=0;i<Integer.toString(s).length();i++) {
		while(temp!=0) {
			int ld = temp%10;
			res = res*10 +ld;
			temp = temp/10;
		}
		}
		return (res == s);
	}
     public static void main(String[] args) {
	 System.out.println(isPalindrome(121));        	
	}
}
