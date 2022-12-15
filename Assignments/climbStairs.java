import java.util.Scanner;

public class climbStairs {
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
           System.out.println("enter a number");
            int n= in.nextInt();
            int n1 = 1;
            int n2 = 0;
            int n3 = 0;
            for (int i=1; i<=n; ++i) {
            n3 = n1 + n2;
            n2 = n1;
            n1 = n3;
        }
        System.out.println(n3);

    }
}
