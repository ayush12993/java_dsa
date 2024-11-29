import java.util.Arrays;

public class defangip {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("192.12.13.14"));
    }
    public static String defangIPaddr(String address) {


        return String.join("[.]",address.split("\\."));
    }
}
