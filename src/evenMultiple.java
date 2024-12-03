public class evenMultiple {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
        System.out.println(smallestEvenMultiple(6));
    }
    public static int smallestEvenMultiple(int n) {
              if (n%2==0){
                  return n;
              }
              return n*2;
    }
}
