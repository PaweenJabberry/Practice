/*
* IT’S MAGIC!
* Sussutu is a world-renowned magician. And recently, he was blessed with the power to remove EXACTLY ONE element from an array.
* Given, an array A (index starting from 0) with N elements. Now, Sussutu CAN remove only that element which makes the sum of ALL the
* remaining elements exactly divisible by 7.
*
* Throughout his life, Sussutu was so busy with magic that he could never get along with maths. Your task is to help Sussutu find the first
* array index of the smallest element he CAN remove.
*
* Input:
* The first line contains a single integer N.
* Next line contains N space separated integers Ak , 0 < k < N.
*
* Output:
* Print a single line containing one integer, the first array index of the smallest element he CAN remove, and -1 if there is no such element
* that he can remove!
*
* Constraints:
* 1 < N < 10^5
* 0 < Ak < 10^9
*
* SAMPLE INPUT                      SAMPLE OUTPUT
* 5                                 1
* 14 7 8 2 4
* */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ITSMagic {

    public static void ITSMagic() {
        Scanner s = new Scanner(System.in);
        int length = 0;
        int answer = -1;
        int min = 0;
        int currentValue = 0;
        Double sum = 0.0;
        ArrayList<Integer> numbers = new ArrayList();

        List<String> text = ReadFile();
        length = text.size();

        for (int i = 0; i<length; i++) {
            currentValue = Integer.parseInt(text.get(i));
            sum += currentValue;
            numbers.add(currentValue);
        }

//        System.out.println("Sum : "+sum);

        for (int i = 0; i<length; i++) {
            currentValue = numbers.get(i);
            if ((sum-currentValue)%7 == 0) {
                 if (answer == -1) {
                     min = currentValue;
                     answer = i;
                 } else if (currentValue < min) {
                     min = currentValue;
                     answer = i;
                 }
            }

//            if (i == 47399 || i == 8899) {
//                System.out.println("IndexOf : "+i);
//                System.out.println("CurrentValue : "+currentValue);
//                System.out.println("CurrentValueIn : "+numbers.get(i));
//                System.out.println("Sum : "+sum);
//                System.out.println("Sum-currentValue : "+(sum-currentValue));
//                System.out.println("(sum-currentValue)%7 : "+(sum-currentValue)%7+"\n");
//            }
        }

        System.out.println("Answer : "+answer);

    }

    public static List<String> ReadFile() {
        List<String> data = new ArrayList<>();
        try {
            File myObj = new File("data/testcase2.txt");
            Scanner myReader = new Scanner(myObj);
            String rawData = "";
            while (myReader.hasNextLine()) {
                rawData = myReader.nextLine();
//                System.out.println(rawData);
            }
            myReader.close();
            data = Arrays.asList(rawData.split(" "));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String args[]) {
        ITSMagic();
    }
}
