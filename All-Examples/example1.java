// //all the examples of day2 lessons 
// //if you need to run, just run one program and put all the remain programs comment please!
//*if you need to take the comments from this code, use(ctrl+/)

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         // --print a string
//         System.out.println("hello world");

//         //--another way you can print a strings
//         String a="hello world";//--you can try char data type
//         System.out.println(a);

//         //--sum of two numbers that you declare in your code
//         int s=10;//--you can use float, double or bool any data type you  want
//         int d=20;
//         int SUM=s+d;
//         System.out.println(SUM);

//         //--sum of two numbers from the keyboard
//         Scanner in=new Scanner(System.in);
//         int num1;
//         System.out.println("enter num1 ");
//         num1= in.nextInt();
//         int num2;
//         System.out.println("enter num2 ");
//         num2= in.nextInt();
//         int sum=num1+num2;
//         System.out.println("the sum is = " +sum);

//         //--conditions - if_else:
//         int salary = 25400;
//         if (salary > 10000) {
//             salary = salary + 2000;}
//         else {
//             salary = salary + 1000;
//         }
//         System.out.println(salary);

//         //--conditions - multiple if_else:
//         int salary = 25400;
//         if (salary > 10000) {
//             salary += 2000; // salary = salary + 2000
//         } else if (salary > 20000) {
//             salary += 3000;
//         }
//         else {
//             salary += 1000;
//         }
//         System.out.println(salary);

//         //--loops
//         for (int num = 1; num <= 5; num++) {
//             System.out.println(num);
//         }
//         int num  = 1;
//         while (num <= 5) {
//             System.out.println(num);
//             num += 1;
//         }

//         int num = 1;
//         do {
//             System.out.println(num);
//             num++;
//         } while (num <= 5);


//         //--Finally simple Calculator program
//         Scanner in = new Scanner(System.in);
//         int ans = 0;
//         while (true) {
//             System.out.print("Enter the operator: ");
//             char op = in.next().trim().charAt(0);
//             if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//                 System.out.print("Enter two numbers: ");
//                 int num1 = in.nextInt();
//                 int num2 = in.nextInt();
//                 if (op == '+') {
//                     ans = num1 + num2;
//                 }
//                 if (op == '-') {
//                     ans = num1 - num2;
//                 }
//                 if (op == '*') {
//                     ans = num1 * num2;
//                 }
//                 if (op == '/') {
//                     if (num2 != 0) {
//                         ans = num1 / num2;
//                     }
//                 }
//                 if (op == '%') {
//                     ans = num1 % num2;
//                 }
//             } else if (op == 'x' || op == 'X') {
//                 break;
//             } else {
//                 System.out.println("Invalid operation!!");
//             }
//             System.out.println(ans);
//         }
//     }
// }



