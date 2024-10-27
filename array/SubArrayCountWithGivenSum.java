
import java.util.HashMap;

public class SubArrayCountWithGivenSum {
    public static void main(String[] args) {
        int [] arr = {1,1,1};
        int k = 2;
        System.out.println(count(arr, k));
    }

    public static int count(int [] arr,int k){
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum == k){
                count ++;
            }

            if(map.containsKey(sum-k)){
                count = count + map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum-k,0)+1);
            
        }
        return count;
    }
}
