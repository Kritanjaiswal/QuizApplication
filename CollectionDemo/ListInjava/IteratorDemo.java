package CollectionDemo.ListInjava;
import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<Integer>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        Iterator<Integer> itr=lst.iterator();  //we can use iterator on any collection class to traverse over it
        while(itr.hasNext()){
            Integer data=itr.next();
            System.out.println(data);
            if(data==30){
                itr.remove();
            }
        }System.out.println(lst);
    }
}
