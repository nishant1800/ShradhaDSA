// Count Inversions : https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

class Solution {
    static int mergeSort(int arr[], int si, int ei) {
        if(si < ei) {
            int mid = si + (ei - si) / 2;
            
            int leftInvCount = mergeSort(arr, si, mid);
            int rightInvCount = mergeSort(arr, mid+1, ei);
            
            int invCount = merge(arr, si, mid, ei);
            
            return leftInvCount + rightInvCount + invCount;
        }
        
        return 0;
    }
    
    static int merge(int arr[], int si, int mid, int ei) {
        int i = si;
        int j = mid+1;
        int k = 0;
        
        int temp[] = new int[ei-si+1];
        
        int invCount = 0;
        
        while(i <= mid && j <= ei) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
                invCount += mid-i+1;
            }
        }
        
        while(i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        
        while(j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        
        for(int p=0; p<temp.length; p++) {
            arr[si+p] = temp[p];
        }
        
        return invCount;
    }
    
    static int inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr, 0, arr.length-1);
    }
}