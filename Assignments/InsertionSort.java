import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr={4,3,0,1};
        System.out.println("unsorted array : "+ Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 &&(arr[j]>key)){
                arr[j+1]=arr[j];
                j=j-1;
                arr[j+1]=key;


            }





        }
        System.out.println("Sorted array : "+ Arrays.toString(arr));


    }
}
