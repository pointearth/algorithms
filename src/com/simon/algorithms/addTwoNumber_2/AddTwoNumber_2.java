package com.simon.algorithms.addTwoNumber_2;
/**
 * Definition for singly-linked list.**/
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
public class AddTwoNumber_2 {
    public static void main(String[] args){

        AddTwoNumber_2 atn = new AddTwoNumber_2();
        ListNode a = new ListNode(2),b= new ListNode(5),c = new ListNode(3);
        a.next = b;
        b.next=c;

        ListNode d = new ListNode(5),e= new ListNode(6),f = new ListNode(4);
        d.next = e;
        e.next=f;

       ListNode g = atn.AddTwoNumber(a,d);
       while (g != null){
           System.out.println(g.val);
           g = g.next;
       }
    }


    public ListNode AddTwoNumber(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curNode = dummyHead;

        int carry = 0;
        while (null != l1 || null != l2){
            int val1 = (null != l1)? l1.val:0;
            int val2 = (null != l2)? l2.val:0;
            int sum = val1+val2+carry;

            int curResult = sum%10;
            carry = sum/10;
            curNode.next = new ListNode(curResult);
            curNode = curNode.next;

            if (null != l1 ) l1 = l1.next;
            if (null != l2 ) l2 = l2.next;

        }
        if (carry == 1){
            curNode.next = new ListNode(1);
//            curNode = curNode.next;
        }

        return dummyHead.next;
    }
















//
//
//    public ListNode AddTwoNumber(ListNode l1, ListNode l2) {
//        ListNode dummyHead = new ListNode(0);
//        ListNode cur = dummyHead;
//        int carry = 0;
//        ListNode p = l1;ListNode q = l2;
//        while(null != p || null != q){
//            int x = (p != null) ? p.val:0;
//            int y = (q != null) ? q.val:0;
//            int sum = x+y+carry;
//            carry = sum/10;
//            cur.next = new ListNode(sum%10);
//            cur = cur.next;
//
//            if (p != null ) p = p.next;
//            if (q != null ) q = q.next;
//        }
//        if (carry > 0){
//            cur.next = new ListNode(1);
//        }
//        return dummyHead.next;
//    }



}