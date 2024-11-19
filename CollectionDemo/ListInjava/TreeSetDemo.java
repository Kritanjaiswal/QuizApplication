package CollectionDemo.ListInjava;
import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> s=new TreeSet<>();
        s.add(null); // exception b/c not allowed
        s.add(10);
        s.add(90);
        s.add(50);
        s.add(60);
        s.add(30);
        s.add(20);
        System.out.println(s);
        Iterator<Integer> itr=s.iterator();
        while(itr.hasNext()){
            Integer data=itr.next();
            System.out.println(data);
            if(data==90) itr.remove();
        }
        System.out.println(s);
    }
}
