
import java.util.ArrayList;

public class ArrayLeaders{
    public static void main(String[] args) {
        int [] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));
    }

    //most optimal
    public static ArrayList<Integer> leaders(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int largestTillNow = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>largestTillNow){
                largestTillNow = arr[i];
                list.add(arr[i]);
            }
        }

        return list;
    }
}


//js brute force approach 
// const leaders = (arr)=>{
//     const stack = [];
//     const ans = [];

//     for(let i=arr.length-1;i>=0;i--){
//         if(stack.length!==0 && stack[stack.length-1]>arr[i]){
//             continue;
//         }

//         while(stack.length!==0 && stack[stack.length-1]<arr[i]){
//             stack.pop();
//         }

//         if(stack.length===0){
//             ans.push(arr[i]);
//             stack.push(arr[i]);
//         }
//     }

//     return ans;
// }