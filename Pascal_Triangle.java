import java.util.List;
import java.util.  ArrayList;

public class Pascal_Triangle {

    private int rows;

    public Pascal_Triangle(int rows) {
        if(rows <= 0) {
            throw new IllegalArgumentException("Number of rows must be greater than 0.");
        }
        this.rows = rows;
    }

    public List<List<Integer>> generate() {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < rows; i++) {                        //iterates through number of rows
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++) {                       //inner loop that adds the adjacent values from previous rows

                if(j == 0 || j == i) {                          //always true because every row starts with 1 and will eventually
                    row.add(1);                                 //be true for the end of each row being a 1
                }else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));   //dual element grab that adds adjacent values
                }
            }

            triangle.add(row);                           //adds the newly finished row
        }


        return triangle;
    }

    public void printTriangle() {
        List<List<Integer>> triangle = generate();
        int maxWidth = triangle.get(triangle.size() - 1).toString().length(); //Calculate the width of the last row to align the triangle

        for(List<Integer> row : triangle){
            int alignSpaces = (maxWidth - row.toString().length()) / 2;   //calculates centering for number spaces
            System.out.print(" ".repeat(alignSpaces));                    //Prints leading spaces for centering
            System.out.println(row);                                       //Prints the current row
        }
    }

}
