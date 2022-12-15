import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("enter how many values you want");
//        int n= in.nextInt();
//        int[]arr=new int[n];
//        System.out.println("enter "+ n +" values");
//        for (int i = 0; i < arr.length ; i++)
//            arr[i]=in.nextInt();
//        System.out.println("enter the element you want to search");
//        int target=in.nextInt();
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i]==target){
//                System.out.println( target + " found at position "+i);
//
//        }
//        }

        int[]arr={1,2,5,4};
        for (int i = 0; i < arr.length ; i++) {
            int target =4;
            if(target==arr[i]){
                System.out.println(target + " we found it at position " + i);
            }

        }

        }
    }

