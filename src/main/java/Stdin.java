import java.util.Scanner;

//In this challenge, you must read an integer, a double, and a String from stdin, then print the values according
// to the instructions in the Output Format section below.To make the problem a little easier, a portion of the code
// is provided for you in the editor.

//        Input Format
//        There are three lines of input:
//        The first line contains an integer.
//        The second line contains a double.
//        The third line contains a String.

//        Output Format
//        There are three lines of output:
//        On the first line, print String: followed by the unaltered String read from stdin.
//        On the second line, print Double: followed by the unaltered double read from stdin.
//        On the third line, print Int: followed by the unaltered integer read from stdin.

public class Stdin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        for user input we need to specify the data types, for integer it will be nextINt
        int i = scan.nextInt();

//        for double it will be nextDouble
        double d = scan.nextDouble();

//        putting nextLine after double so that it  will be reading the remainder of the integer line (which is empty).
        scan.nextLine();

//        for string data type
        String s = scan.nextLine();

//        print out the answers
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}