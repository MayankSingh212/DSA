
import java.util.Arrays;

public class RotateArrayByKPlaces {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        //4,3,2,1,7,6,5
        int k = 3;
        k = k % arr.length;
        rotate(arr,0,k);
        rotate(arr,k+1,arr.length-1);
        rotate(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }

}



//js code;
// const rotate = (arr,start,end)=>{
//     while(start<end){
//         let temp = arr[start];
//         arr[start] = arr[end];
//         arr[end]= temp;
//         start++;
//         end--;
//     }
// }

// const fn = (arr,k)=>{
//     rotate(arr,0,k);
//     rotate(arr,k+1,arr.length-1);
//     rotate(arr,0,arr.length-1);
// }
