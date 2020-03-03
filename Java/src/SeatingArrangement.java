// SeatingArrangement
// Akash and Vishal are quite fond of travelling. They mostly travel by railways.
// They were travelling in a train one day and they got interested in the seating arrangement of their compartment.
// The compartment looked something like https://he-s3.s3.amazonaws.com/media/uploads/a2e0794.jpg
//
// So they got interested to know the seat number facing them and the seat type facing them.
// The seats are denoted as follows :
//  - Window Seat : WS
//  - Middle Seat : MS
//  - Aisle Seat : AS
//
// You will be given a seat number, find out the seat number facing you and the seat type, i.e. WS, MS or AS.
// INPUT
//      First line of input will consist of a single integer T denoting number of test-cases.
// Each test-case consists of a single integer N denoting the seat-number.
// OUTPUT
//      For each test case, print the facing seat-number and the seat-type, separated by a single space in a new line.
// CONSTRAINTS
//   1<=T<=105
//   1<=N<=108
//
// Examples
// Input:           Output:
//   2
//   18                 19 WS
//   40                 45 AS
//

import java.util.Scanner;

public class SeatingArrangement {
    public static void SeatingArrangement(int[] seats) {

        String[] seatsType = {"WS", "MS", "AS", "AS", "MS", "WS"};

        System.out.println("Output: ");
        for(int currentNumber:seats) {
            int mod = currentNumber%12;
            if (mod>0 && mod<12) {
                System.out.print((currentNumber+((12-mod)-(mod-1))));
                if (mod%6 == 0) {
                    System.out.println(" "+seatsType[5]);
                } else {
                    System.out.println(" "+seatsType[mod%6-1]);
                }
            } else {
                System.out.println((currentNumber-11)+" WS");
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Input: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] seats = new int[n];
        for(int i=0; i<n; i++) {
            seats[i] = scanner.nextInt();
        }
        SeatingArrangement(seats);
    }
}
