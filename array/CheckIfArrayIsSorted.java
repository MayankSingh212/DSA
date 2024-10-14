
public interface CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2};
        checkIfSorted(arr);
    }

    public static void checkIfSorted(int []arr){
        int numberOfTimerRotated = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                numberOfTimerRotated ++;
            }
            if(numberOfTimerRotated>1){
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("Sorted");
    }
}


//js code
// const checkIfSorted = (arr)=>{
//     let numberOfTimerRotated = 0;
//     for(let i=1;i<arr.length;i++){
//         if(arr[i]<arr[i-1]){
//             numberOfTimerRotated ++;
//         }
//     }
//     if(numberOfTimerRotated>1){
//         console.log("not sorted");
//     }
//     else{
//         console.log("sorted");
//     }
// }