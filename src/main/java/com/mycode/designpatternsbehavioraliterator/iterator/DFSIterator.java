package com.mycode.designpatternsbehavioraliterator.iterator;

import com.mycode.designpatternsbehavioraliterator.tree.Node;

import java.util.Stack;

public class DFSIterator<T> implements Iterator<T> {
    private Node<T> startNode;
    private Stack<Node<T>> stack;

    public DFSIterator(Node<T> startNode) {
        this.startNode = startNode;
        this.stack = new Stack<>();
        stack.add(startNode);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Node<T> getNext() {
        if (!hasNext())
            return null;

        Node<T> current = stack.pop();
        if (!current.isVisited()) {
            current.setVisited(true);
            stack.addAll(current.getNeighbours());
            return current;
        }
        return getNext();
    }
}
