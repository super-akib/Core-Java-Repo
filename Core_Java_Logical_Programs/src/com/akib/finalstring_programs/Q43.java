package com.akib.finalstring_programs;

import java.util.Scanner;

/* WAP to enter a letter and display the next five letters
 Input: x
 Output: yzABC
 */
public class Q43 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        String str = "";
        for (int i = 1; i <= 5; i++) {
            if (ch >= 'a' && ch <= 'z') {
                str += ch++;
                if (ch > 'z') {
                    ch = 'A';
                    str += ch++;
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                str += ch++;
                if (ch > 'Z') {
                    ch = 'a';
                    str += ch++;
                }
            }
        }

        System.out.println("Output: " + str.substring(1));
        sc.close();
    }
}
