/*
 * Friend's Relationship
 * Jack is your friend and Sophia is his girlfriend. But due to some unknown reason ( unknown for us, they know it) Sophia started hating to
 * Jack. Now, Jack is in big trouble but he has a solution, He knows that if he will gift T patterns of a particular type ( For pattern observation
 * see the sample test cases) then Sophia will start loving again to Jack. But Jack is depressed now and need your help to gift her that type
 * patterns of '*' and '#' of N lines. So, it's your responsibility to save your friend's relationship.
 *
 * Constraints :
 * 1 ≤  T ≤ 100
 * 1 ≤  N ≤ 30
 *
 * Input :
 * First Line contains T i.e. number of test case.
 * Each of the next T lines contain an integer N.
 *
 * Output:
 * For each test case print the pattern of N lines then after a blank line.
 *
 * SAMPLE INPUT                 SAMPLE OUTPUT
 * 3                            *################*
 * 9                            **##############**
 * 2                            ***############***
 * 5                            ****##########****
 *                              *****########*****
 *                              ******######******
 *                              *******####*******
 *                              ********##********
 *                              ******************
 *
 *                              *##*
 *                              ****
 *
 *                              *########*
 *                              **######**
 *                              ***####***
 *                              ****##****
 *                              **********
 *
 * */

import java.util.Scanner;

public class FriendRelationship {

    public static void FriendRelationship() {
        String pattern1 = "";
        String pattern2 = "";
        String linePattern = "";
        int i = 0;
        Scanner s = new Scanner(System.in);
        int round = s.nextInt();
        do {
            int line = s.nextInt();

            for (i = 0; i<(line*2)-2; i++) {
                pattern2 += "#";
            }

            for (i = 1; i<=line; i++) {
                pattern1 += "*";
                linePattern = pattern1 + pattern2 + pattern1;
                System.out.println(linePattern);
                if (pattern2.length() == 0) {
                    break;
                }
                pattern2 = pattern2.substring(0, pattern2.length() - 2);
            }
            round--;
            pattern1 = "";
            pattern2 = "";
        } while (round!=0);
    }

    public static void main(String args[]) {
        FriendRelationship();
    }
}
