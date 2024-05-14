package uy.edu.um.adt.List;

import uy.edu.um.adt.exceptions.*;

public interface MyList<T> {

    void add(T value);

    T get(int position) throws EmptyListException, OutOfRangeException;

    boolean contains(T value);

    void remove(T value) throws ElementNotFound, EmptyListException;

    int size();


}
