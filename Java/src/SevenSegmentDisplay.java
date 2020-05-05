import java.util.Scanner;

public class SevenSegmentDisplay {

    public static void SevenSegmentDisplay() {

        Scanner s = new Scanner(System.in);
        int number = 0;
        int lastDigit = 0;
        int result = 0;
        int round = s.nextInt();
        int[] segment = {6 ,2 ,5 ,5 ,4 ,5 ,6, 3, 7, 6};
        for (int i = 0; i<round; i++) {
            number = s.nextInt();
            System.out.println("Number%10 : "+number%10);
            while (number != -1) {
                lastDigit = number % 10;
                System.out.println("lastDigit : "+lastDigit);
                System.out.println("segment : "+segment[lastDigit]);
                result += segment[lastDigit];
                number = number/10;
                System.out.println("Number After Process : "+number);
                if (number == 0) {
                    number = -1;
                }
            }
            System.out.println("Match Sticks : "+result);
            result = 0;
        }

    }

    public static void main(String args[]) {
        System.out.println("Hello");
        SevenSegmentDisplay();
    }
}
