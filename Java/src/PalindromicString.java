/*
* Palindromic String
* You have been given a String S. You need to find and print whether this string is a palindrome or not.
* If yes, print "YES" (without quotes), else print "NO" (without quotes).
*
* Input Format
* The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.
*
* Output Format
* Print the required answer on a single line.
*
* Constraints
* 1<=S<=100
*
* Note
* String S consists of lowercase English Alphabets only.
*
* SAMPLE INPUT              SAMPLE OUTPUT
* aba                       YES
* aab                       NO
*
 * */

import java.util.Scanner;

public class PalindromicString {

    public static void PalindromicString() {
        Scanner s = new Scanner(System.in);

        String palindromic = s.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder(palindromic);
        sb = sb.reverse();

        if (palindromic.equals(sb.toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String args[]) {
        System.out.println("Hello");
        PalindromicString();
    }
}
