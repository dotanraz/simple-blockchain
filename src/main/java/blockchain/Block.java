package blockchain;

public class Block {

    private String senderAddress;
    private String receiverAddress;
    private String amount;
    private long transactionTime;
    private String previousBlockHash;

    public Block(String senderAddress, String receiverAddress, String amount, String previousBlockHash) {
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.amount = amount;
        this.previousBlockHash = previousBlockHash;
        this.transactionTime = System.currentTimeMillis();
    }

    public String getBlockDataAsString() {
        return senderAddress + "\n" + receiverAddress + "\n" + amount + "\n" + transactionTime + "\n" + previousBlockHash;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public long getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(long transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(String previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }
}
