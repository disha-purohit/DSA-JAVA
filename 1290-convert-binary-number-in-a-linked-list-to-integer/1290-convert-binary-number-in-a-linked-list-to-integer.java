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
    public int getDecimalValue(ListNode head) {
        
ListNode temp = head;
   int length = 0;
while(temp != null){
    temp = temp.next;
    length++;
}
int [] arr  = new int[length];
temp = head;
 int i = 0;
while(temp != null){
    arr[i] =temp.val;
    i++;
    temp = temp.next;
}
int number = 0;
int n = arr.length;
 int j = 0 ;


for(int k = n-1 ; k >= 0 ; k--){
    int pow = 1 << j;
    j++;
    number = number + arr[k] * pow;
}
return number;
        
    }
}