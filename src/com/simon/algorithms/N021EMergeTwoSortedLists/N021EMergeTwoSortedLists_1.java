package com.simon.algorithms.N021EMergeTwoSortedLists;


 //* Definition for singly-linked list.


import com.simon.algorithms.ListNode;

class N021EMergeTwoSortedLists {


    public static void main(String[] args) {
        ListNode a = new ListNode(1),b= new ListNode(2),c = new ListNode(4);
        a.next = b;
        b.next=c;

        ListNode d= new ListNode(1),e= new ListNode(3),f = new ListNode(4);
        d.next = e;
        e.next=f;

        N021EMergeTwoSortedLists ml = new N021EMergeTwoSortedLists();

        ListNode ln = ml.mergeTwoLists(a,d);
        while (ln != null ){
            System.out.println(ln.val);
            ln =ln.next;
        }

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode curNode = head;
        while(true){
            if (l1 == null ){
                curNode.next = l2;
                break;
            }else if (l2 == null){
                curNode.next = l1;
                break;
            } else{
                if (l1.val <= l2.val){
                    curNode.next = l1;
                    l1 = l1.next;
                }else {
                    curNode.next = l2;
                    l2 = l2.next;
                }
               curNode = curNode.next;
            }
        }
        return head.next;
    }
    
}