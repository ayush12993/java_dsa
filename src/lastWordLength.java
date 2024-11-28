public class lastWordLength {
    public static int lengthOfLastWord(String s) {
         String[] sArray = s.split(" ");
         return sArray[sArray.length-1].split("").length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
