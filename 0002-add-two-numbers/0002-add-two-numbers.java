class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int val1 = 0;
            int val2 = 0;

            // Get value from first list
            if (l1 != null) {
                val1 = l1.val;
            }

            // Get value from second list
            if (l2 != null) {
                val2 = l2.val;
            }

            // Add both values and carry
            int sum = val1 + val2 + carry;

            // Get the digit for current node
            int digit = sum % 10;

            // Get carry for next node
            carry = sum / 10;

            // Create new node
            temp.next = new ListNode(digit);
            temp = temp.next;

            // Move first list
            if (l1 != null) {
                l1 = l1.next;
            }

            // Move second list
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // If carry is still left
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return dummy.next;
    }
}