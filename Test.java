// this file is only testing

public class Test {
    public static int man(int arr[]) {
        int freq = 0;
        int ans = 0;

        for(int i=0; i<arr.length; i++) {
            if(freq == 0) {
                ans = arr[i];
            }

            if(ans == arr[i]) {
                freq++;
            } else {
                freq--;
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 1, 2, 2};
        System.out.println(man(arr));
    }
}
