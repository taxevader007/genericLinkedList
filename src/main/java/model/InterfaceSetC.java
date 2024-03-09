package model;

public interface InterfaceSetC <T> {
    void add(T element);
    void remove(T element);
    boolean contains(T element);
    Set<T> union(Set<T> otherSet);
    Set<T> intersection(Set<T> otherSet);
    Set<T> difference(Set<T> otherSet);










}
