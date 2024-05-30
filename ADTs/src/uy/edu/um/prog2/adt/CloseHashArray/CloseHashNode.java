package uy.edu.um.prog2.adt.CloseHashArray;

import uy.edu.um.prog2.adt.HashTable.HashNode;

public class CloseHashNode<K,V> {
    private K key;
    private V[] array;

    CloseHashNode(K key,int size){
        this.key = key;
        this.array = (V[]) new V[size];
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }

    public V[]getValue() {
        return array;
    }

    public void setValue(V[] newArray) {
        this.array = newArray;
    }

}
