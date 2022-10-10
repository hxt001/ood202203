package com.pivottech;

import java.util.ArrayList;
import java.util.List;

public class Node {
//    public Node left;
//    public Node right;
    public List<Node> neighbors;
    int val;
    public Node(int i) {
        this.val = i;
        neighbors = new ArrayList<>();
    }

    public void addNeighbors(Node n) {
        this.neighbors.add(n);
        n.neighbors.add(this);
    }
}


