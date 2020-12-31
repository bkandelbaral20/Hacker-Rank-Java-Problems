import java.util.Scanner;

/*
We use the integers a,b and n  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and
 values as a single line of  space-separated integers.
 */
public class LoopII {
    public static void main(String []argh){
//        asking user for integer a, b and n

        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

//        loop to go until user input
        for(int i=0;i<userInput;i++){

//            getting all the integers from user
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int sum = a;

//            for inner loop
            for(int j=0; j<n; j++)
            {
                sum+=(Math.pow(2,j)*b);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
