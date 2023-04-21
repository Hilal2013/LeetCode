package easy.linkedlist;

class ListNode {
    int val;
    ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public ListNode removeElementsWithTwoPointers(ListNode head, int val) {
           if (head==null&&val==1){
           return null;
       }
       ListNode slow = head;
ListNode fast = head.next;

        while (fast != null) {
            if (fast.val == val) {
slow.next=fast.next;
fast=slow.next;
            }else{
                slow=slow.next;
                fast=fast.next;
            }
            }

       if(head.val==val) {
           head=head.next;
       }

return head;
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head==null){
            return null;
        }
        ListNode current = head;


        while (current.next != null) {
            if (current.next.val == val) {
                current.next=current.next.next;

            }else{
                current=current.next;

            }
        }
        if(head.val==val) {
            head=head.next;
        }
//   return head.val==val?head.next:head;
        return head;

    }


}