package com.mycode.designpatternsbehavioraliterator.iterator;

import com.mycode.designpatternsbehavioraliterator.tree.Node;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFSIterator<T> implements Iterator<T> {
    private Node<T> startNode;
    private Queue<Node<T>> queue;

    public BFSIterator(Node<T> startNode) {
        this.startNode = startNode;
        this.queue = new ArrayDeque<>();
        queue.add(startNode);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Node<T> getNext() {
        if (!hasNext())
            return null;

        Node<T> current = queue.poll();
        if (!current.isVisited()) {
            current.setVisited(true);
            queue.addAll(current.getNeighbours());
            return current;
        }
        return getNext();
    }
}
