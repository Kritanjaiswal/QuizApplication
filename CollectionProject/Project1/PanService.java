package CollectionProject.Project1;
import java.util.*;
public class PanService {
    Map<String, PanCard> PanMap=new HashMap<>();
    public PanService(){
        PanMap.put("ABCD1IJFG", new PanCard("ABCD1IJFG", "12309845687", "CENTRAL BANK", "DELHI"));
        PanMap.put("EFGH3ZYXW", new PanCard("EFGH3ZYXW", "12309845689", "BOB", "Gorakhpur"));
    }
    public PanCard getPanByAdhaarNo(String num) throws Exception{
        for(PanCard pan:PanMap.values()){
            if(pan.getAdhaar().equals(num)) return pan;
        }
        throw new Exception("Aadhar and pan are not Linked");
    }
}
