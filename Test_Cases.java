import  java.util.List;
import  java.util.ArrayList;
import java.util.Scanner;

public class Test_Cases {
    public static void main (String[] args) {

        //TEST CASES FOR PASCAL'S TRIANGLE

        Pascal_Triangle triangle_4 = new Pascal_Triangle(4);
        Pascal_Triangle triangle_3 = new Pascal_Triangle(3);

        System.out.println("Sample Test for 3 rows expected return: \n" +
                "    [1]\n" +
                "   [1, 1]\n" +
                " [1, 2, 1]\n");
        System.out.println("Return for 3 rows: ");
        triangle_3.printTriangle();


        System.out.println("\nSample Test for 4 rows expected return: \n" +
                "    [1]\n" +
                "   [1, 1]\n" +
                " [1, 2, 1]\n" +
                "[1, 3, 3, 1]\n");
        System.out.println("Return for 4 rows: ");
        triangle_4.printTriangle();
        System.out.println();

        System.out.println("Expected Output of a triangle with Negative Rows: Number of rows must be greater than 0.");
        Pascal_Triangle triangle_Zero = new Pascal_Triangle(0);
        

        //TEST CASES FOR SPIRAL MATRIX 
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][] matrix3 = {
            {1, 2},
            {3, 4}
        };

        int[][] matrix4 = {
            {1}
        };

        int[][] matrix5 = {};
        
        System.out.println("\nAll Matrix are made with ascending order from left to right then top to bottom");
        System.out.println("\nExpected output of a 3x3 is: [1, 2, 3, 6, 9, 8, 7, 4, 5]");
        Spiral_Matrix.testSpiral(matrix1);
        System.out.println("\nExpected output of a 4x4 is: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]");
        Spiral_Matrix.testSpiral(matrix2);
        System.out.println("\nExpected output of a 2x2 is: [1, 2, 4, 3]");
        Spiral_Matrix.testSpiral(matrix3);
        System.out.println("\nExpected output of a 1x1 is: [1]");
        Spiral_Matrix.testSpiral(matrix4);
        System.out.println("\nExpected output of an empty matrix is: []");
        Spiral_Matrix.testSpiral(matrix5);
        

    }
}
