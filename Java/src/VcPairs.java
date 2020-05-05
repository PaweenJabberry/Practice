/*
* VC Pairs
* Max has a string S with length N.
* He needs to find the number of indices i (1≤i≤N−11≤i≤N−1) such that the i-th character of this string is a consonant and the i+1th character is a vowel.
* However,she is busy, so she asks for your help.
*
* Note: The letters 'a', 'e', 'i', 'o', 'u' are vowels; all other lowercase English letters are consonants.
*
* Input
*   - The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
*   - The first line of each test case contains a single integer N.
*   - The second line contains a single string S with length N.
*
* Output
*   - For each test case, print a single line containing one integer ― the number of occurrences of a vowel immediately after a consonant
*
* Constraints
*   - 1≤T≤1001≤T≤100
*   - 1≤N≤1001≤N≤100
*   - SS contains only lowercase English letters
*
* SAMPLE INPUT              SAMPLE OUTPUT
* 3                         3
* 6                         1
* bazeci                    0
* 3
* abu
* 1
* o
*
* */

import java.util.ArrayList;
import java.util.Scanner;

public class VcPairs {

    public static void VcPairs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rounds ? ");
        int round = scanner.nextInt();
        int length = 0;
        int count = 0;
        String text = "";
        ArrayList<Character>  vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0;i<round;i++) {
            count = 0;
            int position = 0;
            System.out.print("Length of String : ");
            length = scanner.nextInt();
            System.out.print("Your String : ");
            text = scanner.next().toLowerCase();
            while(position<length-1) {
                if (!vowels.contains(text.charAt(position)))
                    if (vowels.contains(text.charAt(position+1))) {
                        count++;
                        position++;
                    }
                position++;
            }
            System.out.println("Count : "+count);
        }
    }

    public static void main(String args[]) {
        VcPairs();
    }
}
