package savotingsystem.savotingsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "party")
public class Party {

    @Id
    private int partyId;
    private String partyName;
    private String partyLogo;
    private String partyLeaderFullName;
    private String partyLeaderPhoneNumber;

    // Default constructor
    public Party() {
    }

    // Parameterized constructor
    public Party(int partyId, String partyName, String partyLogo, String partyLeaderFullName,
            String partyLeaderPhoneNumber) {
        this.partyId = partyId;
        this.partyName = partyName;
        this.partyLogo = partyLogo;
        this.partyLeaderFullName = partyLeaderFullName;
        this.partyLeaderPhoneNumber = partyLeaderPhoneNumber;
    }

    // Getter and Setter for partyId
    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    // Getter and Setter for partyName
    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    // Getter and Setter for partyLogo
    public String getPartyLogo() {
        return partyLogo;
    }

    public void setPartyLogo(String partyLogo) {
        this.partyLogo = partyLogo;
    }

    // Getter and Setter for partyLeaderFullName
    public String getPartyLeaderFullName() {
        return partyLeaderFullName;
    }

    public void setPartyLeaderFullName(String partyLeaderFullName) {
        this.partyLeaderFullName = partyLeaderFullName;
    }

    // Getter and Setter for partyLeaderPhoneNumber
    public String getPartyLeaderPhoneNumber() {
        return partyLeaderPhoneNumber;
    }

    public void setPartyLeaderPhoneNumber(String partyLeaderPhoneNumber) {
        this.partyLeaderPhoneNumber = partyLeaderPhoneNumber;
    }

    // Override toString() method for easy representation of the object
    @Override
    public String toString() {
        return "Party{" +
                "partyId=" + partyId +
                ", partyName='" + partyName + '\'' +
                ", partyLogo='" + partyLogo + '\'' +
                ", partyLeaderFullName='" + partyLeaderFullName + '\'' +
                ", partyLeaderPhoneNumber='" + partyLeaderPhoneNumber + '\'' +
                '}';
    }

    // You can add hashCode() and equals() methods if needed for collection
    // operations
}
