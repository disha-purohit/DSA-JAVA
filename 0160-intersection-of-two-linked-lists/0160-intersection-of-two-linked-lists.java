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
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode t1 = head1;
        ListNode t2 = head2;
        int n1 = 0;
        int n2 = 0;
        while(t1 != null){
            n1++;
            t1 = t1.next;
        }
        while(t2 != null){
            n2++;
            t2 = t2.next;
        }
          t1 = head1;
          t2 = head2;
        if(n1 > n2){
            int diff = n1 - n2;
            while(diff > 0){
                t1 = t1.next;
                diff--;
            }
        }
        else{
            int diff = n2 - n1;
            while(diff > 0){
                t2 = t2.next;
                diff--;
            }
            }
         while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
         } 
        return t1;
        
    }
}