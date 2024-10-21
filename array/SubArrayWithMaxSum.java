public class SubArrayWithMaxSum {
    public static void main(String[] args) {
        int [] arr = {4, 3, 1, 5, 6};
        // [5,6 will be the answer] => 11 as only have to take subarrays smallest and second smallest number
        System.out.println(sum(arr));
    }   

    // this is brute 
    public static int sum(int [] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int smallest = arr[i];
            int secondSmallest = Integer.MAX_VALUE;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<smallest){
                    secondSmallest = smallest;
                    smallest = arr[j];
                }
                else if(arr[j]<secondSmallest && arr[j]!=smallest){
                    secondSmallest = arr[j];
                }
                maxSum = Math.max(maxSum, smallest+secondSmallest);
            }
            
        }  
        return maxSum; 
    }
}
