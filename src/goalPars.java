import java.util.Arrays;
import java.util.Stack;

public class goalPars {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)")); ;
    }
    public static String interpret(String command) {
        String[] splt = command.split("");
        StringBuilder stringBuilder = new StringBuilder();

        int t=0;
       for (int i=0;i<splt.length;i++){
           if ((!splt[i].contains("(") )&&(!splt[i].contains(")"))){
              stringBuilder.append(splt[i]);
           }
           if (i<splt.length-1){
               if ((splt[i].contains("(") )&&(splt[i+1].contains(")"))){
                   stringBuilder.append("o");
               }
           }

       }
        return stringBuilder.toString();
    }
}
