import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class throwException{
    void m1() throws Exception{
        m2();  // yaha bhi ham handle nahi kar rahe hai to ham deligate kar denge usko jo is function ko call karega by using throws Exception
    }
    void m2() throws Exception{
        BufferedReader reader =new BufferedReader(new FileReader("D/:"));  // checked Exception jisko ham handle nahi kar rahe hai mtlb wo handle karega jo is method ko call karega islie to throws Exception laga rakha hai i.e., jo call karega wo handle karega
    }
}
public class Exception4 {
    public static void main(String args[]) throws Exception{
        throwException te=new throwException();
        te.m1(); // here I also not handle Exception so I deligate it to JVM that make Exception new object to throw it
    }
}
