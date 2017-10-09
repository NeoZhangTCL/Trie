import java.util.Iterator;

public interface Trie {

    public void insert(String word);

    public boolean exist(String word);

    public boolean startWith(String prefix);

    public Iterator<String> iterator(String prefix);

}
