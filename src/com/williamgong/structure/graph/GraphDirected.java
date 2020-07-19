package com.williamgong.structure.graph;

import java.util.ArrayList;
import java.util.Iterator;

public class GraphDirected implements IGraph {
    private int size;
    //counter of edges
    private int coEdge;
    private ArrayList<Edge>[] graph;

    public GraphDirected(int size) {
        this.size = size;
        this.graph = (ArrayList<Edge>[]) new ArrayList[size];
    }

    @Override
    public void addEdge(int from, int to, double weight) {
        Edge edge = new Edge(from, to, weight);
        this.graph[from].add(edge);
    }

    @Override
    public int numNode() {
        return this.size;
    }

    @Override
    public int numEdge() {
        return coEdge;
    }

    @Override
    public Iterator<Edge> adj(int node) {
        return this.graph[node].iterator();
    }

}
