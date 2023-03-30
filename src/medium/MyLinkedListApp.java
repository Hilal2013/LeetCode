package medium;

public class MyLinkedListApp {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        for (int i = 1; i < 13; i++) {
            myList.addNodes(new ListNode(i));//1 => 2 => 3 => 4 => 5 => 6 => 7 => 8 => 9 => 10 => 11 => 12 => null
        }
        myList.printMyList();
        myList.deleteNNodesAfterMNodes(3, 2);
        myList.printMyList();//1 => 2 => 6 => 7 => 11 => 12 => null
myList.remove(1);
myList.printMyList();
myList.deleteNode(new ListNode(11));
        myList.printMyList();


    }

    }
