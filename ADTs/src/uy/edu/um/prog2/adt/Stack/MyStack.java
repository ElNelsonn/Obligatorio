package uy.edu.um.prog2.adt.Stack;

import uy.edu.um.prog2.adt.exceptions.EmptyStackException;

public interface MyStack<T> {

    void push(T value);

    T peek() throws EmptyStackException;

    int size();

    T pop() throws EmptyStackException;

    boolean contains(T value);






}
