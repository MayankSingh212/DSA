public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int [] arr = {3,0,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    public static int missingNumber(int []arr){
        int expectedSum = arr.length * (arr.length + 1)/2;
        for(int i=0;i<arr.length;i++){
            expectedSum -= arr[i];
        }
        return expectedSum;
    }
}


//js code
// const missingNumber = (arr)=>{
//     let expectedSum = arr.length * (arr.length +1)/2;
//     for(let i=0;i<arr.length;i++){
//         expectedSum -= arr[i];
//     }
//     return expectedSum;
// }