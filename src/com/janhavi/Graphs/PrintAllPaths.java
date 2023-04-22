package com.janhavi.Graphs;

import java.util.LinkedList;

public class PrintAllPaths {
    int V;
    LinkedList<Integer> [] adjList;

    public PrintAllPaths(int v) {
        V = v;
        adjList = new LinkedList[V];
        for(int i = 0; i < V; i ++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    public void printAllPath(int src, int dest, String path) {
        if(src == dest) {
            System.out.println(path + dest);
            return;
        }

        for(int i = 0; i < adjList[src].size(); i ++) {
            int a = adjList[src].get(i);
            printAllPath(a, dest, path + src);
        }

    }

    public static void main(String[] args) {
        PrintAllPaths graph = new PrintAllPaths(6);
        graph.addEdge(0,3);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.addEdge(4,0);
        graph.addEdge(4,1);
        graph.addEdge(5,0);
        graph.addEdge(5,2);

        graph.printAllPath(5,1,"");
    }
}
