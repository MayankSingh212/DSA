

public class MajorityElement {
    public static void main(String[] args) {
    int [] arr = {2,2,1,1,1,2,2};
    System.out.println(findElement(arr));
    }

    public static int findElement(int [] arr){
        int majElement = arr[0];
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==majElement){
                count ++;
            }
            else{
                count --;
                if(count == 0){
                    majElement = arr[i];
                    count = 1;
                }
            }
        }
        return majElement;
    }
}


//js brute force code
// const findElement = (arr)=>{
//     const majElement = arr.length/2;
//     const map = new Map();
//     for(let i=0;i<arr.length;i++){
//         map.set(arr[i],(map.get(arr[i]) || 0)+1);
//     }

// for(const [key, value] of map){
//     if(value>majElement){
//         return key;
//     }
// }
// return -1;
// }