package com.janhavi.Graphs;

import java.sql.Array;
import java.util.LinkedList;
import java.util.Queue;
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

    public void topSortUsingDFS() {
        boolean visited[] = new boolean[V];
        Stack<Integer> st = new Stack<>();
        System.out.println(adjList.length);

        for(int i = 0; i < V; i ++) {
            if(!visited[i]) {
                topSortUsingDFSUtil(adjList, i, visited, st); //modified dfs
            }
        }

        while(!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public void topSortUsingDFSUtil(LinkedList<Integer>[] adjList, int curr, boolean[] visited, Stack<Integer> st) {
        visited[curr] = true;

        for(int i = 0; i < adjList[curr].size(); i ++) {
            int a = adjList[curr].get(i);
            if(!visited[a]) {
                topSortUsingDFSUtil(adjList, a, visited, st);
            }
        }

        st.push(curr);
    }

    public void calIndegree(LinkedList<Integer> [] adjList, int[] indegree) {
        for(int i = 0; i < adjList.length; i ++) {
            int v = i;
            for(int j = 0; j < adjList[v].size(); j ++) {
                int a = adjList[v].get(j);
                indegree[a] ++;
            }
        }
    }
    public void topSortUsingBFs() {
        int indegree[] = new int[adjList.length];
        calIndegree(adjList, indegree);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i <indegree.length; i ++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }
        
        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (int i = 0; i < adjList[curr].size(); i ++) {
                int a = adjList[curr].get(i);
                indegree[a] --;
                if(indegree[a] == 0) {
                    q.add(a);
                }
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        TopologicalSort graph = new TopologicalSort(6);

        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.addEdge(4,0);
        graph.addEdge(4,1);
        graph.addEdge(5,0);
        graph.addEdge(5,2);

        graph.topSortUsingDFS();
        System.out.println();
        graph.topSortUsingBFs();

    }

}
