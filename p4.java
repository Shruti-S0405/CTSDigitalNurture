public class p4 {
    public static void main(String[] args) {
        // int n =5;
        // int toBuy = 3;
        // int[] prices = {5,7,10,3,2};
        int n =3;
        int toBuy = 1;
        int[] prices = {9,5,7};

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i]<prices[j]){
                    int temp = prices[i];
                    prices[i] = prices[j];
                    prices[j] = temp; 
                }
            }
        }
        int sum = 0;
        for(int i=1; i<toBuy; i++){
            sum+= prices[i];
        }
        System.out.println(sum);
    }
}
