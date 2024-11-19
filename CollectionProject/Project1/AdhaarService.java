package CollectionProject.Project1;
import java.util.*;
public class AdhaarService {
    Map<String, AdhaarCard> AdhaarMap=new HashMap<>();;
    public AdhaarService(){
        AdhaarMap.put("12309845687", new AdhaarCard("12309845687", "Kritan", "Mr Sanjay Jaiswal", "Gorakhpur"));
        AdhaarMap.put("12309845689", new AdhaarCard("12309845689", "Rohit", "Mr Sanjay Jaiswal", "Gorakhpur"));
    }
    public AdhaarCard adhaarByAdhaarNo(String num) throws Exception{
        if(AdhaarMap.containsKey(num)){
            return AdhaarMap.get(num);
        }else throw new Exception("Corresponding Aadhaar not found");
    }
}
