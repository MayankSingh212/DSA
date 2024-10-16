
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void move(int [] arr){
        int startingZero = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                startingZero = i;
                break;
            }
        }
        if(startingZero == arr.length-1 || startingZero == -1){
            return;
        }

        for(int i = startingZero+1; i<arr.length;i++){
        if(arr[i]!=0){
            arr[startingZero] = arr[i];
            arr[i] = 0;
            startingZero ++;
         }
        }
    }
}


//js code
// const move = (arr)=>{
//     let startingZero = -1;
//     for(let i=0;i<arr.length;i++){
//         if(arr[i]==0){
//             startingZero = i;
//             break;
//         }
//     }

//     if(startingZero == -1){
//         return;
//     }
//     for(let i=startingZero+1;i<arr.length;i++){
//         if(arr[i]!=0){
//             arr[startingZero] = arr[i];
//             arr[i] = 0;
//             startingZero++;
//         }
//     }
// }