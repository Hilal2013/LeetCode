package easy;

public class MyHashMapApp {
    public static void main(String[] args) {

        MyHashMap obj = new MyHashMap();
        obj.put(1, 1);
        obj.put(2, 3);
        obj.put(2, 4);

        obj.printNodes();//{1=1, 2=4}
        System.out.println(obj.get(1));//1
        System.out.println(obj.get(2));//1
        System.out.println(obj.get(3));//-1
        obj.put(3, 7);
        obj.put(10, 5);
        obj.put(10,3);
        obj.printNodes();//{1=1, 2=4, 3=7, 10=3}
        obj.remove(1);
        obj.printNodes();//{2=4, 3=7, 10=3}
        obj.remove(3);
        obj.printNodes();//{2=4, 10=3}
        obj.remove(10);
        obj.printNodes();//{2=4, 10=3}???



    }
}
