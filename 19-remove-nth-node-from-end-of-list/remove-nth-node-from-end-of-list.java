/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int s = 1;
        while(curr!=null && curr.next!=null){
            curr = curr.next;
            s++;
        }
        int tar = s - n;
        curr = head;
        ListNode prev = null;
        ListNode next;
        int i = 0;
        while(curr != null){
            next = curr.next;
            if(tar == 0){
                return head.next;
            }
            if(i == tar){
                prev.next = next;
            }
            
            prev = curr;
            curr = curr.next;
            i++; 
        }
        return head;
    }
}