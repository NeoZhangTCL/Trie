import java.util.Iterator;

public class TrieTree implements Trie{

    private TrieNode root;

    public TrieTree() {
        this.root = new TrieNode();
    }

    @Override
    public void insert(String word) {

    }

    @Override
    public boolean exist(String word) {
        return false;
    }

    @Override
    public boolean startWith(String word) {
        return false;
    }

    @Override
    public Iterator<String> iterator(String prefix) {
        return null;
    }
}
