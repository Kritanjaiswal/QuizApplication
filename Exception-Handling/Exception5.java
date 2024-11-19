public class Exception5 {
    public static void m1(){
        int arr[]=new int[5];
        try{
            System.out.println(arr[4]);
            System.exit(0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally{  // finally block is used to write the cleanup code
            System.out.println("I will run always");
        }
    }
    public static void main(String args[]){
        m1();
    }
}
//finalize keyword is used for garbage collector
