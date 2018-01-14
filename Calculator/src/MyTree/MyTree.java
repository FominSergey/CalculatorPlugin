package MyTree;

import java.util.ArrayList;

public class MyTree {

    public static void main(String[] args) {
        Node<Integer> tree = new Node<>(5);
        Node<Integer> child1 = new Node<>(7);
        Node<Integer> child2 = new Node<>(3);
        Node<Integer> child11 = new Node<>(7);
        Node<Integer> child12 = new Node<>(6);
        Node<Integer> child21 = new Node<>(7);
        Node<Integer> child22 = new Node<>(1);
        Node<Integer> child23 = new Node<>(9);
        child1.add(child11);
        child1.add(child12);
        child2.add(child21);
        child2.add(child22);
        child2.add(child23);
        tree.add(child1);
        tree.add(child2);
    }
}