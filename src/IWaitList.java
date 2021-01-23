import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.Collection;
public interface IWaitList<E> {
    void add(E obj);

    E remove();

    boolean contains(E obj);

    boolean containsAll(Collection<E> c);

    boolean isEmpty();
}
