// Digital root of a non-negative integer is the single-digit value obtained by an iterative process of summing digits,
// on each iteration using the result from the previous iteration to compute the digit sum.
// The process continues until a single-digit number is reached.
//
// Example:
//   Input : 12345
//   Output : 6 (Because 1 + 2 + 3 + 4 + 5 equals 15 and then 1 + 5 equals 6)

import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitalRoot {
    public static void DigitalRoot(long num) {

        if (num<=0) {
            throw new InputMismatchException();
        }
        String line = String.valueOf(num);
        while (line.length()!=1) {
            long currentValue = 0;
            for (int i=0;i<line.length();i++) {
                if(Character.isDigit(line.charAt(i))) {
                    currentValue += Character.getNumericValue(line.charAt(i));
                }
            }
            line = String.valueOf(currentValue);
        }

        System.out.println("Output : "+Long.parseLong(line));
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input : ");
        long num = s.nextLong();
        DigitalRoot(num);
    }
}
