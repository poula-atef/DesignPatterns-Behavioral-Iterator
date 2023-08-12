package com.mycode.designpatternsbehavioraliterator;

import com.mycode.designpatternsbehavioraliterator.iterator.Iterator;
import com.mycode.designpatternsbehavioraliterator.tree.Node;
import com.mycode.designpatternsbehavioraliterator.tree.TreeNode;

public class DesignPatternsBehavioralIteratorApplication {

    public static void main(String[] args) {
        Node<Integer> one = new TreeNode<>(1);
        Node<Integer> two = new TreeNode<>(2);
        Node<Integer> three = new TreeNode<>(3);
        Node<Integer> four = new TreeNode<>(4);
        Node<Integer> five = new TreeNode<>(5);
        Node<Integer> six = new TreeNode<>(6);

        two.addNeighbour(five);
        two.addNeighbour(three);
        four.addNeighbour(six);
        one.addNeighbour(four);
        one.addNeighbour(two);

        System.out.println("Printing Value Using BFS Iterator:");
        Iterator<Integer> bfsIterator = one.createBFSIterator();
        while (bfsIterator.hasNext()) {
            System.out.println(bfsIterator.getNext().getValue());
        }

        one.setVisited(false);
        two.setVisited(false);
        three.setVisited(false);
        four.setVisited(false);
        five.setVisited(false);
        six.setVisited(false);

        System.out.println("Printing Value Using DFS Iterator:");
        Iterator<Integer> dfsIterator = one.createDFSIterator();
        while (dfsIterator.hasNext()) {
            System.out.println(dfsIterator.getNext().getValue());
        }
    }

}
