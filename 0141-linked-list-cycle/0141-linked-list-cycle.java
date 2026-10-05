/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode a = head;

        if(a==null){return false;}
        for(int i=0; i<10000; i++){
            if(a.next == null){
                return false;
            }
            a = a.next;
        }
        return true;
    }
}