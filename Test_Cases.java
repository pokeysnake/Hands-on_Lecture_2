import  java.util.List;
import  java.util.ArrayList;
import java.util.Scanner;

public class Test_Cases {
    public static void main (String[] args) {

        Pascal_Triangle triangle_4 = new Pascal_Triangle(4);
        Pascal_Triangle triangle_3 = new Pascal_Triangle(3);

        System.out.println("Sample Test for 3 rows expected return: \n" +
                "    [1]\n" +
                "   [1, 1]\n" +
                " [1, 2, 1]\n");
        System.out.println("Return for 3 rows: ");
        triangle_3.printTriangle();


        System.out.println("Sample Test for 4 rows expected return: \n" +
                "    [1]\n" +
                "   [1, 1]\n" +
                " [1, 2, 1]\n" +
                "[1, 3, 3, 1]\n");
        System.out.println("Return for 4 rows: ");
        triangle_4.printTriangle();
    }
}
