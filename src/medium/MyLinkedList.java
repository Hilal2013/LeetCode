package medium;

import easy.Node;

public class MyLinkedList {
    ListNode head;
    ListNode tail;
    int size;
    public MyLinkedList() {
        this.size = 0;
    }

    boolean isEmpty() {
            return head == null;
    }
    void addNodes(ListNode node) {

        if (isEmpty()){
           head=tail=node;
        }else{
            tail.next=node;
            tail=node;
            size++;
        }

    }
    void printMyList() {
        ListNode current=head;

while(current!=null){

    System.out.print(current.data+" => ");
    current=current.next;
    if (current == null) System.out.print("null");
}
        System.out.println();
    }

    void deleteNNodesAfterMNodes(int n, int m) {
        ListNode current=head;
        ListNode prev=head;

        while(current!=null){

            for (int i = 1; i <= m; i++) {//m times current will go
            prev=current;
                current=current.next;
        }
            if (current == null) {return;}
            for (int i = 1; i <=n ; i++) {//n times removing
                prev.next=current.next;
                current=current.next;
                size--;

            }

            }
        }
    public ListNode removeNthFromEnd(ListNode head, int n) {
//Given the head of a linked list, remove the nth node from the end of the list and return its head.
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        //find list szize

        while(fast!=null){
            fast=fast.next;
            size++;
        }
if(size==n){
    return head.next;
}
        if (slow.next==null&&n==1){return null;}
        fast=head;
        for (int i = 0; i < n - 1; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = slow.next;
        slow.next = null;
        return head;


    }


    public ListNode remove(int val) {

        if (head==null&&val==1){  //order is important if putt iif it is null first line
            return null;
        }

        ListNode fast = head.next;
       ListNode slow = head;


        while (fast != null) {


            if (fast.data == val) {
slow.next=fast.next;
fast=slow.next;
            }else{
                slow=slow.next;
                fast=fast.next;
            }
            }

       if(head.data==val) {
           head=head.next;
       }

return head;
    }
    public void deleteNode(ListNode node) {
        if (node == null) {return;}
        if (node.next != null){
            node.data=node.next.data;//I assign nodenext data  to node
            node.next=node.next.next;//instead of deleting node //i linked node.next.next//deleting node.next

        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;
        while (current != null && current.next != null) {//11233
            if (current.data == current.next.data)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;

    }
}
