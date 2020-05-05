// Pascal Triangle
// Given numRows, generate the first numRows of Pascal’s triangle.
// Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
//
// Example
// Given numRows = 5,
//
// {
//      [1],
//      [1,1],
//      [1,2,1],
//      [1,3,3,1],
//      [1,4,6,4,1]
// }

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {

    public static void PascalTriangle(int nRow) {
        int row = 0;
        ArrayList<ArrayList> pascal = new ArrayList<>();

        do {
            if(row < 1) {
                ArrayList<Integer> newRow = new ArrayList<>();
                newRow.add(1);
                pascal.add(newRow);
            } else {
                ArrayList<Integer> newRow = new ArrayList<>();
                ArrayList<Integer> previousRow = pascal.get(pascal.size()-1);
                for (int i=0;i<=previousRow.size();i++) {
                    if(i-1<0) {
                        int num = previousRow.get(i) + 0;
                        newRow.add(num);
                    } else if (i==previousRow.size()) {
                        int num = 0 + previousRow.get(i-1);
                        newRow.add(num);
                    } else {
                        int num = previousRow.get(i) + previousRow.get(i-1);
                        newRow.add(num);
                    }
                }
                pascal.add(newRow);
            }
            row++;
        } while(row!=nRow);

//        System.out.println(pascal);
        for (ArrayList a :pascal) {
            System.out.println(a);
        }
    }

    public static void main(String args[]) {
        System.out.print("Given numRows = ");
        Scanner scanner = new Scanner(System.in);
        PascalTriangle(Integer.parseInt(scanner.nextLine()));
    }
}
