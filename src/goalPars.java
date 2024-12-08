import java.util.Arrays;
import java.util.Stack;

public class goalPars {
    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)")); ;
    }
    public static String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();

       for (int i=0;i<command.length();i++){

            if (command.charAt(i)==('(')){
                if (command.charAt(i+1)==(')')){
                    stringBuilder.append("o");
                    i+=1;}
                if (i+3<command.length()){
                    if (command.charAt(i+1)==('a')&&command.charAt(i+2)==('l')&&command.charAt(i+3)==(')')){
                        stringBuilder.append("al");
                        i+=3;
                    }}
            }else {
                stringBuilder.append("G");
            }






        }
        return stringBuilder.toString();
    }
}
