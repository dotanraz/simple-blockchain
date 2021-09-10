import blockchain.Block;
import blockchain.BlockchainUtils;
import blockchain.Chain;
import java.util.Random;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Chain chain = new Chain();

        for (int i = 0; i < 10; i++) {
            chain.addBlock(new Block(
                    UUID.randomUUID().toString(),
                    UUID.randomUUID().toString(),
                    String.valueOf(random.nextInt(9) + 1),
                    BlockchainUtils.stringToSha1(chain.getLastBlock().getBlockDataAsString())));
        }

        System.out.println(chain.getChainAsString());

    }

}
