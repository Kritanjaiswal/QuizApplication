package CollectionProject.Project1;

public class PanCard {
    private String panNo;
    private String adhaar;
    private String BankDetails;
    private String Transaction;

    public PanCard(String panNo, String adhaar, String bankDetails, String transaction) {
        this.panNo = panNo;
        this.adhaar = adhaar;
        BankDetails = bankDetails;
        Transaction = transaction;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getAdhaar() {
        return adhaar;
    }

    public void setAdhaar(String adhaar) {
        this.adhaar = adhaar;
    }

    public String getBankDetails() {
        return BankDetails;
    }

    public void setBankDetails(String bankDetails) {
        BankDetails = bankDetails;
    }

    public String getTransaction() {
        return Transaction;
    }

    public void setTransaction(String transaction) {
        Transaction = transaction;
    }

    @Override
    public String toString() {
        return "PanCard{" +
                "panNo='" + panNo + '\'' +
                ", adhaar='" + adhaar + '\'' +
                ", BankDetails='" + BankDetails + '\'' +
                ", Transaction='" + Transaction + '\'' +
                '}';
    }
}
