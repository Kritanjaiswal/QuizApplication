package MultiThreading;
import java.util.*;
class MyThread2 implements Runnable{
    Bank b;
    int amt;
    public MyThread2(Bank b, int amt){
        this.b=b;
        this.amt=amt;
    }
    public void run(){
        for(int i=0; i<5; i++){
            b.withdraw(amt);
        }

    }
}
class Bank{
    int total;
    public Bank(int total){
        this.total=total;
    }
    public void withdraw(int amt){
        synchronized(this){
            total-=amt;
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public int remain(){
        return total;
    }
}
public class SynchronisationDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Bank b=new Bank(10000);
        Thread t1=new Thread(new MyThread2(b, 20));
        Thread t2=new Thread(new MyThread2(b, 20));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(b.remain());
    }
}
