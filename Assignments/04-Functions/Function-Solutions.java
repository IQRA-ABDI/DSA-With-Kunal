//Question 1(Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.)

    Scanner in = new Scanner(System.in) ;
    int a = in.nextInt() ;
    int b = in.nextInt() ;
    int c = in.nextInt() ;
    int maximum = max(a,b,c) ;
    int minimum = min(a,b,c) ;
    System.out.println("maximum = " +maximum) ;
    System.out.print("minimum = " +minimum) ;

}
static int max(int a , int b ,int c ) {
    int maxi = a;
    if(b>maxi) {
        maxi = b;
    }
    if (c>maxi) {
        maxi =c;
    }
    return maxi ;

}
static int min(int a , int b ,int c) {

    int mini = a;
    if (b<mini) {
        mini = b;
    }
    if (c<mini) {
        mini=c;
    }
    return mini;



     //Question 2(Define a program to find out whether a given number is even or odd.)

     Scanner reader = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int num = reader.nextInt();

     if(num % 2 == 0)
         System.out.println(num + " is even");
     else
         System.out.println(num + " is odd");

    //Question 3(A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.)

       int age, diff;
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter your age: ");
       age = scan.nextInt();
       if(age>=18)
       {
           System.out.println("You are eligible for voting.");
       }
       else
       {
           diff = (18 - age);
           System.out.println("Sorry,You can vote after: "+ diff + " years");
       }

//Question 4(Write a program to print the sum of two numbers entered by user by defining your own method.)
       Scanner input = new Scanner (System.in);
       System.out.print("Input the first number: ");
       int num1 = input.nextInt();
       System.out.print("Input the second number: ");
       int num2 = input.nextInt();
       int sum = num1 + num2;
       System.out.println();
       System.out.println("Sum: "+sum);

//Question 5 (Define a method that returns the product of two numbers entered by user.)
       Scanner in = new Scanner(System.in);

       System.out.print("Input first number: ");
       int num1 = in.nextInt();

       System.out.print("Input second number: ");
       int num2 = in.nextInt();

       System.out.println(num1 + " x " + num2 + " = " + num1 * num2);


//Question 6(Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.)

        Scanner sc=new Scanner(System.in);
        create scanner object
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        this method reads value for num1 providing by user
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        this method reads value for num2 providing by user
        sc.close();//closing the scanner class
        calcProduct(num1,num2); //calling the method
        }
        calcTotal method
        public static void calcProduct(int x,int y){
        int result=0;
        result=x*y;
        System.out.println("product of two numbers  "+result);

//Question 7(Define a method to find out if a number is prime or not.)
       static boolean isPrime(int n)
       {
           if (n <= 1)
               return false;

           Check from 2 to n-1
           for (int i = 2; i < n; i++)
               if (n % i == 0)
                   return false;

           return true;
       }

       public static void main(String args[])
       {
           if (isPrime(11))
               System.out.println(" true");
           else
               System.out.println(" false");
           if (isPrime(15))
               System.out.println(" true");
           else
               System.out.println(" false");
       }


//Question 8(Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:)

        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);
        Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;

        /* Printing grade of a student using switch case statement */
        switch ((int) percentage / 10) {
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
            case 7:
                System.out.println("Grade : A");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
        }


//Question 9(Write a program to print the factorial of a number by defining a method named 'Factorial')

       static int factorial(int n){
           if (n == 0)
               return 1;
           else
               return(n * factorial(n-1));
       }
       public static void main(String args[]){
           int i,fact=1;
           int number=4;//It is the number to calculate factorial
           fact = factorial(number);
           System.out.println("Factorial of "+number+" is: "+fact);


//Question 10(Write a function to find if a number is a palindrome or not. Take number as parameter.)
       int x,number, y=0,temp=0;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter any number: ");
       number=s.nextInt();
       x=number;
       while(number>0)
       {
           x=number%10;
           number=number/10;
           temp=temp*10+x;
       }
       if(temp==y)
       {
           System.out.println("Number is Palindrome");
       }
       else
       {
           System.out.println("not Palindrome");


//question 12(Write a function to check if a given triplet is a Pythagorean triplet or not.)

       static boolean isTriplet(int ar[], int n)
       {
           for (int i = 0; i < n; i++) {
               for (int j = i + 1; j < n; j++) {
                   for (int k = j + 1; k < n; k++) {
                       int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];

                       if (x == y + z || y == x + z || z == x + y)
                           return true;
                   }
               }
           }

           return false;
       }

       public static void main(String[] args)
       {
           int ar[] = { 3, 1, 4, 6, 5 };
           int ar_size = ar.length;
           if (isTriplet(ar, ar_size) == true)
               System.out.println("Yes");
           else
               System.out.println("No");


//question 13(Write a function that returns all prime numbers between two given numbers.)

       Scanner sc = new Scanner(System.in);
       int a, b, i, j, flag;

       System.out.printf("Enter lower bound of the interval: ");
       a = sc.nextInt(); // Take input

       System.out.printf("\nEnter upper bound of the interval: ");
       b = sc.nextInt(); // Take input

       System.out.printf("\nPrime numbers between %d and %d are: ", a, b);


       for (i = a; i <= b; i++) {


           if (i == 1 || i == 0)
               continue;

           flag variable to tell
           if i is prime or not
           flag = 1;

           for (j = 2; j <= i / 2; ++j) {
               if (i % j == 0) {
                   flag = 0;
                   break;
               }
           }


           if (flag == 1)
               System.out.println(i);
       }

//question 14(Write a function that returns the sum of first n natural numbers.)

       static int findSum(int n)
       {
           int sum = 0;
           for (int x = 1; x <= n; x++)
               sum = sum + x;
           return sum;
       }

       public static void main(String args[])
       {
           int n = 5;
           System.out.println(findSum(n));
