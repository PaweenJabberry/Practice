/*
* Lift queries
* There are 7 floors in BH3 and only 2 lifts. Initially Lift A is at the ground floor and Lift B at the top floor.
* Whenever someone calls the lift from N th floor, the lift closest to that floor comes to pick him up.
* If both the lifts are at equidistant from the N th floor, them the lift from the lower floor comes up.
*
* INPUT
* First line contains a integer T denoting the number of test cases.
* Next T lines contains a single integer N denoting the floor from which lift is called.
*
* OUTPUT
* Output T lines containing one character "A" if the first lift goes to N th floor or "B" for the second lift.
*
* CONTRAINTS
* 0 <= N <= 7
* 1 <= T <= 100000
*
* SAMPLE INPUT                  SAMPLE OUTPUT
* 2                             A
* 3                             A
* 5
*
* Explanation
* 3rd floor calls, Lift A(0) goes there.
* 5th  floor calls, Lift A(3) and Lift B(7) are equidistant from 5, so Lift from lowest floor goes there i.e. A.
*
* */

import java.util.Scanner;

public class LiftQueries {

    public static void LiftQueries() {
        Scanner s = new Scanner(System.in);
        int nTestCase = s.nextInt();
        int aLift = 0;
        int bLift = 7;

        for (int i = 0; i < nTestCase; i++) {
            int target = s.nextInt();
            int aDifferent = 0;
            int bDifferent = 0;
            if (aLift > target) {
                aDifferent = aLift - target;
            } else
                aDifferent = target - aLift;

            if (bLift > target) {
                bDifferent = bLift - target;
            } else
                bDifferent = target - bLift;

            if (aDifferent == bDifferent) {
                if (aLift <= bLift) {
                    aLift = target;
                    System.out.println("A");
                } else {
                    bLift = target;
                    System.out.println("B");
                }
            } else if (aDifferent < bDifferent) {
                aLift = target;
                System.out.println("A");
            } else {
                bLift = target;
                System.out.println("B");
            }
        }
    }

    public static void main(String args[]) {
        LiftQueries();
    }
}
