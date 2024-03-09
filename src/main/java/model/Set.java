package model;

import java.util.ArrayList;
import java.util.List;

public class Set<T> implements InterfaceSetC<T> {
    private List<T> elements;
    public Set() {
        this.elements = new ArrayList<>();
    }


    public void add(T element) {
        if (!contains(element)) {
            elements.add(element);
        }
    }

    public void remove(T element) {
        if (contains(element)) {
            elements.remove(element);
        }
    }

    public boolean contains(T element) {
        for (T item : elements) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public Set<T> union(Set<T> otherSet) {
        Set<T> resultSet = new Set<>();
        for (T element : this.elements) {
            resultSet.add(element);
        }
        for (T element : otherSet.elements) {
            resultSet.add(element);
        }
        return resultSet;
    }

    public Set<T> intersection(Set<T> otherSet) {
        Set<T> resultSet = new Set<>();
        for (T element : this.elements) {
            if (otherSet.contains(element)) {
                resultSet.add(element);
            }
        }
        return resultSet;
    }

    public Set<T> difference(Set<T> otherSet) {
        Set<T> resultSet = new Set<>();
        for (T element : this.elements) {
            if (!otherSet.contains(element)) {
                resultSet.add(element);
            }
        }
        return resultSet;
    }

    public int size() { //biem
        return elements.size();
    }

    public Set<T> composicion(Set<T> conjunto1, Set<T> conjunto2) {
        Set<T> resultado = conjunto1.union(conjunto2);//xd
        return resultado;
    }

    public boolean isEmpty() {

        return elements.isEmpty();
    }

    public int mostSize(Set<T> conjunto1, Set<T> conjunto2){
        if(conjunto1.size() > conjunto2.size()){
            return conjunto1.size();
        }
        else{
            return conjunto2.size();
        }
    }

    public int lessSize(Set<T> conjunto1, Set<T> conjunto2){
        if(conjunto1.size() < conjunto2.size()){
            return conjunto1.size();
        }
        else{
            return conjunto2.size();
        }
    }


}


