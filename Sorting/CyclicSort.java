
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int [] arr){
        int  i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }

    public static void swap(int [] arr, int x, int y){
        int temp  = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
