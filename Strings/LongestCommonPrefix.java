// 14. Longest Common Prefix

import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String strs1 = strs[0];
        String strs3 = strs[strs.length-1];
        int idx = 0;

        while(idx < strs1.length()) {
            if(strs1.charAt(idx) == strs3.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }

        return idx == 0 ? "" : strs1.substring(0, idx);
    }
}