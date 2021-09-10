package blockchain;

import org.apache.commons.codec.digest.DigestUtils;

public class BlockchainUtils {

    public static String stringToSha1(String string) {
        return DigestUtils.sha1Hex(string);
    }
}
