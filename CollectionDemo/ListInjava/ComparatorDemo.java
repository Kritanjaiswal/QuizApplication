package CollectionDemo.ListInjava;
import java.util.*;
class userComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Integer data1=(Integer) o1;
        Integer data2=(Integer) o2;
        if(data1>data2) return -1;
        else if(data1<data2) return +1;
        else return 0;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        Set<Integer> ts=new TreeSet<>(new userComparator());
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(20);
        ts.add(50);
        ts.add(70);
        System.out.println(ts);
    }
}
