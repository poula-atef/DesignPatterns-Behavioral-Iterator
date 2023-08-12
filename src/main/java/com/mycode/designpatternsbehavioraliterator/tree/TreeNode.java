package com.mycode.designpatternsbehavioraliterator.tree;

import com.mycode.designpatternsbehavioraliterator.iterator.BFSIterator;
import com.mycode.designpatternsbehavioraliterator.iterator.DFSIterator;
import com.mycode.designpatternsbehavioraliterator.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> implements Node<T> {
    private List<Node<T>> neighbours;
    private T value;
    private boolean visited;

    public TreeNode(T value) {
        this.value = value;
        neighbours = new ArrayList<>();
    }

    @Override
    public List<Node<T>> getNeighbours() {
        return neighbours;
    }

    @Override
    public void addNeighbour(Node<T> neighbour) {
        neighbours.add(neighbour);
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean isVisited() {
        return visited;
    }

    @Override
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public Iterator<T> createBFSIterator() {
        return new BFSIterator<T>(this);
    }

    @Override
    public Iterator<T> createDFSIterator() {
        return new DFSIterator<T>(this);
    }
}
