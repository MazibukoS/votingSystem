package savotingsystem.savotingsystem.model;

public class Vote {

    private int voteId; // voteid: Integer, NOT NULL
    private String blockchainId; // blockchainid: Varchar(500)
    private String hash; // hash: Varchar(500)
    private String previousHash; // previoushash: Varchar(500)
    private long voteTimestamp; // votetimestamp: BigInt (mapped to long)
    private int nonce; // nonce: Integer
    private int difficulty; // difficulty: Integer

    // Default constructor
    public Vote() {
    }

    // Parameterized constructor
    public Vote(int voteId, String blockchainId, String hash, String previousHash,
            long voteTimestamp, int nonce, int difficulty) {
        this.voteId = voteId;
        this.blockchainId = blockchainId;
        this.hash = hash;
        this.previousHash = previousHash;
        this.voteTimestamp = voteTimestamp;
        this.nonce = nonce;
        this.difficulty = difficulty;
    }

    // Getter and Setter for voteId
    public int getVoteId() {
        return voteId;
    }

    public void setVoteId(int voteId) {
        this.voteId = voteId;
    }

    // Getter and Setter for blockchainId
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    // Getter and Setter for hash
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    // Getter and Setter for previousHash
    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    // Getter and Setter for voteTimestamp
    public long getVoteTimestamp() {
        return voteTimestamp;
    }

    public void setVoteTimestamp(long voteTimestamp) {
        this.voteTimestamp = voteTimestamp;
    }

    // Getter and Setter for nonce
    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    // Getter and Setter for difficulty
    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    // Override toString() for better object representation
    @Override
    public String toString() {
        return "Vote{" +
                "voteId=" + voteId +
                ", blockchainId='" + blockchainId + '\'' +
                ", hash='" + hash + '\'' +
                ", previousHash='" + previousHash + '\'' +
                ", voteTimestamp=" + voteTimestamp +
                ", nonce=" + nonce +
                ", difficulty=" + difficulty +
                '}';
    }

}
