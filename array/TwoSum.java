
import java.util.Arrays;
import java.util.HashMap;

public interface TwoSum {
    public static void main(String[] args) {
      int [] arr ={2,7,11,15};
      int target = 9;
      System.out.println(Arrays.toString(sumIndecies(arr,target)));
    }

    public static int[] sumIndecies(int [] arr,int target){
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
         if(map.containsKey(target-arr[i])){
            return new int[] {map.get(target-arr[i]),i};
         }
         map.put(arr[i],i);
       }

        return new int[] {-1,-1};
    }

}


//js code 
// const sumIndecies = (arr,target)=>{
//     const map = new Map();
//     for(let i=0;i<arr.length;i++){
//         if(map.has(target-arr[i])){
//             return [map.get(target-arr[i]),i];
//         }
//         map.set(arr[i],i);
//     }

//     return [-1,-1];
// }



