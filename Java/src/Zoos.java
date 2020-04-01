/*
* You are required to enter a word that consists of x and y
* that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if X*2 = y
* Determine if the entered word is similar to word zoo.
* For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.
* Input format
*   - First line: A word that starts with several Zs and continues by several Os.
*   Note: The maximum length of this word must be 20
* Output format
* Print Yes if the input word can be considered as the string zoo otherwise, print No.
* Sample Input                  Sample Output
* zzoooo                            Yes
 * */

public class Zoos {

    public static String Zoos(String word) {

        if (word.length() >= 20)
            return "No";

        int countOfZ = 0;
        int countOfO = 0;
        for(int i=0;i<word.length();i++) {
            if (word.toLowerCase().charAt(i) == 'z') {
                countOfZ++;
            } else if (word.toLowerCase().charAt(i) == 'o') {
                countOfO++;
            }
        }

        if (countOfO != countOfZ*2) {
            return "No";
        }

        return "Yes";
    }

    public static void main(String args[]) {
        System.out.println("1st Answer : "+Zoos("zoo"));
        System.out.println("2nd Answer : "+Zoos("zzoooo"));
        System.out.println("3rd Answer : "+Zoos("zzooooo"));
        System.out.println("4rd Answer : "+Zoos("zzoooooooooooooooooooooooooooooooooooooooo"));
    }
}
