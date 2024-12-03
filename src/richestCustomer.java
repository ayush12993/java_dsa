public class richestCustomer {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] {{1,5},{3,7},{3,5}}));
        System.out.println(optMaximumWealth(new int[][] {{1,5},{3,7},{3,5}}));
    }
    public static int maximumWealth(int[][] accounts) {
            int length = accounts.length;
            int tLength = accounts[0].length;
            int calC=0,foundOne=0;
           for (int i=0;i<length;i++){
                for (int j=0;j<tLength;j++){

                   calC+=accounts[i][j];
                    if (j==(accounts[0].length-1)){

                        if (calC>foundOne){
                            foundOne=calC;
                            calC=0;
                        }
                        else {
                            calC=0;
                        }

                    }
                }

            }
            return foundOne;
    }
    public static int optMaximumWealth(int[][] accounts) {
        int length = accounts.length;
        int tLength = accounts[0].length;
        int calC=0,foundOne=0;
        for (int i=0;i<length;i++){

            calC=0;
            for (int j=0;j<tLength;j++){

                calC+=accounts[i][j];

            }
            foundOne=Math.max(calC,foundOne);
        }
        return foundOne;
    }
}
