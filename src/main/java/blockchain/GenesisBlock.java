package blockchain;

public class GenesisBlock extends Block {

    public GenesisBlock() {
        super("d974581a-e51c-48f6-a5ae-c438ead53d22",
                "b4419cf9-b230-4cb0-9e49-60b7ea80b8b0",
                "1",
                "17f09479f431942aafb55ebfddfa0ffd86948e86");
    }

    public Block getGenesisBlock() {
        return this;
    }
}
