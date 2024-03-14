//problem-statement- buying the stocks and selling the stocks at which day to get more profit
//array indicates the price of the stocks and index values indicates the days
public class SalesAndStocks {
    public static int  stocks(int[] arr){
        int profit=0;
        int buy=arr[0];
        for(int i=1;i<arr.length;i++){
            if(buy<arr[i]){
                profit=Math.max(arr[i]-buy,profit);
            }
            else{
                buy=arr[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        System.out.println(stocks(arr));
        
    }
}
