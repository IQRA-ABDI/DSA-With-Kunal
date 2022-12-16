import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--Question One
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();
        if(n%2==0){
            System.out.println("its even ");
        }
        else{
            System.out.println("its odd");
        }



        //--Question Two
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a name :");
        String name = input.next();
        System.out.println("nice to meet you " + name);


        //--Question Three
        Scanner b = new Scanner( System.in);
        System.out.println("enter principal value : ");
        int P = b.nextInt();
        System.out.println("enter time : ");
        int T = b.nextInt();
        System.out.println("enter rate :");
        int R = b.nextInt();
        int result = P*R*T/100;
        System.out.println("RESULT IS " + result);


        //--Question Four
        Scanner in = new Scanner(System.in);
        int ans = 0;
        System.out.print("Enter the operator: ");
        char op = in.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            System.out.print("Enter two numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if (op == '+') {
                ans = num1 + num2;
            }
            if (op == '-') {
                ans = num1 - num2;
            }
            if (op == '*') {
                ans = num1 * num2;
            }
            if (op == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                }
            }
            if (op == '%') {
                ans = num1 % num2;
            }
        }else if (op == 'x' || op == 'X') {
        }else {
            System.out.println("Invalid operation!!");
            }
            System.out.println(ans);



        //--Question Five
        System.out.println("Enter the fist number: ");
        Scanner Large = new Scanner(System.in);
        int num1 = Large.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = Large.nextInt();

        if (num1>num2){
            System.out.println("Number 1 is the Largest");

        }
        else{
            System.out.println("Number 2 is the largest");
        }



        //--Question Six
        float rupees;
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter rupees:");
        rupees = inp.nextLong();
        float dollars = rupees / 64;
        System.out.println(dollars + " Dollars");


        //--Question Seven
        Scanner inc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("Enter the nth value: ");
        int n = inc.nextInt();
        System.out.print("Fibonacci series: ");
        int temp = 0;
        while(temp <= n) {
            System.out.print(temp + " ");
            a = b;
            b = temp;
            temp = a + b;
        }




        //--Question Eight

        String str = "new", reverseStr = "";//you can enter any string word that you want to see
        int strLength = str.length();
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }


        //--Question Nine
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ::");
        num1 = sc.nextInt();
        System.out.println("Enter the second number ::");
        num2 = sc.nextInt();
        for (int i = num1; i < num2; i++) {
            int check, rem, sum = 0;
            check = i;
            while (check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if (sum == i) {
                System.out.println("" + i + " is an Armstrong number.");
            }
        }
    }
