
import java.util.ArrayList;

public record SpiralMatrix() {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(printMatrix(matrix));
    }

    public static ArrayList<Integer> printMatrix(int [][]arr){
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        int right = arr[0].length-1;
        int left = 0;
        int bottom = arr.length-1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;

            if(top<=bottom){
            for(int i=right;i>=left;i--){
                list.add(arr[bottom][i]);
            }
        
            bottom--;
        }

            if(left<=right){
            for(int i=bottom;i>=top;i--){
                list.add(arr[i][left]);
            }
        
            left++;
        }
        }
        return list;
    }
}

//js code
// const spriral = (arr)=>{
//     let left = 0;
//     let right = arr[0].length-1;
//     let top = 0;
//     let bottom = arr.length-1;
//     const ans = [];

//     while(top<=bottom && left<=right){
//         for(let i =left;i<=right;i++){
//             ans.push(arr[top][i]);
//         }
//         top++;

//         for(let i=top;i<=bottom;i++){
//             ans.push(arr[i][right]);
//         }
//         right--;

//         if(top<=bottom){
//             for(let i =right;i>=left;i--){
//                 ans.push(arr[bottom][i]);
//             }
//             bottom--;
//         }

//         if(left<=right){
//             for(let i =bottom;i>=top;i--){
//                 ans.push(arr[i][left]);
//             }
//             left++;
//         }
//     }
//     return ans;
// }
