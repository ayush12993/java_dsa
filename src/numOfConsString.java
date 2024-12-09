import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Predicate;

public class numOfConsString {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("abc",new String[]{"a","b","c","ab","ac","bc","abc"}));
//        System.out.println("ab".contains("a")||("ad".contains("b")));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
int count=0;
        for (int i=0;i<words.length;i++){
            for (int j=0;j<allowed.length();j++){
                words[i]=words[i].replace(allowed.charAt(j),' ').replaceAll("\\s+","");
                if (words[i].isEmpty()){
                    count++;
                   break;
                }
            }
        }

   return count;
    }
}
