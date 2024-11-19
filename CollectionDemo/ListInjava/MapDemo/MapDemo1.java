package CollectionDemo.ListInjava.MapDemo;
import java.util.*;
public class MapDemo1 {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);
        vector.addElement(40);
//        vector.addElement("Kritan");
        System.out.println(vector);
        Enumeration<Integer> e=vector.elements();  // elements() method return Enumeration object on vector and Enumeration is an iterator used to traverse over legacy class(i.e., old classes)
        while(e.hasMoreElements()){  //hasMoreElements() is used to check the presence of elements or not
            Integer data=e.nextElement(); // nextElement() method is used to bring the elements in the vector
            System.out.println(data);
        }
    }
}
