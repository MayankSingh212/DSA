public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1,0};
       int ans =  maxOnes(arr);
       System.out.println(ans);
    }

    public static int maxOnes(int [] arr){
        int count = 0;
        int maxOnesTillHere = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxOnesTillHere = Math.max(maxOnesTillHere,count);
            }
            else{
                count=0;       
            }
        }
        return maxOnesTillHere;
    }
}

