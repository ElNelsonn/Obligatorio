package uy.edu.um.prog2.adt.Queue;

import uy.edu.um.prog2.adt.List.Node;
import uy.edu.um.prog2.adt.exceptions.EmptyQueueException;


public class MyQueueImpl<T> implements MyQueue<T> {
    private Node<T> first;
    private Node<T> last;
    private int length = 0;

    public MyQueueImpl() {
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (this.first == null) {
            first = newNode;
        } else {
            last.setNextNode(newNode);
        }
        last = newNode;
        length++;
    }

    public T dequeue() throws EmptyQueueException {
        if (this.first != null) {
            T value = this.first.getValue();
            this.first = this.first.getNextNode();
            this.length--;
            return value;
        } else {
            throw new EmptyQueueException();
        }
    }

    public boolean contains(T value) {
        if (this.first == null) {
            return false;
        } else {
            Node<T> auxNode = this.first;
            while ((auxNode != null) && !(auxNode.getValue().equals(value))) {
                auxNode = auxNode.getNextNode();
            }
            return (auxNode != null);
        }
    }


    public boolean isEmpty() {
        return (this.first == null);
    }

    public int size(){
        return length;
    }

    public T first() {
        return this.first.getValue();
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
