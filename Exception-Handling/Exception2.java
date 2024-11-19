public class Exception2 {
    public static void main(String args[]) throws Exception{
        int arr[]=new int[5];
        int res=-1;
        for(int i=0; i<arr.length; i++) arr[i]=i;
        try{
            res=arr[0]/0;
        }catch(ArithmeticException e){
            res=100;
            // throw new ArithmeticException("My name is Kritan Jaiswal");   it will not give any error if you don't give any throws keyword because you already defined in catch block
            throw new Exception("My name is Kritan Jaiswal"); // without throws it will give error
        }
        System.out.println(res);
    }
}
