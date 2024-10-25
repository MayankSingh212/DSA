

public class RotateMatrix {
    public static void main(String[] args) {
        int [][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7}, {15,14,12,16}};
        rotate(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int [][]arr){

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