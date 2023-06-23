import java.util.*;

public class matrix_creation {
    public static boolean search(int matrix[][] , int key) {
        for(int i = 0; i<matrix.length ; i++) {
            for(int j = 0 ; j<matrix[0].length ; j++) { 
                if(matrix[i][j] == key) {
                    System.out.println("The key is found at cell:" + "("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int [3][3]; // this gives a 3X3 matrix 
        int n = matrix.length , m =matrix[0].length; // matrix.length = total no. of rows , matrix[0].length mtlb pehli row me ghuske uski length mtlb total no. opf coloumns
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n ; i++) {
            for(int j = 0 ; j<m ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i<n ; i++) {
            for(int j = 0 ; j<m ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        boolean answer = search(matrix,5);
        System.out.println(answer);
    }
}