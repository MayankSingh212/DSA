public class MaximumSubarray{
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sum(arr));
    }
    public static int sum(int [] arr){
        int maxSumTillHere = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum>maxSumTillHere){
                maxSumTillHere = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxSumTillHere;
    }
}


//js code 
// const sum = (arr)=>{
//     let maxSumTillHere = Number.MIN_VALUE;
//     let sum =0;
//     for(let i=0;i<arr.length;i++){
//         sum += arr[i];
//         if(maxSumTillHere<sum){
//             maxSumTillHere = sum;
//         }
//         if(sum<0){
//             sum = 0;
//         }
//     }
//     return maxSumTillHere;
// }