public class stringScore {
    public static void main(String[] args) {
        System.out.println(scoreOfString("zaz"));
    }
    public static int scoreOfString(String s) {
        char[] arrSpl = s.toCharArray();
        int ans=0;
        for (int i=1;i<arrSpl.length;i++){
            char char_as_o = (char)arrSpl[i-1];
            int ascii_one = char_as_o; char char_as_ao = (char)arrSpl[i];
            int ascii_abone = char_as_ao;
            if (ascii_one-ascii_abone<0){
                ans+=(-(ascii_one-ascii_abone));
            }else {
                ans+=(ascii_one-ascii_abone);
            }

        }
       return ans;
    }
}
