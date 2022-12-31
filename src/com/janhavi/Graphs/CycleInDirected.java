package com.janhavi.Graphs;

import java.util.LinkedList;

public class CycleInDirected {
    int V;
    LinkedList<Integer> [] adjList;

    public CycleInDirected(int v) {
        V = v;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    public boolean isCyclic() {
        boolean [] visited = new boolean[V];
        boolean [] recStack = new boolean[V];

        for (int i = 0; i < V; i ++) {
            if(isCyclicUtil(i, visited, recStack)) return true;
        }
        return false;
    }

    private boolean isCyclicUtil(int curr, boolean[] visited, boolean[] recStack) {
        visited[curr] = true;
        recStack[curr] = true;

        for(int i = 0; i < adjList[curr].size(); i ++) {
            int a = adjList[curr].get(i);
            if(!visited[a]) {
                if(isCyclicUtil(a, visited, recStack))
                    return true;
            } else if(recStack[a]) {
                return true;
            }
        }
        recStack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        CycleInDirected graph = new CycleInDirected(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

//      graph.addEdge(2, 0);
//      graph.addEdge(3, 3);

//      graph.addEdge(0,2);
//      graph.addEdge(1,0);
//      graph.addEdge(2,3);
//      graph.addEdge(3,0);


        if(graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't "
                    + "contain cycle");
    }
    }


