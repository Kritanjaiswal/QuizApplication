package MultiThreading;
class Prevention2 implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread());
            try{
               Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class ThreadJoin {
    public static void main(String args[]) throws InterruptedException{
        Thread t=new Thread(new Prevention());
        t.start();
        t.join();
//        for(int i=0; i<5; i++){
//            System.out.println(Thread.currentThread());
//            try{
//                Thread.sleep(2000);
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        }
        System.out.println("Hello Everyone");
    }
}
