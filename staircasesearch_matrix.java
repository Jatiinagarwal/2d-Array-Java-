import java.util.*;
public class staircasesearch_matrix {
    public static boolean staircasesearch(int matrix[][] , int key) { 
        int row = 0,col = matrix[0].length-1 ;

        while(row<matrix.length && col>0) {
            if(key==matrix[row][col]) {
                System.out.println("The key is found at cell"+"("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]) {
                col--; //i.e. moving left
            }
            else if(key>matrix[row][col]) {
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,31,48},
                          {32,33,39,50}};
        int key = 39;
        boolean answer = staircasesearch(matrix,key);
        System.out.println(answer);
    }
}