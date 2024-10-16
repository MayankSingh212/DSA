
import java.util.*;



public class FindTheUnion {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = {1, 2, 3, 6, 7};
        System.out.println(union(arr1, arr2));
    }

    public static ArrayList<Integer> union(int [] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();

        int i=0;
        int j=0;
        int lastEnteredInteger = Integer.MIN_VALUE;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(lastEnteredInteger != arr1[i]){
                    list.add(arr1[i]);
                    lastEnteredInteger = arr1[i];
                }
                i++;
            }
            else if(arr2[j]<arr1[i]){
                if(lastEnteredInteger != arr2[j]){
                    list.add(arr2[j]);
                    lastEnteredInteger = arr2[j];
                }
                j++;
            }
            else{
                if(lastEnteredInteger!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while(i<arr1.length){
            if(lastEnteredInteger != arr1[i]){
                list.add(arr1[i]);
                lastEnteredInteger = arr1[i];
            }
            i++;
        }
        while(j<arr2.length){
            if(lastEnteredInteger != arr2[j]){
                list.add(arr2[j]);
                lastEnteredInteger = arr2[j];
            }
            j++;
        }

        return list;
    }
}
