package MultiThreading;
class Prevention implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread());
        }
    }
}
public class ThreadYield {
    public static void main(String args[]){
        Thread t=new Thread(new Prevention());
        t.start();
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread());
            Thread.yield();
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
