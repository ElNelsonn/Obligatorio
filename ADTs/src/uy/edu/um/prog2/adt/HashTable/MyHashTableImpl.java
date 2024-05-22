package uy.edu.um.prog2.adt.HashTable;

public class MyHashTableImpl<K,V> implements MyHashTable<K,V> {
    private HashNode<K, V>[] array;
    private int length = 0;
    private int sizeArray;

    public MyHashTableImpl(int size) {
        this.array = (HashNode<K, V>[]) new HashNode[size];
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        this.sizeArray = size;
    }

    private int index(K key){
        return Math.abs(key.hashCode() % sizeArray);   //Para que el valor sea positivo va el math.abs
    }

    private void duplicate(HashNode<K,V>[] oldArray){
        this.sizeArray =oldArray.length*2;
        HashNode<K,V>[] newHashTable = (HashNode<K,V>[]) new HashNode[sizeArray];
        this.array = newHashTable;
        this.length = 0;
        for(HashNode<K,V> node : oldArray) {    // Hay que probar si es <= o < estricto
            if (node != null) {
                put(node.getKey(), node.getValue());
            }
        }
    }

//    public void put(K key, V value) {
//        if (contains(key)!=-1) {
//            HashNode<K, V> newNode = new HashNode<>(key, value);
//            int index = index(key);
//            while (array[index] != null) {
//                index++;
//            }
//            if (index <= sizeArray) { //no se si va este igual xq como arranca en pos 0
//                array[index] = newNode;
//                length++;
//            } else {
//                Duplicate(this.array);
//            }
//        }
//    }

    public void put(K key, V value) {
        if (contains(key) != -1) {
            System.out.println("Salu del contains sin errores");
            int index = index(key);
            while ((array[index] != null) && (!array[index].getKey().equals(key))) {
                //System.out.println("estoy while");
                index++;
            }

            if (array[index] == null) {
                length++;
            }
            array[index] = new HashNode<>(key, value);

            if ((double) length / sizeArray >= 0.75) {
                duplicate(this.array);
            }
        }
    }

//    public int contains(K key){
//        int index = index(key);
//        if ((array[index]!=null)&&(array[index].getKey()==key)){
//            return index;
//        } else {
//            //System.out.println("previo while contains");
//            while((index<array.length)&&(array[index]!=null)&&(array[index].getKey()!=key)){  // Menor o menor o igual
//                //System.out.println("while contains");
//                index++;
//            }
//            if (array[index].getKey()==key){
//                return index;
//            }
//        }
//        return -1;
//    }


    public int contains(K key) {
        int index = index(key);
        int startIndex = index;
        if (array[index] != null && array[index].getKey().equals(key)) {
            return index;
        }
        index = (index + 1) % sizeArray;
        while (index != startIndex && array[index] != null) {
            if (array[index].getKey().equals(key)) {
                return index;
            }
            index = (index + 1) % sizeArray;
        }
        return -1;
    }


    public void remove(K key){
        if (contains(key)!=-1) {
            array[index(key)] = null;
            length--;
        } else {
            //No existe el elemento
        }
    }

    public HashNode<K, V>[] getArray() {
        return array;
    }

    public void setArray(HashNode<K, V>[] array) {
        this.array = array;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
