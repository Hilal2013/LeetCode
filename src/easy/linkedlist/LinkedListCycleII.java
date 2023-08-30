package easy.linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

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
      // node1.printNodes(node1);
     //   System.out.println(detectCycle(node1));
       System.out.println(detectCycle3(node1));
    }
    public static boolean detectCycle3(ListNode head){
        Set<ListNode> visited=new HashSet<>();

        ListNode current=head;
        while(current!=null){
            if(visited.contains(current)){
                return true;
            }
            visited.add(current);
            current=current.next;
        }
        return false;

    }
    public static ListNode detectCycle(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;//slow move go one step
            fast=fast.next.next;//fast will move two steps
            //If there is no cycle, we will reach end of the list
          //  If there is cycle, they will meet each othe
            if(slow==fast) {//when they met
                slow=head; // Im gonna bring slow to the beginning

                while (slow != fast) {//they will go one by one step now
                    slow = slow.next;
                    fast = fast.next;
                }
                System.out.println(slow.val);
                return slow;//if they meet again that is the point where cycle starts return node
            }

        }

return null;

    }

    public static ListNode detectCycle1(ListNode head) {

        Set<ListNode> visited = new HashSet<>();
        //set current to head
        ListNode current = head;
        while (current != null) {
            if (visited.contains(current)){
                return current;}
            visited.add(current);
            current = current.next;
        }
        return null;
    }
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        //set current to head
        ListNode current = head;
        while (current != null) {
            if (visited.contains(current))
                return true;
            visited.add(current);
            current = current.next;
        }
        return false;
    }


}
/*
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

Given the head of a linked list, return the node where the cycle begins. If there is no cycle,
return null.There is a cycle in a linked list if there is some node in the list that can be reached again
by continuously following the next pointer. Internally, pos is used to denote the index of the node
that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not
passed as a parameter.
Do not modify the linked list.!!!!!!!
Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
Example 2:
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
Example 3:
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
Constraints:
• The number of the nodes in the list is in the range [0, 104
].
• -105 <= Node.val <= 105
• pos is -1 or a valid index in the linked-list.
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
 */


