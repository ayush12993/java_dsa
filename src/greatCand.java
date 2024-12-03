import java.util.*;

public class greatCand {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2},1));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
 List<Boolean> list = new ArrayList<>();

 int max=0;
        for (int i=0;i<candies.length;i++){
           max= Math.max(max,candies[i]);

        }

             for (int i=0;i<candies.length;i++){
                  if (candies[i]+extraCandies>=max){
                      list.add(true);
                  }
                  else {
                      list.add(false);
                  }

                 }

        return list;
    }
}
