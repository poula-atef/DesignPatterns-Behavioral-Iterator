package com.mycode.designpatternsbehavioraliterator.tree;

import com.mycode.designpatternsbehavioraliterator.iterator.Iterator;

import java.util.List;

public interface Node<T> {

    List<Node<T>> getNeighbours();

    void addNeighbour(Node<T> neighbour);

    T getValue();

    void setValue(T value);

    boolean isVisited();

    void setVisited(boolean visited);

    Iterator<T> createBFSIterator();

    Iterator<T> createDFSIterator();
}
