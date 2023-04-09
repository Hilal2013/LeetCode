package easy.linkedlist;

public class Node {
    Node next;
    int key;
    int value;
int data;

    public Node(int data) {
        this.data = data;
    }

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
