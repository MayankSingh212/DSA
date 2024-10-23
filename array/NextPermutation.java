import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args){
        int [] arr = {1,1,5};
        next(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void next(int [] arr){
        int i = -1;
        for(int j = arr.length-2;j>=0;j--){
            if(arr[j]<arr[j+1]){
                i = j;
                break;
            }
        }

        if(i==-1){
            rev(arr,0,arr.length-1);
            return;
        }

        for(int j = arr.length-1;j>i;j--){
            if(arr[j]>arr[i]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                break;
            }
        }

        rev(arr,i+1,arr.length-1);
    }

    public static void rev(int [] arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


//write js brute force code using recursion