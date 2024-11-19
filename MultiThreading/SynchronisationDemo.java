package MultiThreading;
class BankAcc{
    int money;
    BankAcc(int money){
        this.money=money;
    }
    public void withDrawMoney(int amt){
        money-=amt;
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
    public int getMoney(){
        return money;
    }
}
class BankThread implements Runnable{
    int amt;
    BankAcc ba;
    BankThread(BankAcc ba, int amt){
        this.ba=ba;
        this.amt=amt;
    }
    public void run(){
        for(int i=0; i<5; i++){
            ba.withDrawMoney(amt);
        }
    }
}
public class SynchronisationDemo {
    public static void main(String args[]) throws InterruptedException {
        BankAcc ba=new BankAcc(10000);
        Thread t1=new Thread(new BankThread(ba, 20));
        Thread t2=new Thread(new BankThread(ba, 20));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(ba.getMoney());
    }
}

