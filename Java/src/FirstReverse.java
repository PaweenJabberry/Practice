// First Reverse
// Have the function FirstReverse(str) take the str parameter being
// passed and return the string in reversed order. For example: if the input string
// is "Hello World and Coders" then your program should return the string sredoC
// dna dlroW olleH.
//
// Examples
// Input: "coderbyte"
// Output: etybredoc
//

import java.util.Scanner;

public class FirstReverse {
    public static String FirstReverse(String str) {

        // For reverse string.
        String temp = "";
        for(int i = 0; i < str.length(); i++) {
            // Print char by index.
            // System.out.println(str.charAt(i));
            temp =  str.charAt(i) + temp;
        }
        // Check result.
        // System.out.println(temp);
        str = temp;
        return str;
    }

    public static void main (String[] args) {
        System.out.print("Input: ");
        Scanner s = new Scanner(System.in);
        System.out.print("Output: "+FirstReverse(s.nextLine()));
    }
}
