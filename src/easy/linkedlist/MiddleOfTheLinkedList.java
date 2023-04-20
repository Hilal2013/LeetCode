package easy.linkedlist;

public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
//create two pointers
        ListNode fast = head;
        ListNode slow = head;
//iterate over the linkedlist
        while (fast != null && fast.next !=null) {
            slow = slow.next;//single jump
            fast = fast.next.next;//double jump
        }

            return slow;
    }
}
/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.


 */