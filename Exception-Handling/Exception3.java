public class Exception3 {
    public static void main(String args[]){
        int arr[]=new int[5];
        try{
            int res=10/6;
            System.out.println(arr[4]);
            throw new Exception("Technical error"); // throw is same as error/ Exception that we are throwing with our custom message rather than JVM
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
// we use multiple for better/good practice
