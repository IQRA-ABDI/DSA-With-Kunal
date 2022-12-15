import java.util.Scanner;

public class Fibnocci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();
        int n1 = 0;
        if (n < 2)
            System.out.println(n1 + n);
        else {
            int x = n - 1 + n - 2;
            System.out.println(x);
        }
    }
}
