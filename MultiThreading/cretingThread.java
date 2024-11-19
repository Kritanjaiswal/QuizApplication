package MultiThreading;
class MyThread extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("child thread");
        }
    }
} 
public class cretingThread {
    public static void main(String args[]){
        Thread t=new Thread();
        t.start();
        for(int i=0; i<5; i++){
            System.out.println("main Thread");
        }
    }
}
