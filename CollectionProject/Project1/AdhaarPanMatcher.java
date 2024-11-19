package CollectionProject.Project1;
import java.util.*;
public class AdhaarPanMatcher {
    public static void main(String[] args) throws Exception {
        AdhaarService as=new AdhaarService();
        PanService ps=new PanService();
        Scanner sc=new Scanner(System.in);
        String num1=sc.nextLine();
//        System.out.println(as.adhaarByAdhaarNo(num1));
        System.out.println(ps.getPanByAdhaarNo(num1));
    }
}
