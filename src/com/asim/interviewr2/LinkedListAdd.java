package com.asim.interviewr2;

import com.sun.org.apache.regexp.internal.RE;

import java.util.List;

public class LinkedListAdd {


    private ListNode l1;
    private ListNode l2;
    static ListNode result = null;
    static ListNode curr = null;
    static int diff =0;

    public static int getCount(ListNode temp1) {
        ListNode tempxx = temp1;
        int count = 0;
        while (tempxx != null) {
            count++;
            tempxx = tempxx.next;
        }
        return count;
    }

    public static void addNode(int a, ListNode ptr)
    {
        ListNode newPtr = new ListNode(0);
        newPtr.next=ptr;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head1 = null;
        ListNode head2 = null;
        ListNode result = new ListNode( -1 );
        ListNode RHead = result;
        ListNode curr = null;
        head1 = l1;
        head2 = l2;
        int count_l1=0;
        int count_l2=0;
        int temp = 0;
        int carry = 0;
        int val1 = 0;
        count_l1=getCount( l1 );
        count_l2=getCount( l2 );

        if(count_l1-count_l2<0)
        {
            //l1 is shorted
            diff = count_l1-count_l2;
            diff = diff * -1;
            addNode( diff, l1);
        }
        else if (count_l1-count_l2>0)
        {
            //l2 is short

            diff = count_l1-count_l2;
            addNode(diff,l2);
        }
        count_l1=getCount( l1 );
        count_l2=getCount( l2 );
        while (head1!= null && head2 != null) {
            temp = head1.val + head2.val;
            val1 = temp % 10 + carry;
            carry = temp / 10;

            curr=new ListNode( val1 );

            result.next=curr;
            result=curr;
            head2 = head2.next;
            head1 = head1.next;
        }

        if (carry>0)
        {
            val1 =  carry;
            curr=new ListNode( val1 );

            result.next=curr;
            result=curr;
        }

        return RHead.next;

    }

    public static void printfunc(ListNode ptr){
        while(ptr!=null)
        {
            System.out.print(ptr.val + "--->");
            ptr=ptr.next;

        }
        System.out.println(" ");


    }


        public static void main(String[] args) {
   /*     System.out.println("Test");
        ListNode p1;
        ListNode p2;
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);

        ListNode d= new ListNode (5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode (4);

        a.next=b;
        b.next =c ;
        c.next=null;
        p1=a;

        d.next=e;
        e.next=f;
        f.next=null;
        p2=d;
        ListNode var1;
        ListNode rtemp = addTwoNumbers( p1,p2 );
        printfunc( rtemp );
*/

        ListNode y = new ListNode(5);
        ListNode z = new ListNode(5);
        ListNode d= new ListNode (5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode (5);

        y.next=z;
        z.next=null;
       // d.next=e;
        //e.next=null;

        f.next=null;
        ListNode p3;
        ListNode p4;

        p3=y;
        p4=f;
        ListNode rtemp1=addTwoNumbers(p3,p4  );
        printfunc( rtemp1 );

    }
}

