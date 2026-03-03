// 234. Palindrome Linked List

class Solution {
    ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return helper(head);
    }

    boolean helper(ListNode node) {
        if(node != null) {
            boolean smallAnswer = helper(node.next);
            if(!smallAnswer) {
                return false;
            }

            if(left.val != node.val) {
                return false;
            }
            left = left.next;
        }
         
        return true;
    }
}