public class singletonObject {
    private static singletonObject INSTANCE=new singletonObject();
    private singletonObject(){

    }
    public static singletonObject getInstance(){
        return INSTANCE;
    }
}
