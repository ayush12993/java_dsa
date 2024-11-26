package dsa;

public class palindromeString {
	public static boolean checkStringPalin(String s) {
		String clean = s.replaceAll("[^a-zA-Z0-9]", "");
		String[] arrStrings = clean.toLowerCase().split("");
		for(int i=0;i<clean.length()/2;i++) {
			if (!arrStrings[i].equals(arrStrings[clean.length()-1-i])) {
				return false;
			}
				
		}
		return true;
	}
   public static void main(String[] args) {
	System.out.println(checkStringPalin(" "));
}
   
}
