package com.janhavi.Graphs;

import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
    int V;
    LinkedList<Integer> [] adjList;

    public TopologicalSort(int v) {
        V = v;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i ++) {
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    public void topSort() {
        boolean visited[] = new boolean[V];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < V; i ++) {
            if(!visited[i]) {
                topSortUtil(adjList, i, visited, st); //modified dfs
            }
        }

        while(!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public void topSortUtil(LinkedList<Integer>[] adjList, int curr, boolean[] visited, Stack<Integer> st) {
        visited[curr] = true;

        for(int i = 0; i < adjList[curr].size(); i ++) {
            int a = adjList[curr].get(i);
            if(!visited[a]) {
                topSortUtil(adjList, a, visited, st);
            }
        }

        st.push(curr);
    }

    public static void main(String[] args) {
        TopologicalSort graph = new TopologicalSort(6);

        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.addEdge(4,0);
        graph.addEdge(4,1);
        graph.addEdge(5,0);
        graph.addEdge(5,2);

        graph.topSort();

    }

}
