import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KaprekarsConstant {
    public static int KaprekarsConstant(int num) {

        String numToString = Integer.toString(num);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int ascending = 0;
        int descending = 0;
        int result = 0;
        int countRow = 0;
        String temp = "";

        // Do until result == 6174
        while (result != 6174) {
            System.out.println("\nRow :"+(countRow+1));
            // Separate int one by one
            for(int i = 0; i < numToString.length(); i++) {
                arr.add(Character.getNumericValue(numToString.charAt(i)));
            }

            // Set descending value
            temp = "";
            Collections.sort(arr, Collections.reverseOrder());
            for (Integer s : arr) {
                temp += s.toString();
            }
            descending = Integer.parseInt(temp);
            if (descending<1000) {
                descending = descending*10;
            }
            System.out.println("Max :"+descending);

            // Set ascending value
            temp = "";
            Collections.sort(arr);
            for (Integer s : arr) {
                temp += s.toString();
            }
            ascending = Integer.parseInt(temp);
            System.out.println("Min :"+ascending);

            System.out.println("Result :"+(descending-ascending));
            result = descending-ascending;

            numToString = Integer.toString(result);
            arr.clear();
            countRow++;
        }
        return num = countRow;
    }

    public static void main (String[] args) {
        System.out.print("Input: ");
        Scanner s = new Scanner(System.in);
        System.out.print("Output: "+KaprekarsConstant(Integer.parseInt(s.nextLine())));
    }
}
