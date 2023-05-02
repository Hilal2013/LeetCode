package easy.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class IntersectionTwoLinkedList {


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode currentA = headA;
        ListNode currentB = headB;
        int aLength = 0;
        int bLength = 0;
        while (currentA != null) {
            currentA = currentA.next;//4,1,8,4,5
            aLength++;//5
        }
        while (currentB != null) {
            currentB = currentB.next;//5,6,1,8,4,5
            bLength++;//6
        }
//if there is intersection
        //return head
        currentA=headA;
        currentB=headB;

        int difference;
        if(bLength>aLength){
            difference=bLength-aLength;//1
            for (int i = 0; i <difference; i++) {
                currentB=currentB.next;//to bring same point
            }
           while(currentA != null&&currentB != null){
               if(currentA==currentB){
                   return currentA;
               }
               currentA=currentA.next;
               currentB=currentB.next;
           }
        }else if(bLength<aLength){
            difference=aLength-bLength;
            for (int i = 0; i <difference ; i++) {
                currentA=currentA.next;
            }
            while(currentA != null&&currentB != null){
                if(currentA==currentB){
                    return currentA;

                }
                currentA=currentA.next;
                currentB=currentB.next;
            }
        }else{//length equals
            while(currentA != null&&currentB != null){
                if(currentA==currentB){
                    return currentA;
                }
                currentA=currentA.next;
                currentB=currentB.next;
            }
        }
        return null;
    }

}
/*
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
For example, the following two linked lists begin to intersect at node c1:

The test cases are generated such that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

Custom Judge:

The inputs to the judge are given as follows (your program is not given these inputs):

intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
listA - The first linked list.
listB - The second linked list.
skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.




 */