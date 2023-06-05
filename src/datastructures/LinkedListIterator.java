package datastructures;

import java.util.Iterator;

public class LinkedListIterator implements Iterator<String> {

    private final IList list;

    public LinkedListIterator(IList list) {
        this.list = list;
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }
}
