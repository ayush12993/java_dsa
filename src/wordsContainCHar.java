import org.jetbrains.annotations.NotNull;

import java.util.*;

public class wordsContainCHar {
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"},'a'));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
      List<Integer> list = new ArrayList<>();
       for (int i=0;i<words.length;i++){


             int charArrayLength = words[i].toCharArray().length;
           for (int j=0;j<charArrayLength;j++){
               if (words[i].charAt(j)==x){

                      list.add(i);
                    break;
               }

           }

       }
       return list;
    }
}
