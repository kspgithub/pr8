import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> queue;

    public WaitList() {
        queue = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> c) {
        queue = new ConcurrentLinkedQueue<>(c);
    }

    @Override
    public void add(E obj) {
        queue.add(obj);
    }

    @Override
    public E remove() {
        return queue.remove();
    }

    @Override
    public boolean contains(E obj) {
        return queue.contains(obj);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return queue.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return queue.toString();

    }
}