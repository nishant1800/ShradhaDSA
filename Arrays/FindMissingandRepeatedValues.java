// 2965. Find Missing and Repeated Values

import java.util.HashSet;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;
        int sq = n*n;

        int currSum = 0;
        int ans[] = new int[2];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(set.contains(grid[i][j])) {
                    ans[0] = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                    currSum += grid[i][j];
                }
            }
        }

        int totalSum = sq * (sq+1)/2;
        ans[1] = totalSum - currSum;
        return ans;
    }
}