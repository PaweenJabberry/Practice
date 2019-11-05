// First Factorial
// Have the function FirstFactorial(num) take the num parameter being
// passed and return the factorial of it. For example: if num = 4, then your
// program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be
// between 1 and 18 and the input will always be an integer.
//
// Examples
// Input: 4
// Output: 24
//
import java.util.*;

public class FirstFactorial {
    public static int FirstFactorial(int num) {

        int i = 0;
        int newNum = 1;

        for(i=1;i<=num;i++) {
            newNum *= i;
        }

        return newNum;
    }

    public static void main (String[] args) {
        System.out.print("Input: ");
        Scanner s = new Scanner(System.in);
        System.out.print("Output: "+FirstFactorial(Integer.parseInt(s.nextLine())));
    }

}
