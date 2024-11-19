package CollectionProject.Project1;
import java.util.*;
public class AdhaarCard {
    private String adhaarNo;
    private String Name;
    private String FatherName;
    private String address;


    public AdhaarCard(String adhaarNo, String name, String fatherName, String address) {
        this.adhaarNo = adhaarNo;
        Name = name;
        FatherName = fatherName;
        this.address = address;
    }

    public String getAdhaarNo() {
        return adhaarNo;
    }

    public void setAdhaarNo(String adhaarNo) {
        this.adhaarNo = adhaarNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AdhaarCard{" +
                "adhaarNo='" + adhaarNo + '\'' +
                ", Name='" + Name + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
