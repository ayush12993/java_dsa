import java.lang.reflect.Array;
import java.util.Arrays;

public class plusOneProgram {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));;


    }
    public static int[] plusOne(int[] digits) {


       for (int i=digits.length-1;i>=0;i--){
            if (i==digits.length-1){
                digits[i] = (digits[i]+1);
            }


        }
       return digits;
    }



}
