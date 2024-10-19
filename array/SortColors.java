
import java.util.Arrays;

public class SortColors{
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        System.out.println("Before sorting: "+ Arrays.toString(arr));
        sorting(arr);
        System.out.println("After sorting: " +Arrays.toString(arr));
    }

    public static void sorting(int [] arr){
        int start = 0;
        int mid = 0;
        int end = arr.length-1;
        while(mid<=end){
            if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                arr[mid] = arr[end];
                arr[end] = 2;
                end--;
            }
            else{
                arr[mid] = arr[start];
                arr[start] = 0;
                start++;
                mid++;
            }
        }
    }
}


//js code 
// const sorting = (arr)=>{
//     let start = 0;
//     let mid = 0;
//     let end = arr.length-1;
//     while(mid<=end){
//         if(arr[mid]==1){
//             mid++;
//         }
//         else if(arr[mid]==2){
//             arr[mid] = arr[end];
//             arr[end] = 2;
//             end--;
//         }
//         else{
//             arr[mid] = arr[start];
//             arr[start] = 0;
//             start++;
//             mid++;
//         }
//     }
// }