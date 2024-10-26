
import java.util.ArrayList;

public record SpiralMatrix() {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(printMatrix(matrix));
    }

    public static ArrayList<Integer> printMatrix(int [][]arr){
        ArrayList<Integer> list = new ArrayList<>();
        int topLeft = 0;
        int topRight = arr.length-1;
        int bottomLeft = 0;
        int bottomRight = arr.length-1;


        
        return list;
    }
}
