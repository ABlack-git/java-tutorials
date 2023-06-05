package datastructures;


import java.util.Iterator;

public interface IList extends Iterable<String> {

    /**
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * @param e element to be appended to this list
     * @return {@code true} if element was successfully added to list, false otherwise
     */
    boolean add(String e);

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position
     * (if any) and any subsequent elements to the right (adds one to their
     * indices).
     *
     * @param e element to be appended to this list
     * @return {@code true} if element was successfully added to list, false otherwise
     */
    void add(int index, String e);

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list or null if object at given index doesn't exist
     */
    String get(int index);

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    int size();

    /**
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list contains no elements
     */
    boolean isEmpty();

    /**
     * Remove element at specified position.
     *
     * @param index of element to remove
     * @return removed element if it exists null otherwise
     */
    String remove(int index);

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * @return Returns an iterator over the elements in this list in proper sequence.
     */
    Iterator<String> iterator();
}
