package com.williamgong.structure.graph;

import java.util.ArrayList;
import java.util.Iterator;

public class Graph implements IGraph {
    private int size;
    private ArrayList<Edge>[] graph;
    //counter of edges
    private int coEdge;

    public Graph(int size) {
        this.size = size;
        this.graph = (ArrayList<Edge>[]) new ArrayList[size];
    }

    @Override
    public void addEdge(int nodeOne, int nodeTwo, double weight) {
        Edge edge = new Edge(nodeOne, nodeTwo, weight);
        this.graph[nodeOne].add(edge);
        edge = new Edge(nodeTwo, nodeOne, weight);
        this.graph[nodeTwo].add(edge);
        coEdge++;
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
