package com.williamgong.structure.graph;

import java.util.Iterator;

public interface IGraph {
    void addEdge(int from, int end, double weight);
    int numNode();
    int numEdge();
    Iterator<Edge> adj(int node);
}
