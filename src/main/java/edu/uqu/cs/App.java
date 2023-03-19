package edu.uqu.cs;

import java.util.Scanner;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

public class App {

    public static void main(String[] args) {
        Scanner fofy = new Scanner(System.in);
        twisters();
       
        System.out.print("Enter");
        phoneKeypad(fofy.nextLine());
    }
    
    public static void twisters(){
        for (int i = 1; i <= 110; i++) {
            if (i % 2 == 0 || i % 4 == 0 || i % 6 == 0) {
                if (i % 2 == 0) {
                    System.out.print("Tweetle");

                }
                if (i % 4 == 0) {
                    System.out.print("Beetle");

                }
                if (i % 6 == 0) {
                    System.out.print("Poodle");
                }
            } else {
                System.out.print(" " + i + " ");
            }
            if (i%11 ==0) {
                System.out.println();
            }

        }
    }
    public static void phoneKeypad(String str) {

        
        String out = "";
        
        // loop for each char in the text
        for (char ch : str.toUpperCase().toCharArray()) {
            // switch case for each 3 letters
            switch (ch) {
                case 'A':
                case 'B':
                case 'C':
                    out += "2";
                    break;
                case 'D':
                case 'E':
                case 'F':
                    out += "3";
                    break;
                case 'G':
                case 'H':
                case 'I':
                    out += "4";
                    break;
                case 'J':
                case 'K':
                case 'L':
                    out += "5";
                    break;
                case 'M':
                case 'N':
                case 'O':
                    out += "6";
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                   out += "7";
                    break;
                case 'T':
                case 'U':
                case 'V':
                    out += "8";
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    out += "9";
                    break;
            }
        }
        System.out.print(out);
   
    }
}
