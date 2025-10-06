// 540. Single Element in a Sorted Array

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int si = 0, ei = nums.length-1;

        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];

        while(si <= ei) {
            int mid = si + (ei-si)/2;

            if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]) {
                return nums[mid];
            }

            if(mid % 2 == 0) {
                if(nums[mid-1] == nums[mid]) {
                    ei = mid-1;
                } else {
                    si = mid+1;
                }
            } else {
                if(nums[mid-1] == nums[mid]) {
                    si = mid+1;
                } else {
                    ei = mid-1;
                }
            }
        }

        return -1;
    }
}