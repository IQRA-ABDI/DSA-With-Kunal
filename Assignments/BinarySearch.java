public class BinarySearch {
    public static void main(String[] args) {
        int []arr={11,12,13,14,15,16,17};
        int search=14;
        int H= arr[6];
        int L=arr[0];
        int mid=(L+H)/2;
        if(mid >search){
            H=mid-1;
            mid=(L+H)/2;
            System.out.println("the number you are searching  is found = " + mid );

        }
        else if(mid < search){
            L=mid+1;
            mid=(L+H)/2;
            System.out.println("the number you are searching  is found = " + mid );
        }
        else if(mid == search){
            System.out.println("the number you are searching is found = " + mid);
        }

    }
}
