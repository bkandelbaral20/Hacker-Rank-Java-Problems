
//Print  lines of output; each line  (where ) contains the  of  in the form:
//        N x i = result.

import java.util.*;

public class Loop {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println(N + " x " + i +  " = " + N*i);
        }
    }
}

