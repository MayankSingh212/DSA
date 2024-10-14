public class LargestElementInArray{
    public static void main(String[] args){
        int[] arr = {1, 8, 7, 56, 90};
        int ans = findLargest(arr);
        System.out.println(ans);
    }

    public static int findLargest(int [] arr){
        int largestElement = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largestElement = Math.max(largestElement, arr[i]);
        }
        return largestElement;
    }
}


//js code
// const findLargest = (arr)=>{
//     let largestElement = Number.MIN_VALUE;
//     for(let i =0;i<arr.length;i++){
//         largestElement = Math.max(largestElement, arr[i]);
//     }
//     return largestElement;
// }