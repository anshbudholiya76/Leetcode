/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

//LENGTH DIFF METHOD

    int lenA = 0;
    int lenB = 0;

    ListNode temp = headA;
    while(temp != null){
        lenA++;
        temp = temp.next;
    }

    temp = headB;
    while(temp != null){
        lenB++;
        temp = temp.next;
    }

    ListNode p1 = headA;
    ListNode p2 = headB;

    int diff = Math.abs(lenA - lenB);

    if(lenA > lenB){
        while(diff-- > 0){
            p1 = p1.next;
        }
    } else {
        while(diff-- > 0){
            p2 = p2.next;
        }
    }

    while(p1 != p2){
        p1 = p1.next;
        p2 = p2.next;
    }

    return p1;
}
}