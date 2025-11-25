// 443. String Compression

class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int start = 0;
        
        while(start < chars.length) {
            int end = start;
            while(end < chars.length && chars[start] == chars[end]) {
                end++;
            }
            int count = end - start;
            chars[index++] = chars[start];
            if(count >= 2) {
                char freq[] = Integer.toString(count).toCharArray();
                for(char ch : freq) {
                    chars[index++] = ch;
                }
            }
            start = end;
        }

        return index;
    }
}