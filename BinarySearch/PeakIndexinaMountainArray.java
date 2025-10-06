// 852. Peak Index in a Mountain Array

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int si = 1, ei = arr.length-2;

        while(si <= ei) {
            int mid = (si+ei) / 2;

            if(arr[mid-1] <arr[mid] && arr[mid] > arr[mid+1]) {
                return mid;
            }

            if(arr[mid-1] < arr[mid]) {
                si = mid+1;
            } else {
                ei = mid-1;
            }

        }

        return -1;
    }
}