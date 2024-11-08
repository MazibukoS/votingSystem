package savotingsystem.savotingsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ballot")
public class Ballot {

    @Id
    private int ballotID;
    private int partyID;
    private String ballotType;

    // Default constructor
    public Ballot() {
    }

    // Parameterized constructor
    public Ballot(int ballotID, int partyID, String ballotType) {
        this.ballotID = ballotID;
        this.partyID = partyID;
        this.ballotType = ballotType;
    }

    // Getter and Setter for partyId
    public int getballotID() {
        return ballotID;
    }

    public void setballotID(int ballotID) {
        this.ballotID = ballotID;
    }

    // Getter and Setter for partyName
    public int getpartyID() {
        return partyID;
    }

    public void setPartyName(int partyID) {
        this.partyID = partyID;
    }

    // Getter and Setter for partyLogo
    public String getballotType() {
        return ballotType;
    }

    public void setballotType(String ballotType) {
        this.ballotType = ballotType;
    }

    // Override toString() method for easy representation of the object
    @Override
    public String toString() {
        return "Ballot{" +
                "ballotID=" + ballotID +
                ", partyID='" + partyID + '\'' +
                ", ballotType='" + ballotType + '\'' +
                '}';
    }

}
