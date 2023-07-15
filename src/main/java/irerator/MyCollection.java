package irerator;

import java.util.Iterator;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class MyCollection implements Iterator<Integer> {

    private int[] source;
    private int currentIndex = 0;

    public MyCollection(int capacity) {
        this.source = new int[capacity];
    }

    void add(int indexToSet, int value) {
        source[indexToSet] = value;
    }

    @Override
    public boolean hasNext() {
        return (source.length - 1) > currentIndex;
    }

    @Override
    public Integer next() {
        currentIndex++;
        return source[currentIndex];
    }
}
