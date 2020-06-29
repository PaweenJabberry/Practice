import java.util.ArrayList;
import java.util.Scanner;

public class VowelRecognition {
    public static void VowelRecognition() {

        Scanner s = new Scanner(System.in);
        int totalVowel = 0;
        ArrayList<Integer> positionOfVowel = new ArrayList<>();

        String text = s.nextLine();

        for (int i = 0; i<text.length(); i++) {
            if (text.toLowerCase().charAt(i) == 'a' || text.toLowerCase().charAt(i) == 'e' || text.toLowerCase().charAt(i) == 'i' || text.toLowerCase().charAt(i) == 'o' || text.toLowerCase().charAt(i) == 'u') {
                totalVowel++;
                positionOfVowel.add(i);
            }
        }

        System.out.println("Total of Vowel from Text(1) : "+totalVowel);

        System.out.println("Position of All Vowel from Text");
        for (int a : positionOfVowel)
            System.out.println(a);

        totalVowel += positionOfVowel.get(0) + (positionOfVowel.get(1) - positionOfVowel.get(0));


//        OK
//        Hint sum = sum + ((long)(len - i) * (i + 1));
//        Scanner s = new Scanner(System.in);
//        int totalVowel = 0;
//        String text = "";
//        ArrayList<String> pList = new ArrayList<>();
//
//        text = s.nextLine();
//
//        String currentText = "";
//        for (int currentPosition = 0; currentPosition<text.length(); currentPosition++) {
//            currentText += text.charAt(currentPosition);
//            pList.add(currentText);
//            for (int nextChar = currentPosition+1; nextChar<text.length(); nextChar++) {
//                currentText += text.charAt(nextChar);
//                pList.add(currentText);
//            }
//            currentText = "";
//        }
//
//        System.out.println("All Possibility "+pList.size()+" : ");
//        for (String w : pList) {
////            System.out.println(w);
//            for (int i = 0; i<w.length(); i++) {
//                if (w.toLowerCase().charAt(i) == 'a' || w.toLowerCase().charAt(i) == 'e' || w.toLowerCase().charAt(i) == 'i' || w.toLowerCase().charAt(i) == 'o' || w.toLowerCase().charAt(i) == 'u')
//                    totalVowel++;
//            }
//        }
//
//        System.out.println("Total Vowel : "+totalVowel);

    }
    public static void main(String args[]) {
        VowelRecognition();
    }
}
