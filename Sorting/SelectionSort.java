import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int [] arr = {34, 7, 23, 32, 5, 62, 12, 45, 87};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int [] arr){
        for(int i=0;i<arr.length;i++){
            int minimum = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minimum]){
                    minimum = j;
                }
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
    }
}
