package CollectionDemo.ListInjava;
import java.util.*;
public class ListDemo2 {
    public static void main(String[] args) throws Exception{
        List<Integer> lst=new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(10);
        System.out.println(lst.get(3));
        for(int elem:lst){
            System.out.println(elem);
        }
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        if(idx>=0 && idx<lst.size()){
            lst.remove(idx);
            System.out.println(lst);
        }else{
            throw new Exception("error");
        }
        System.out.println(lst.contains(40));
        System.out.println(lst.indexOf(20));
    }
}
