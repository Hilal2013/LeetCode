package easy.linkedlist;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node3;
       // node4.next=null;
     //   node1.printNodes(node1);
        System.out.println(detectCycleWithoutModify(node1));
       System.out.println(detectCycle(node1));
    }
    public static ListNode detectCycleWithoutModify(ListNode head){
        if (head == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;//slow move go one step
            fast=fast.next.next;//fast will move two steps
            //If there is no cycle, we will reach end of the list
          //  If there is cyle, we will move fast and slow until slow == fast.
            if(slow==fast) {
                slow=head; // slow anymore will be head that cycle begins that point

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                System.out.println(slow.val);
                return slow;
            }

        }

return null;

    }

    public static int detectCycle(ListNode head) {

        LinkedHashMap<ListNode,Integer> map=new LinkedHashMap<>();

        ListNode current = head;
        int index=0;
        while (current != null) {

            if (map.containsKey(current)){
               return map.get(current);//2

            }
            map.put(current,index++);
            current = current.next;

        }
      //  System.out.println(map);
    return head.val;
    }

}
/*
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.
 */