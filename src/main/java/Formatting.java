import java.util.Scanner;

public class Formatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line

//            we need to pad with 0 on int x and also
//            String  is left justified using exactly 15 characters.
            System.out.printf("%-14s %03d\n", s1, x);
        }
        System.out.println("================================");

    }
}

