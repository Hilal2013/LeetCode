package dsaReview.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    Node root;

    public Tree() {
    }

    public static Node insert(Node root, int val) {
        //if tree is empty
        Node node = new Node(val);
        if (root == null) {
            root = node;
            return root;
        }
        ////if tree is not empty//find a place to insert//child needs to be null
        Node current = root;
        while (true) {
            if (val < current.value) {
                //if left null insert there
                if (current.left == null) {
                    current.left = node;
                    break;
                }//left not null branch left subtree
                current = current.left;
            } else {
                //if right null insert there
                if (current.right == null) {
                    current.right = node;
                    break;
                }//right not null branch right subtree!!
                current = current.right;

            }
        }
        return root;
    }

    public static void printLeaves(Node root) {
//preorder
        if (root == null) return;//termination
        System.out.print(root.value + ", "); //visit root
        printLeaves(root.left);//visit left subtree
        printLeaves(root.right);//visit right subtree

//post order
//        if (root == null) return;
//        printLeaves(root.left);
//        printLeaves(root.right);
//        if (isLeaf(root))  System.out.print(root.value + ", ");
    }
    public static boolean hasPath(Node root, int val,List<Integer> list) {
// if root is null // there is no path
        if (root == null)
            return false;
        list.add(root.value);
        if (root.value == val){
            return true;}
        //check left subtree or right subtree recursively
        if (hasPath(root.left, val, list) ||
                hasPath(root.right, val, list)) return true;
        // If not found in the current left and right subtree, remove the current node from list
        list.remove(list.size() - 1);
        return false;

    }
    public static List<Integer> findPath(Node root, int val) {

        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        if (hasPath(root,val,list)) return list;
// If  not found, return an empty list.
        return new ArrayList<>();

    }
    public static void findPath1(Node root, Integer value) {
        List<Integer> list = new ArrayList<>();
        if (root==null)
            return;
        if (root.value > value) {
            list.add(root.value);
            findPath(root.left, value);
        } else if (root.value < value) {
            list.add(root.value);
            findPath(root.right, value);
        } else {
            list.add(root.value);
        }
        if (!list.contains(value))
            list.clear();
    }



    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(5);
        root.left.left = new Node(0);
        root.left.right = new Node(2);
        root.right.left = new Node(4);
        root.right.right = new Node(6);

        printLeaves(root);//3, 1, 0, 2, 5, 4, 6,

        System.out.println(insert(root, 8));
        printLeaves(root);//3, 1, 0, 2, 5, 4, 8
        System.out.println(insert(root, 7));
        printLeaves(root);//3, 1, 0, 2, 5, 4, 8, 7
        System.out.println();
        System.out.println(findPath(root,4));//[3, 5, 4]
        System.out.println(findPath(root,7));//[3, 5, 6, 8, 7]
        findPath1(root,7);//[3, 5, 6, 8, 7]
    }

}
// int targetValue = 4;
//        List<Integer> path = findPath(root, targetValue);
//
//        if (!path.isEmpty()) {
//            System.out.println("Path to " + targetValue + ": " + path);
//        } else {
//            System.out.println(targetValue + " not found in the tree.");
//        }