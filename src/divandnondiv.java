public class divandnondiv {
    public static void main(String[] args) {
        System.out.println(differenceOfSums(5,1));
    }
    public static int differenceOfSums(int n, int m) {
        int div =0;
        int non_div = 0;
        for (int i=1;i<=n;i++){
            if ((i%m==0)){
                div+=i;
            }
            else {
                non_div+=i;
            }

        }
        return non_div-div;
    }
}
