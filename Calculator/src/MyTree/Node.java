package MyTree;

import java.util.ArrayList;

class Node<T> {
    T val;
    private ArrayList<Node<T>> children;
    Node(T val){
        this.val = val;
        children = new ArrayList<>();
    }
    public void add(Node<T> child){
        children.add(child);
    }
}
