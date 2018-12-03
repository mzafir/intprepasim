package com.asim.interviewr2;

public class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }


    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        SinglyLinkedListNode Ref = null;
        SinglyLinkedListNode Prev = head;
        Ref = head.next;
        int temp = head.data;

        while (Prev != null && Prev.next != null) {

            if (head.data == head.next.data) {
                head.next = head.next.next;
            }
            //      temp = Prev.data;
            //Ref = Ref.next;
            if (Prev.data == Prev.next.data)
            //found duplicate
            {
                Prev.next = Prev.next.next;


            }
            //Ref
            Prev = Prev.next;
        }


        return head;

    }

    public static void printList(SinglyLinkedListNode ptr) {
        while (ptr.next == null) {
            System.out.print( ptr.data + "-->" );
        }
    }


    public static void main(String[] args) {

        System.out.println( "this is a test" );
        SinglyLinkedListNode n1 = new SinglyLinkedListNode( 1 );
        SinglyLinkedListNode n2 = new SinglyLinkedListNode( 1 );
        SinglyLinkedListNode n3 = new SinglyLinkedListNode( 1 );
        SinglyLinkedListNode n4 = new SinglyLinkedListNode( 2 );
        SinglyLinkedListNode n5 = new SinglyLinkedListNode( 2 );
        SinglyLinkedListNode n6 = new SinglyLinkedListNode( 3 );
        SinglyLinkedListNode p4 = null;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        p4 = n1;


        printList( removeDuplicates( p4 ) );

    }
}
