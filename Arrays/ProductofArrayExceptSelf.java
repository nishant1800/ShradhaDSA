// 238. Product of Array Except Self

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            int prod = 1;

            for(int j=1; j<nums.length; j++) {
                if(i != j) {
                    prod *= nums[j];
                }
            }

            ans[i] = prod;
        }

        return ans;
    }
}