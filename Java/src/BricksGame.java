/*
* Bricks Game
* Patlu and Motu works in a building construction, they have to put some number of bricks N from one place to another, and started doing
* their work. They decided , they end up with a fun challenge who will put the last brick.
* They to follow a simple rule, In the i'th round, Patlu puts i bricks whereas Motu puts ix2 bricks.
* There are only N bricks, you need to help find the challenge result to find who put the last brick.
*
* Input:
* First line contains an integer N.
* Output:
* Output "Patlu" (without the quotes) if Patlu puts the last bricks ,"Motu"(without the quotes) otherwise.
*
* Constraints:
* 1 ≤ N ≤ 10000
*
* SAMPLE INPUT                      SAMPLE OUTPUT
* 13                                Motu
*
* Sample Explanation:
* 13 bricks are there :
* Patlu Motu
* 1 2
* 2 4
* 3 1 ( Only 1 remains)
* Hence, Motu puts the last one.
*
* */

import java.util.Scanner;

public class BricksGame {

    public static String BricksGame() {
        String answer = "Patlu";
        int round = 1;

        Scanner s = new Scanner(System.in);

        int bricks = s.nextInt();

        while (bricks > 0) {
            if (bricks > 0) {
                bricks = bricks - round;
                answer = "Patlu";
                if (bricks > 0) {
                    bricks = bricks - (round*2);
                    answer = "Motu";
                }
            }
            round++;
        }

        return answer;
    }

    public static void main(String args[]) {
        System.out.println(BricksGame());
    }
}
