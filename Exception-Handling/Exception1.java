public class Exception1{
    public static void main(String args[]){
        int arr[]=new int[5];
        int res=-1;
        for(int i=0; i<arr.length; i++) arr[i]=i;
        try{
            res=arr[0]/0;
        }catch(ArithmeticException e){
            res=100;
        }
        System.out.println(res);
    }
}
