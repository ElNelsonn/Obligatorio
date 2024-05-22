package uy.edu.um.prog2.adt.HashTable;

public interface MyHashTable<K,V> {

    public void put(K key, V value);
    public int contains(K key);
    public void remove(K key);

}
