 //--Question one(Area Of Circle Java Program)

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  area=(22*r*r)/7 ;
        System.out.println("Area of Circle is: " + area);


 //--Question two(Area Of Triangle)

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the width of the Triangle:");
        double w= s.nextDouble();
        System.out.println("Enter the height of the Triangle:");
        double h= s.nextDouble();
        //Area = (width*height)/2
        double area=(w*h)/2;
        System.out.println("Area of Triangle is: " + area);


  //--Question three(Perimeter Of Circle)

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  p=(22*2*r)/7 ;
        System.out.println("Perimeter of Circle is: " +p);


   //--Question four(Perimeter Of Equilateral Triangle)

        double side, area;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter Length of Side of an Equilateral Triangle");
        side = scanner.nextDouble();
        area = Math.sqrt(3) / 4 * side * side;
        System.out.format("The Area of Equilateral Triangle = %.3f\n", area);

  //-- Question Five(Volume Of Cone Java Program)

        double R = 6, H = 8;
        double S = Math.sqrt(R * R + H * H);
        double SurfaceArea = (Math.PI * R * R) + (Math.PI * R * S);
        double Volume = (Math.PI * R * R * H) / 3;
        System.out.println("Surface area of cone is : " + SurfaceArea);
        System.out.println("Volume of cone is : " + Volume);


//--Question Six(Factorial Program In Java)

        Scanner in=new Scanner(System.in);
        System.out .println("enter a number");
        int number= in.nextInt();
        int i;
        int fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);


 //-- Question Seven (Calculate Discount Of Product)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double originalPrice = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercentage = sc.nextDouble();
        double discountedPrice = originalPrice - (originalPrice * discountPercentage / 100);
        System.out.println("Discounted price is " + discountedPrice);


 //-- Question Eight(Calculate Distance Between Two Points)

        int x1,x2,y1,y2;
        double distance;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 point");
        x1=sc.nextInt();
        System.out.println("enter y1 point");
        y1=sc.nextInt();
        System.out.println("enter x2point");
        x2=sc.nextInt();
        System.out.println("enter y2 point");
        y2=sc.nextInt();
        distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))
        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is = "+distance);

//-- Question Nine(Addition Of Two Numbers)

        Scanner in =new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= in.nextInt();
        System.out.println("enter number 2");
        int num2= in.nextInt();
        int sum=num1+num2;
        System.out.println("the sum is = "+sum);


//--Question Ten(Fibonacci Series In Java Programs)

        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            



