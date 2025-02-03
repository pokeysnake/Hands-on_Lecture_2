import java.util.ArrayList;
import java.util.List;


public class Spiral_Matrix {
    public static List<Integer> spiral (int[][] matrix){

        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;


        //starting values of the position holders that we will adjust according to our traversal
        int rowBegin =0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        //iterative loop that initially traverses the top columns (values from left to right) then subsequent rows (values from top to bottom) with the bounds adjusted similar to the matrix "shrinking"
        
        //Steps would be traverse the columns --> traverse vertically through the rows --> backward traversal of columns --> upward traversal of rows
        
        while(rowBegin <= rowEnd && colBegin <= colEnd) {

            for (int i = colBegin; i <= colEnd; i++) {      //traverses the entire first row (accesses column index)
                res.add(matrix[rowBegin][i]);
            }
            
            rowBegin++;                                     //goes to the next row

            for (int i = rowBegin; i <= rowEnd; i++) {      //goes vertically through the column (accesses row index)
                res.add(matrix[i][colEnd]);
            }

            colEnd--;                                       //went through entire last row --> decriment

            //Since traversing values have been edited --> check to make sure no OutofBounds Errors occur
            if(rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {  //traversing backwards through the bottom row (accesses columns)
                    res.add(matrix[rowEnd][i]);
                }
            }

            rowEnd--;                                       //went through entire bottom row --> decriment 

            //Since traversing values have been edited --> check to make sure no OutofBounds Errors occur
            if(colBegin <= colEnd) {
                for(int i = rowEnd; i >= rowBegin; i--) {   //Currently at last row --> need to go back up vertically through the first column and the last row 
                    res.add(matrix[i][colBegin]);
                }
            }

            colBegin++;                                     //on a 3x3 matrix it would simply be the middle value however on a 4x4 we would "shrink" the bounds of traversal to be able to spirally add the middle values
        }

        return res;                                         //return :)

    }

    //Void Method so that I can call it to test spiral in Test_Cases
    public static void testSpiral(int[][] matrix){
        List<Integer> result = spiral(matrix);
        System.out.println("Spiral Order is: " + result);
    }
}
