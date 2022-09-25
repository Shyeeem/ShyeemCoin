import java.util.ArrayList;
import com.Google.gson.GsonBuilder;

public class ShyeemChain {

    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args) {

        blockchain.add(new Block("I am the first block!", "O"));
        blockchain.add(new Block("I am the second block!", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("I am the third block!", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("I am the fourth block!", blockchain.get(blockchain.size()-1).hash));

        String blockchainJson = new GsonBuilder()

    }
}
