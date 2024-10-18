
import java.util.HashMap;

public class LogestSubArrayWithSumK {
    public static void main(String[] args) {
        int [] arr = {10, 5, 2, 7, 1, 9};
        int  k = 15;
        System.out.println(count(arr,k));
    }

    public static int count(int []arr,int k){
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        for(int i=0;i<arr.length;i++){
           sum+=arr[i];
        if(sum==k){
           count = Math.max(count, i+1);
           }
        if(map.containsKey(sum-k)){
          count = Math.max(count,i-map.get(sum-k));
           }

           //condition to take care if zero occurs
           if(!map.containsKey(sum)){
            map.put(sum,i);
           }
        
        }   
        return count;
    }
}


//js code:
// const findCount = (arr,k)=>{
//     const map = new Map();
//     let count = 0;
//     let sum = 0;
//     for(let i=0;i<arr.length;i++){
//         sum+=arr[i];
//         if(sum===k){
//             count = Math.max(count,i+1);
//         }
//         if(map.has(sum-k)){
//             count = Math.max(count,i-map.get(sum-k));
//         }

//         if(!map.has(sum)){
//             map.set(sum,i);
//         }
//     }
//     return count;
// }