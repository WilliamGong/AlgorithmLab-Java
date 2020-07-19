package com.williamgong.algorithm.graph;


import com.williamgong.structure.graph.Edge;
import com.williamgong.structure.graph.IGraph;

import java.util.Iterator;

public class Search {
    private IGraph graph;
    private boolean[] marked;

    public Search(IGraph G) {
        this.graph = G;
        marked = new boolean[this.graph.numNode()];
    }
    public void dfs(int start) {
        marked[start] = true;
        Iterator<Edge> current = this.graph.adj(start);
        while(current.hasNext()) {
            int temp = current.next().getTo();
            if(!marked[temp]) {
                dfs(temp);
            }
        }
    }
    public void bfs() {

    }
}
