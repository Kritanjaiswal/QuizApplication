package Oops;

class Demo1{
    static void m1(){
        System.out.println("Hello");
    }
    void m2(){

    }
}
class Demo2 extends Demo1{
    static void m1(){  // if we extend a class and trying to override the static method then it will give you an error and here whatever we write is "Method hiding"
        System.out.println("Hello Kritan");
    }
     //private void m2(){} //we cannot override a high access specifier method with low access specifier but we can do it with default, protected and public as well.
    // @Override
    // protected void m2(){  this is possible
    // }
    public void m2(){  //this is possible

    }
}
public class overrideTest {
    public static void main(String args[]){
        System.out.println("Hello");
    }
}
