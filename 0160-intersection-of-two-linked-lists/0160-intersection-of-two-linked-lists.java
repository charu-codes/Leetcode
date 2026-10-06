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
        ListNode L1 = headA;
        ListNode L2 = headB;

        if(L1==null || L2==null){return null;}

        while(L1!=L2){
            if(L1==null){
                L1 = headB;
            }

            else{L1 = L1.next;}
            if(L2==null){
                L2 = headA;
            }
            else{
            
            L2 = L2.next;}
        }

        return L1;
    }
}