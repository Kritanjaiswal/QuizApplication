package CollectionDemo.ListInjava;
import java.util.*;
public class SetDemo1 {
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(10);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        Object[] arr =hs.toArray();
        for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
        Set<Integer> hs2=new HashSet<>();
        hs2.add(10);
        hs2.add(20);
        hs2.add(30);
        hs2.add(40);
        hs2.add(10);
        System.out.println(hs.equals(hs2));
    }
}
