package uy.edu.um.prog2.adt.CloseHashArray;

import uy.edu.um.prog2.adt.CloseHashArray.CloseHashNode;

public class CloseHashImpl<K,V> implements MyCloseHash<K, V>{
    private CloseHashNode<K,V>[] array;
    private int innerArraylength ;
    private int sizeArray;


    public CloseHashImpl(int sizeArray,int innerArraylength) {
        this.array = (CloseHashNode<K, V>[]) new CloseHashNode<>()[sizeArray];
        this.innerArraylength = innerArraylength;
        this.sizeArray = sizeArray;
    }
}
