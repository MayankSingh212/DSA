public class MaxConsecutiveOnes {
    public static void main(String[] args){
        int [] arr = {1,1,0,1,1,1,0};
        System.out.println(maxOnes(arr));
    }

    public static int maxOnes(int[] arr){
        int count = 0;
        int maxTillHere = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                count++;
                maxTillHere = Math.max(maxTillHere,count);
            }
            else{
                count = 0;
            }
        }

        return maxTillHere;
    }
}
