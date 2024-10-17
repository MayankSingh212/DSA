public class SingleNumber {
    public static void main(String[] args) {
        int [] arr = {4,1,2,1,2};
        int ans = single(arr);
        System.out.println(ans);
    }

    public static int single(int [] arr){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans ^= arr[i];
        }
        return ans;
    }
}


//js code 
// const single = (arr)=>{
//     let ans = 0;
//     for(let i =0;i<arr.length;i++){
//         ans ^= arr[i];
//     }
//     return ans;
// }


//js burte force 
// const single = (arr)=>{
//     let map = new Map();
//     for(let i=0;i<arr.length;i++){
//         map.set(arr[i], (map.get(arr[i]) || 0)+1);
//     }

//    for(let [key,value] of map){
//    if(value === 1){
// return key;
// }
//}
//     return null;
// }