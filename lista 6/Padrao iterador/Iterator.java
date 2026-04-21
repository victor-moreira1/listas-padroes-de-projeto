import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

interface Iterator<T> {
    boolean hasNext();
    T next();
}