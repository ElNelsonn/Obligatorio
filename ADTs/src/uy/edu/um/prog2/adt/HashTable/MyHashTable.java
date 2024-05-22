package uy.edu.um.prog2.adt.HashTable;

import uy.edu.um.prog2.adt.exceptions.ElementAlreadyInHash;
import uy.edu.um.prog2.adt.exceptions.ElementNotFound;

public interface MyHashTable<K,V> {

    public void put(K key, V value) throws ElementAlreadyInHash;

    public int contains(K key);

    public V get(K key) throws ElementNotFound;

    public void remove(K key) throws ElementNotFound;

}
