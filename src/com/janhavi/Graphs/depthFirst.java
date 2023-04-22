package com.janhavi.Graphs;

import java.util.LinkedList;

class depthFirst {
    int V;
    LinkedList<Integer> adjList[];

    depthFirst(int v) {
        V = v;
        adjList = new LinkedList[v];
        for(int i = 0; i < v; i ++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    void dfsUtil(int s, boolean visited[]) {
        visited[s] = true;
        System.out.print(s + " ");

        for(int i = 0; i < adjList[s].size(); i ++) {
            int a = adjList[s].get(i);
                if(!visited[a]) {
                    dfsUtil(a, visited);
                }
        }
    }

    void dfs(int s) {
        boolean visited[] = new boolean[V];
        dfsUtil(s, visited);
    }

    public static void main(String args[])
    {
        depthFirst g = new depthFirst(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 3);
        g.addEdge(5, 3);

        System.out.println(
                "Following is Depth First Traversal: ");

        g.dfs(0);
    }
}
