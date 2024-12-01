import java.util.Arrays;
import java.util.Date;

public class binaryDate {
    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2080-02-29"));
           }
    public static String convertDateToBinary(String date) {


       String[] splitter = date.split("-");
        for (int i=0;i<splitter.length;i++){

          splitter[i]=Integer.toBinaryString(Integer.parseInt(splitter[i]));

        }

        return String.join("-",splitter);
    }
}
