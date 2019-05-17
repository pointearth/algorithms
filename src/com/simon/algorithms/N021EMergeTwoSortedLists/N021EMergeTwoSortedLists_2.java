package com.simon.algorithms.N021EMergeTwoSortedLists;


 //* Definition for singly-linked list.


import com.simon.algorithms.ListNode;

class Solution {
    public static void main(String[] args) {

        ListNode a = new ListNode(1),b= new ListNode(2),c = new ListNode(4);
        a.next = b;
        b.next=c;

        ListNode d= new ListNode(1),e= new ListNode(3),f = new ListNode(4);
        d.next = e;
        e.next=f;

        Solution ml = new Solution();
        ListNode ln = ml.mergeTwoLists(a,d);

        while (ln != null ){
            System.out.println(ln.val);
            ln =ln.next;
        }

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     
        if(l1 == null) return l2; 
        if(l2 == null) return l1; 
        if (l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l2.next,l1);
            return l2;
        }
        
    }
}