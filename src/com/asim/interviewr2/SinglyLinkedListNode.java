package com.asim.interviewr2;

public class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        data = this.data;
        next = null;
    }


    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        SinglyLinkedListNode Ref = null;
        SinglyLinkedListNode Prev = head;
        Ref = head.next;
        int temp = head.data;

        while (Prev.next != null) {
            temp = Prev.data;
            Ref = Ref.next;
            if (Ref.data == temp)
            //found duplicate
            {
                Prev.next = Ref.next.next;
                Ref.next = null;

            }
            Prev = Prev.next;
        }
        Ref = head;
        return Ref;

    }


    public static void main(String[] args) {

        System.out.println( "this is a test" );
        SinglyLinkedListNode n1 = new SinglyLinkedListNode( 3 );
        SinglyLinkedListNode n2 = new SinglyLinkedListNode( 4 );
        SinglyLinkedListNode n3 = new SinglyLinkedListNode( 5 );
        SinglyLinkedListNode n4 = new SinglyLinkedListNode( 6 );
        SinglyLinkedListNode n5 = new SinglyLinkedListNode( 3 );
        SinglyLinkedListNode n6 = new SinglyLinkedListNode( 4 );
        SinglyLinkedListNode p4 = null;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        p4 = n1;

        removeDuplicates( p4 );
    }
}
