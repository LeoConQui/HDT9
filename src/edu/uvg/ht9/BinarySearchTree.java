package edu.uvg.ht9;

public class BinarySearchTree<T>implements IEstructuraArbol<T> {
   
    // atributos
    private BinarySearchTree<T> binarysearchtree = new BinarySearchTree<T>();

    @Override
    public void add(T value) {
        binarysearchtree.add(value);
    }

    @Override
    public T get(T key) {
        return binarysearchtree.get(key);
    }

    @Override
    public T remove(T key) {
        return binarysearchtree.remove(key);
    }

    @Override
    public int count() {
        return binarysearchtree.count();
    }

    @Override
    public boolean isEmpty() {
        return binarysearchtree.isEmpty();
    } 
    
}
