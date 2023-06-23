import java.util.*;
public class diagonal_sum {
    public static int printdiagonalsum(int matrix[][]) {  // O(n2) not a very optimized code 
        int sum = 0;
        //for(int i = 0; i<matrix.length ; i++) {
        //    for( int j = 0; j<matrix[0].length ; j++) {
        //        if(i==j) {
        //            sum += matrix[i][j];
        //        }
        //        else if(i+j == matrix.length-1) {
        //            sum += matrix[i][j];
        //        }
        //    }
        //}

        //code in linear time complexity
        for(int i = 0; i<matrix.length ; i++) {
            //primary 
            sum += matrix[i][i];
            //secondary
            if(i != matrix.length-1-i) { //kyuki odd order me beech vala cell do baar count ho rha tha to usse hata diye 
            sum += matrix[i][matrix.length-1-i]; //as n-1=i+j
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        
        int answer = printdiagonalsum(matrix);
        System.out.println(answer);
    }
}