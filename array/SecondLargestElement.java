public class SecondLargestElement {
    public static void main(String[] args) {
        int []arr = {12, 35, 1, 10, 34, 1};
        int ans = findSecondLargest(arr);
        System.out.println(ans);
    }

    public static int findSecondLargest(int [] arr){
        int largest = arr[0];
        int secondLargest  = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && largest != arr[i]){
                secondLargest = arr[i];
            }      
        }
        return secondLargest;
    }
}


//js code
// const findSecondLargest = (arr)=>{
//     let largest = arr[0];
//     let secondLargest = Number.MIN_VALUE;
//     for(let i =1;i<arr.length;i++){
//         if(arr[i]>largest){
//             secondLargest = largest;
//             largest = arr[i];
//         }
//         else if(arr[i]>secondLargest && arr[i]!=largest){
//             secondLargest = arr[i];
//         }
//     }
//     return secondLargest;
// }