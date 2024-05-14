package uy.edu.um.adt.Stack;

import uy.edu.um.adt.exceptions.EmptyStackException;

public interface MyStack<T> {

    void push(T value);

    T peek() throws EmptyStackException;

    int size();

    T pop() throws EmptyStackException;

    boolean contains(T value);






}
