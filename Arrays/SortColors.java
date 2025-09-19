// 50. Sort Colors

public class SortColors {
    public static void sortColor(int arr[]) {
        int count0 = 0, count1 = 0, count2 = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                count0++;
            } else if(arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int idx = 0;
        for(int i=0; i<count0; i++) {
            arr[idx] = 0;
            idx++;
        }

        for(int i=0; i<count1; i++) {
            arr[idx] = 1;
            idx++;
        }

        for(int i=0; i<count2; i++) {
            arr[idx] = 2;
            idx++;
        }
    }
    public static void main(String args[]) {
        int arr[] = {2,0,2,1,1,0};
        sortColor(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
