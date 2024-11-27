import java.util.HashMap;

public class buySellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices){
        int max=0, min=prices[0], minIndex=0,maxIndex=0;

        if (prices.length==1){
            return 0;
        }
        for (int i=1;i<prices.length;i++){

            if (max<prices[i]){
                max=prices[i];
                maxIndex=i;
            }
            if (min>prices[i]){
                min=prices[i];
                minIndex=i;
            }

        }

        if ((maxIndex+1)>(minIndex+1)){
            return (maxIndex+1);
        }
        return 0;
    }


}
