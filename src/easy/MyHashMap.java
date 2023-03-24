package easy;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    Node head;
    Node tail;
    int size;

    public void put(int key, int value) {
        Node node = new Node(key, value);
        Node current = head;
        if (head == null) {
            head = tail = node;
        }
        if (current != null) {
            if (current.key == node.key) {
                current.value = node.value;
                tail.next = node;
                tail = node;
                size++;
            } else {
                tail.next = node;
                tail = node;
                size++;
            }
        }

    }

    void printNodes() {
        Node current = head;
        Map<Integer, Integer> map = new HashMap<>();

        while (current != null) {
            map.put(current.key, current.value);

            current = current.next;
        }
        System.out.println(map);
    }

    public int get(int key) {
        Node current = head;
        while (current != null) {
            if (current.key == key) {
                return 1;
            }
            current = current.next;
        }

        return -1;
    }

    public void remove(int key) {
        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.key == key) {

                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }

    }

}


/*
Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:

MyHashMap() initializes the object with an empty map.
void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.


Example 1:

Input
["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
Output
[null, null, null, 1, -1, null, 1, null, -1]

Explanation
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // The map is now [[1,1]]
myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
 */