// 18. 4 Sum 

import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                long target2 = (long)target - (long)nums[i] - (long)nums[j];

                int left = j+1, right = nums.length-1;
                while(left < right) {
                    int sum = nums[left] + nums[right];

                    if(sum > target2) {
                        right--;
                    } else if(sum < target2) {
                        left++;
                    } else {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        left++;
                        right--;
                        ans.add(list);

                        while(left < right && nums[left] == list.get(2)) {
                            left++;
                        }

                        while(left < right && nums[left] == list.get(3)) {
                            right--;
                        }
                    }
                }

                while(j+1 < nums.length && nums[j] == nums[j+1]) {
                    j++;
                }
            }

            while(i+1 < nums.length && nums[i] == nums[i+1]) {
                i++;
            }
        }

        return new ArrayList<List<Integer>>(ans);
    }
}
