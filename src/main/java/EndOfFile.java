/*
The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
 */

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner (System.in);
        System.out.println("please enter something");

            int count = 1;
            while (scan.hasNext()) {
                String userInput = scan.nextLine();
                System.out.println(count + " " + userInput);
                count++;
            }


        }
}
