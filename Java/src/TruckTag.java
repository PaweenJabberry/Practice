/*
* Ali and Helping innocent people
* Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians.
* Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege.
* He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel.
* Determine if the tag of the truck is valid or not.
*
* We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.
*
* Input Format
* The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.
*
* Output Format
* Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)
*
* SAMPLE INPUT                      SAMPLE OUTPUT
* 12X345-67                         invalid
*
* Explanation
* The tag is invalid because the sum of first and second digit of it is odd (also the sum of 4'th and 5'th, 5'th and 6'th and 8'th and 9'th are odd).
*
 *
* */
public class TruckTag {
    public static String TruckTag(String tag) {
        System.out.println("Tag : "+tag);

        if(tag.toUpperCase().charAt(2) == 'A' || tag.toUpperCase().charAt(2) == 'E' || tag.toUpperCase().charAt(2) == 'I' || tag.toUpperCase().charAt(2) == 'O' || tag.toUpperCase().charAt(2) == 'U' || tag.toUpperCase().charAt(2) == 'Y') {
            return "invalid";
        } else {
            for (int i = 0; i < 8; i++) {
                if (Character.isDigit(tag.charAt(i)) && Character.isDigit(tag.charAt(i+1))) {
                    int current = tag.charAt(i) + tag.charAt(i + 1);
                    if (current%2 != 0) {
                        return "invalid";
                    }
                }
            }
        }

        return "valid";
    }

    public static void main(String args[]) {
        String tag[] = {"11B242-73", "13Y357-22", "12X345-67"};
        for (String s : tag) {
            System.out.println(TruckTag(s));
        }
    }
}
