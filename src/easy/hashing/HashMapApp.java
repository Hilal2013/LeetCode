package easy.hashing;

public class HashMapApp {
    public static void main(String[] args) {
        MyHashMap hm = new MyHashMap();
        hm.put(1,35);
        hm.put(3,40);
        System.out.println(hm.get(1));//35
        //hm.put(1,24);
        System.out.println(hm.get(1));//24
//hm.remove(1);
      //  System.out.println(hm.get(1));//-1
        hm.put(2340,2342);
        System.out.println(hm.get(2340)); //it gives 2342

        hm.put(2341,10);
        System.out.println(hm.get(2341)); //it gives 10
        hm.put(2342,15);
        System.out.println(hm.get(2342));//-1??
        hm.put(2343,15);
        System.out.println(hm.get(2343));//15
        hm.put(2,30);
        System.out.println(hm.get(2));//-1

    }
}