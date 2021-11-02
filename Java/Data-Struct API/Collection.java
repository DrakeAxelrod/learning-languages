
import java.lang.Iterable;

interface Collection<Item> extends Iterable<Item> {

    boolean isEmpty();

    int size();

    // from Iterable: iterator()
}

