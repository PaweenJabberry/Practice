// Prime Number
// You are given an integer N. You need to print the series of all prime numbers till N.
//
// Input Format
// The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.
// Output Format
// Print the desired output in single line separated by spaces.
// Constraints
// 1<=N<=1000
//
// Examples
// Input: 9
// Output: 2 3 5 7
//

import java.util.Scanner;

public class PrimeNumber {

    public static void PrimeNumber(int number) {

        for(int currentNum=2;currentNum<=number;currentNum++){
            int count=0;
            for(int i=currentNum;i>=1;i--){
                if(currentNum%i == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(currentNum+" ");
            }
        }
    }

    public static void main(String args[]) {
        System.out.print("Enter Number: ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        PrimeNumber(number);
    }
}
