public class Main {
    public static void main(String[] args) {
        singletonObject obj1=singletonObject.getInstance();
        singletonObject obj2=singletonObject.getInstance();
        singletonObject obj3=singletonObject.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}