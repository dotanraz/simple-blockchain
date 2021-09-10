package blockchain;

import java.util.LinkedList;
import java.util.List;

public class Chain {

    List<Block> blocks = new LinkedList<>();

    public Chain() {
        GenesisBlock genesis = new GenesisBlock();
        this.blocks.add(genesis);
    }

    public void addBlock(Block block) {
        this.blocks.add(block);
    }

    public Block getLastBlock() {
        return this.blocks.get(blocks.size() -1);
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public String getChainAsString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.blocks.forEach(block -> {
            stringBuilder.append(block.getBlockDataAsString());
            stringBuilder.append("\n--------\n");
        });
        return stringBuilder.toString();
    }
}
