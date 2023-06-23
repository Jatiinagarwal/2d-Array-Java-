import java.util.*;
public class spiral_matrix {
    public static void printspiral(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        
        while(startrow<=endrow && startcol<=endcol) {
            // top i.e. making the coloumn variable 
            for(int j = startcol ; j<=endcol ; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }

            //right i.e. making the row variable 
            for(int i = startrow+1 ; i<=endrow ; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }

            //bottom i.e. making the col variable 
            for(int j = endcol-1 ; j>=startcol ; j--) {
                if(startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            //left i.e. making the row variable 
            for(int i = endrow-1 ; i>=startrow+1 ; i--) {
                if(startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        
        printspiral(matrix);
    }
}