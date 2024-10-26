

public class RotateMatrix {
    public static void main(String[] args) {
        int [][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7}, {15,14,12,16}};
        rotate(arr);
        rev(arr);
        for (int[] arr1 : arr) {
            for (int j = 0; j<arr.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void rev(int [][] arr){
        for (int[] arr1 : arr) {
            int start =0;
            int end = arr.length-1;
            while (start<=end) {
                int temp = arr1[start];
                arr1[start] = arr1[end];
                arr1[end] = temp;
                start++;
                end--;
            }
        }
    }

}


//js bruteforce approach 
// const rotate = (arr)=>{
//     const ans = [];
//     for(let i=0;i<arr.length;i++){
//         const innerArr = [];
//         for(let j=0;j<arr.length;j++){
//             innerArr.push(arr[arr.length-1-j][i]);
//         }
//         ans.push(innerArr);
//     }

//     return ans;
// }



//js optimize code
// const rotate = (arr)=>{
//     for(let i=0;i<arr.length;i++){
//         for(let j=i+1;j<arr.length;j++){
//             const temp = arr[i][j];
//             arr[i][j] = arr[j][i];
//             arr[j][i] = temp;
//         }
//     }

//     rev(arr);
// }

// const rev = (arr)=>{
//     for(let i=0;i<arr.length;i++){
//         let start = 0;
//         let end = arr.length-1;
//         while(start<=end){
//             const temp = arr[i][start];
//             arr[i][start]= arr[i][end];
//             arr[i][end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

