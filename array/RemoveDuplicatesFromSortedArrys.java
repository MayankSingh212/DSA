
public class RemoveDuplicatesFromSortedArrys{
    public static void main(String[] args){
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove(arr));
    }

    public static int remove(int []arr){
        int j = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[j] !=arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }

        return j+1;
    }
}


//js code
// const fn = (arr)=>{
//     let j = 0;
//     for(let i=1;i<arr.length;i++){
//         if(arr[j]!==arr[i]){
//             j++;
//             arr[j] = arr[i];
//         }
//     }

//     return j+1;
// }