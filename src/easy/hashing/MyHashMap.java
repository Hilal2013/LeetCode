package easy.hashing;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    public int modNumber;
    public List<Bucket> hashMap;

    public MyHashMap() {
        this.modNumber = 2341;
            this.hashMap = new ArrayList<>();
            for (int i = 0; i <2341; i++) {
                this.hashMap.add(new Bucket());
        }
    }

    public int get(int key) {
        int hashCode = key % this.modNumber;
        return   this.hashMap.get(hashCode).get(key);
    }
    public void put(int key, int value) {
        int hashCode = key % this.modNumber;
        this.hashMap.get(hashCode).update(key, value);
    }
    public void remove(int key) {
        int hashCode = key % this.modNumber;
        this.hashMap.get(hashCode).remove(key);
    }
}
