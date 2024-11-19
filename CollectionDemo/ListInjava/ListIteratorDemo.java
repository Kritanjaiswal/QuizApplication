package CollectionDemo.ListInjava;
import java.util.*;
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        ListIterator<Integer> litr=lst.listIterator();
        int count=0;
        while(litr.hasNext()){
            Integer data=litr.next();
            System.out.println(data);
            count++;
            if(count==2){
                System.out.println("Mai aa gya");
                while(litr.hasPrevious()){
                    System.out.println(litr.previous());
                }
            }
        }
    }
}
