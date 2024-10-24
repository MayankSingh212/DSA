
import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr = {100,4,200,1,3,2};
        System.out.println(sequence(arr));
    }

    public static int sequence(int [] arr){
        Arrays.sort(arr);
        int longest = 1;
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] == arr[i]){
                continue;
            }
            else if(arr[i-1]+1==arr[i]){
                count ++;
                longest = Math.max(count, longest);
            }
            else{
                count = 1;
            }
        }
        return longest;
    }
}
