package com.robsonf;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    private Stack<Vertex> stack;

    public DepthFirstSearch() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> vertexList) {
        for(Vertex v : vertexList) {
            if(!v.isVisited()) {
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }

    private void dfsHelper(Vertex rootVertex) {
        stack.add(rootVertex);
        rootVertex.setVisited(true);
        while(!stack.isEmpty()) {
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex);
            for (Vertex v : actualVertex.getNeighbors()) {
                if(!v.isVisited()) {
                    v.setVisited(true);
                    stack.add(v);
                }
            }
        }
    }
}
