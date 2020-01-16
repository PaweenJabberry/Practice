import java.util.Scanner;

public class NodeTree {
    public static void main (String[] args) {

        int cityCount = 0;
        int[][] multi = new int[][]{
                {2,9}, //0
                {999}, //1
                {3},  //2
                {8}, // 3
                {999}, // 4
                {999}, // 5
                {4}, // 6
                {}, // 7
                {5,7}, // 8
                {1}, //9
        };

        int[] t = new int[]{0,9,0,2,6,8,0,8,3,0};

        for (Integer s : t) {
            if (s==9) {
                if (cityCount < 3) {
                    cityCount = 3;
                }
            }
            if (s==6) {
                if (cityCount < 3) {
                    cityCount = 3;
                }
            }
            if (s==2) {
                if (cityCount < 4) {
                    cityCount = 4;
                }
            }
        }
    }
}


