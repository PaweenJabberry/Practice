/*
* Cipher
* Indian army is going to do a surprise attack on one of its enemies country. The President of India, the Supreme Commander of the
* Indian Army will be sending an alert message to all its commanding centers. As enemy would be monitoring the message, Indian army
* is going to encrypt(cipher) the message using basic encryption technique. A decoding key 'K' (number) would be sent secretly.
*
* You are assigned to develop a cipher program to encrypt the message. Your cipher must rotate every character in the message by a
* fixed number making it unreadable by enemies.
*
* Given a single line of string 'S' containing alpha, numeric and symbols, followed by a number '0<=N<=1000'. Encrypt and print the
* resulting string.
*
* Note: The cipher only encrypts Alpha and Numeric. (A-Z, a-z, and 0-9) . All Symbols, such as - , ; %, remain unencrypted.
*
* SAMPLE INPUT                          SAMPLE OUTPUT
* All-convoYs-9-be:Alert1.              Epp-gsrzsCw-3-fi:Epivx5.
* 4
*
* Explanation
* First line contains the string to convert. S
* Second line contains the number, encrypt key. K
* A becomes E, Y becomes C, 9 becomes 3,
* -, . unchanged.
*
* */

import java.util.Scanner;

public class Cipher {

    public static void Cipher() {
        Scanner s = new Scanner(System.in);
        String text;
        Integer encryptKey;
        String answer = "";

//        System.out.print("String : ");
        text = s.nextLine();
//        System.out.print("Number : ");
        encryptKey = s.nextInt();

        for(int i=0; i<text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
//                System.out.println("isLetter : "+text.charAt(i));
                char a = text.charAt(i);
                int newEncrypt = encryptKey;
                if (Character.isLowerCase(a)) {
                    if (a+encryptKey > 'z') {
                        do {
                            newEncrypt = newEncrypt - ('z' - a);
                            a = 'a' - 1;
//                            System.out.println("New Encrypt After z : "+newEncrypt);
                        } while (a+newEncrypt > 'z' || a+newEncrypt < 'a');
                    }
                } else if (a+encryptKey > 'Z') {
                    if (a+encryptKey > 'Z') {
                        do {
                            newEncrypt = newEncrypt - ('Z' - a);
                            a = 'A' - 1;
//                            System.out.println("New Encrypt After Z : "+newEncrypt);
                        } while (a+newEncrypt > 'Z' || a+newEncrypt < 'A');
                    }
                }
//                System.out.println("isLetter : "+(a+=encryptKey));
                answer += a+=newEncrypt;
            } else if (Character.isDigit(text.charAt(i))) {
                Integer number = Character.getNumericValue(text.charAt(i));
//                System.out.println("isDigit : "+((number+encryptKey)%10));
                answer += (char)(number+encryptKey)%10;
            } else {
//                System.out.println("Sp Character : "+text.charAt(i));
                answer += text.charAt(i);
            }
        }
//        System.out.println("After encrypt : "+answer);
        System.out.println(answer);
    }

    public static void main(String args[]) {
        Cipher();
    }
}
