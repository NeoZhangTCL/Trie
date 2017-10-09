import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    Map<Character, TrieNode> nextMap;
    boolean wordEnds;

    public TrieNode() {
        this.nextMap = new HashMap<>();
        this.wordEnds = false;
    }

    public TrieNode(boolean end) {
        this.nextMap = new HashMap<>();
        this.wordEnds = end;
    }

}
