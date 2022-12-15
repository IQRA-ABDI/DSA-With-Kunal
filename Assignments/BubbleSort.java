import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={1,6,5,0,4};
        System.out.println("unsorted array : "+ Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array : "+ Arrays.toString(arr));
    }
}
