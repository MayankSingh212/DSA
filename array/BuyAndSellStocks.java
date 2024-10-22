public class BuyAndSellStocks {
    public static void main(String[] args) {
        int [] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int [] arr){
        int maximumProfit = Integer.MIN_VALUE;
        int stockLowestPrice = arr[0];

        for(int i=0;i<arr.length;i++){
            maximumProfit = Math.max(maximumProfit, arr[i]-stockLowestPrice);
            stockLowestPrice = Math.min(stockLowestPrice, arr[i]);
        }

        return maximumProfit;
    }

}


//js code 
// const maxProfit = (arr)=>{
//     let maximumProfit = Number.MIN_VALUE;
//     let stockLowestPrice = arr[0];

//     for(let i=0;i<arr.length;i++){
//         maximumProfit = Math.max(maximumProfit, arr[i]-stockLowestPrice);
//         stockLowestPrice = Math.min(stockLowestPrice,arr[i]);
//     }

//     return maximumProfit;
// }

