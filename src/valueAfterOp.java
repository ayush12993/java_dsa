import java.util.Arrays;

public class valueAfterOp {
    public static void main(String[] args) {
        System.out.println((finalValueAfterOperations(new String[]{"--X","X++","X++"})));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int total = 0;
      for (int i=0;i<operations.length;i++){
          if (operations[i].equals("++X")||operations[i].equals("X++")){
              total+=1;
              }else {
              total-=1;

          }
      }
      return total;
    }
}
