package code510;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo1 {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>();
        collection.add(10);
        collection.add(20);
        collection.add(44);
        collection.add(55);
        collection.add(7);
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        System.out.println(collection.contains(70));
        collection.remove(20);
        System.out.println(collection);
        collection.clear();


    }
}
