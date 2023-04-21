package easy.linkedlist;

public class PalindromeLinkedList {



    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null){
            return true;
        }
//find middle point
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
//reverse 2nd half of linkedlist
        ListNode prev = null;
        ListNode current = slow;
        ListNode nextNode;
        while(current!=null){
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        //palindrome check first half and second half
        ListNode right = prev;//head of the 2nd half
        ListNode left = head;
        // check right & left (compare)
        while(right !=null){
            if(right.val != left.val){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

    }
    public boolean isPalindromeWithString(ListNode head) {//runtime 17ms memory 53.4
        StringBuilder strBuilder = new StringBuilder();
        ListNode current = head;
        while (current != null) {
            strBuilder.append(current.val);
            current = current.next;

        }
        int left = 0;
        int right = strBuilder.length() - 1;
        while (left <= right) {
            if (strBuilder.charAt(left) != strBuilder.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
