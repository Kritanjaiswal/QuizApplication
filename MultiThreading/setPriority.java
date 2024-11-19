package MultiThreading;
class neThread extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread());
        }

    }
}
public class setPriority {
    public static void main(String args[]){
        Thread t1=new Thread(new neThread(), "firstThread");
        Thread t2=new Thread(new neThread(), "secondThread");
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread());
        }
    }
}
