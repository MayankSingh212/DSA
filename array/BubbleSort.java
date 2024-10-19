
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {5, 3, 8, 4, 2, 7, 1, 6};
        System.out.println(Arrays.toString(arr));
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int []arr){
        for(int i=0;i<arr.length;i++){
            boolean isSorted = true;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
}
