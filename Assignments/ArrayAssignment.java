public class ArrayAssignment {
    public static void main(String[] args) {
        //how many numbers are smaller than the current numbers;
        int [] arr={8,1,2,2,3};
        int count=0;
            if (arr[0]>arr[1]){
                count++;
                if (arr[0]>arr[2]){
                    count++;

                }
                if (arr[0]>arr[3]){
                    count++;

                }
                if (arr[0]>arr[4]) {
                    count++;
                }
            }
            System.out.println(count);
        int count1=0;
        if (arr[1]>arr[0]){
            count1++;
            if (arr[1]>arr[2]){
                count1++;

            }
            if (arr[1]>arr[3]){
                count1++;

            }
            if (arr[1]>arr[4]) {
                count1++;
            }
        }
        System.out.println(count1);
        int count2=0;
        if (arr[2]>arr[1]){
            count2++;
            if (arr[2]>arr[0]){
                count2++;

            }
            if (arr[2]>arr[3]){
                count2++;

            }
            if (arr[2]>arr[4]) {
                count2++;
            }
        }
        System.out.println(count2);
        int count3=0;
        if (arr[3]>arr[1]){
            count3++;
            if (arr[3]>arr[2]){
                count3++;

            }
            if (arr[3]>arr[0]){
                count3++;

            }
            if (arr[2]>arr[4]) {
                count3++;
            }
        }
        System.out.println(count3);
        int count4=0;
        if (arr[4]>arr[1]){
            count4++;
            if (arr[4]>arr[0]){
                count4++;

            }
            if (arr[4]>arr[3]){
                count4++;

            }
            if (arr[4]>arr[2]) {
                count4++;
            }
        }
        System.out.println(count4);






    }


        }


