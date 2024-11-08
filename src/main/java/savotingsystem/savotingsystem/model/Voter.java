package savotingsystem.savotingsystem.model;

public class Voter {

    private int voterId; // voterid: Integer
    private int userId; // userid: Integer
    private String idCopyFileReference; // idcopyfilereference: Varchar(100)
    private String addressLine1; // addressline1: Varchar(100)
    private String addressLine2; // addressline2: Varchar(100)
    private String addressLine3; // addressline3: Varchar(100)
    private String postalCode; // postalcode: Varchar(10)
    private String verificationStatus; // verificationstatus: Varchar(50)

    // Default constructor
    public Voter() {
    }

    // Parameterized constructor
    public Voter(int voterId, int userId, String idCopyFileReference,
            String addressLine1, String addressLine2, String addressLine3,
            String postalCode, String verificationStatus) {
        this.voterId = voterId;
        this.userId = userId;
        this.idCopyFileReference = idCopyFileReference;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.postalCode = postalCode;
        this.verificationStatus = verificationStatus;
    }

    // Getter and Setter for voterId
    public int getVoterId() {
        return voterId;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    // Getter and Setter for userId
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter and Setter for idCopyFileReference
    public String getIdCopyFileReference() {
        return idCopyFileReference;
    }

    public void setIdCopyFileReference(String idCopyFileReference) {
        this.idCopyFileReference = idCopyFileReference;
    }

    // Getter and Setter for addressLine1
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    // Getter and Setter for addressLine2
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    // Getter and Setter for addressLine3
    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    // Getter and Setter for postalCode
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    // Getter and Setter for verificationStatus
    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    // Override toString() for better object representation
    @Override
    public String toString() {
        return "Voter{" +
                "voterId=" + voterId +
                ", userId=" + userId +
                ", idCopyFileReference='" + idCopyFileReference + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", addressLine3='" + addressLine3 + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", verificationStatus='" + verificationStatus + '\'' +
                '}';
    }

}
