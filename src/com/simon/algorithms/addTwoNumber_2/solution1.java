/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        int carry = 0;
        ListNode p = l1;ListNode q = l2;
        while(null != p || null != q){
            int x = (p != null) ? p.val:0;
            int y = (q != null) ? q.val:0;
            int sum = x+y+carry;
            carry = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            
            if (p != null ) p = p.next;
            if (q != null ) q = q.next;
        }
        if (carry > 0){
            cur.next = new ListNode(1);
        }
        return dummyHead.next;
    }
}