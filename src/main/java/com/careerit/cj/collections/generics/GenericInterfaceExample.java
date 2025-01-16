package com.careerit.cj.collections.generics;

interface Pair<K,V>{
    K getKey();
    V getValue();
}

class KeyValuePair<K,V> implements Pair<K,V>{

    private K key;
    private V value;

    public KeyValuePair(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

public class GenericInterfaceExample {

    public static void main(String[] args) {

        Pair<Integer,String> pair = new KeyValuePair<>(1002,"Some Value");

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
