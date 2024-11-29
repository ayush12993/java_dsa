import java.util.Arrays;
import java.util.stream.IntStream;

public class arrayConcat {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,1})));
    }
    public static int[] getConcatenation(int[] nums) {

      return IntStream.concat(Arrays.stream(nums),Arrays.stream(nums)).toArray();
    }
}
