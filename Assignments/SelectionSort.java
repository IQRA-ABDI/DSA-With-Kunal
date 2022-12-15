import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={7,1,9,5,8,6};
        System.out.println("unsorted array : "+ Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            int small=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[small]){
                    small=j;
            }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted array : "+ Arrays.toString(arr));
    }


}
