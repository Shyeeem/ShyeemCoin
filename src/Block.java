import java.util.Date;

public class Block {

    ///VARIABLES

    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;

    //CONSTRUCTOR
    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();

    }

    public String calculateHash(){
        String calculatedhash = StringUtil.applySha256(
                previousHash + Long.toString(timeStamp)
                + data);
        return calculatedhash;
    }


}
