import java.util.ArrayList;
import java.util.List;

public class checkStringAcronym {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        System.out.println(isAcronym(words,"abc"));
    }
    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<words.size();i++){
              builder.append(words.get(i).charAt(0));
          }
          if (builder.toString().equals(s)){
            return true;
          }
          return false;
    }
}
