
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {    
        int [] arr = {34, 7, 23, 32, 5, 62, 12, 45, 87};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int [] arr){
        for(int i=1;i<arr.length;i++){
           int j= i-1;
           while(j>=0 && arr[j+1]<arr[j]){
            swap(arr,j,j+1);
            j--;
           }
        }
    }

    public static void swap(int [] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}




