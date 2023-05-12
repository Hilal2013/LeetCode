package easy.hashing;

public class Bucket {
    Node head;
  //  int size;

    public int get(int key) {
        if(head == null) return -1;

        Node current = head;
        while (current != null) {
            if (current.key == key) return current.value;
            current = current.next;
        }
return-1;
    }
    public void update(int key,int value){
        boolean found = false;
        Node node = new Node(key,value);
        if(head == null){
            head = new Node(key, value);
            return;
        }
        Node current = head;
        while (current != null) {
            if (node.key ==current.key){
                current.value=node.value;
                found=true;
            }
            if(!found){
                current.next=new Node(key, value);
            }
            current=current.next;

        }

    }
    public void remove(int key) {
        if(head == null) return;

        Node prev = head;
        Node current = head;
        while (current != null) {
            if (current.key == key) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                    break;
                }
                else {
                    prev.next = current.next;
                    current.next = null;
                    break;
                }

            }

            prev = current;
            current = current.next;

        }


    }

}
