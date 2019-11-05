// Simple Adding
// Have the function SimpleAdding(num) add up all the numbers from 1 to
// num. For example: if the input is 4 then your program should return 10
// because 1 + 2 + 3 + 4 = 10. For the test cases, the parameter num will be any
// number from 1 to 1000.
//
// Examples
// Input: 12
// Output: 78
//
// Input: 140
// Output: 9870
import java.util.*;

public class SimpleAdding {

    public static int SimpleAdding(int num) {
        int newNum = 0;

        for(int i=1;i<=num;i++) {
            newNum += i;
        }

        return newNum;
    }

    public static void main (String[] args) {
        System.out.print("Input: ");
        Scanner s = new Scanner(System.in);
        System.out.print("Output: "+SimpleAdding(Integer.parseInt(s.nextLine())));
    }

}
