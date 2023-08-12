package com.mycode.designpatternsbehavioraliterator.iterator;

import com.mycode.designpatternsbehavioraliterator.tree.Node;

public interface Iterator<T> {
    boolean hasNext();
    Node<T> getNext();
}
