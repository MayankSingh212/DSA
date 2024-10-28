
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr = {100,4,200,1,3,2};
        System.out.println(sequence(arr));
    }

    //brute force
    // public static int sequence(int [] arr){
    //     Arrays.sort(arr);
    //     int longest = 1;
    //     int count = 1;
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i-1] == arr[i]){
    //             continue;
    //         }
    //         else if(arr[i-1]+1==arr[i]){
    //             count ++;
    //             longest = Math.max(count, longest);
    //         }
    //         else{
    //             count = 1;
    //         }
    //     }
    //     return longest;
    // }

    public static int sequence(int [] arr){
        if(arr.length==0){
            return 0;
        }
        int longest =1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        for(int item: set){
            if(!set.contains(item-1)){
                int count = 1;
                int x = item;
                while(set.contains(x+1)){
                    count++;
                    x = x+1;
                }
                longest = Math.max(count,longest);
            }
        }
        return longest;
    }
}


//js code 
// const sequence = (arr)=>{
//     const set = new Set();
//     for(let i=0;i<arr.length;i++){
//         set.add(arr[i]);
//     }

//     let longest = 1;
//     set.forEach((item)=>{
//         if(!set.has(item-1)){
//             let count = 1;
//             let x = item;
//             while(set.has(x+1)){
//                 x++;
//                 count++;
//             }
//             longest = Math.max(longest,count);
//         }
//     })
//     return longest;
// }