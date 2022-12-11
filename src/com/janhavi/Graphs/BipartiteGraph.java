package com.janhavi.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    int V;
    LinkedList<Integer> [] adjList;

    public BipartiteGraph(int v) {
        V = v;
        adjList = new LinkedList[V];
        for(int i = 0; i < v; i ++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
        adjList[w].add(v);
    }

    public boolean isBipartite() {
        int color[] = new int[V];
        for(int i = 0; i < V; i ++) {
            color[i] = -1;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < V; i ++) {
            if(color[i] == -1) { //BFS only if node is uncolored
                queue.add(i);
                color[i] = 0; //yellow
                while(!queue.isEmpty()) {
                    int current = queue.remove();
                    for(int j = 0; j < adjList[current].size(); j ++) {
                        int a = adjList[current].get(j); // neighbor
                        if(color[a] == -1) {
                            int nextColor = color[current] == 0 ? 1 : 0;
                            color[a] = nextColor;
                            queue.add(a);
                        } else if(color[a] == color[current]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BipartiteGraph bg = new BipartiteGraph(5);

//        bg.addEdge(0,1);
//        bg.addEdge(0,2);
//        bg.addEdge(1,0);
//        bg.addEdge(1,3);
//        bg.addEdge(2,0);
//        bg.addEdge(2,4);
//        bg.addEdge(3,1);
//        bg.addEdge(3,4);
//        bg.addEdge(4,2);
//        bg.addEdge(4,3);

        bg.addEdge(0,1);
        bg.addEdge(0,3);
        bg.addEdge(1,0);
        bg.addEdge(1,2);
        bg.addEdge(2,1);
        bg.addEdge(2,3);
        bg.addEdge(3,0);
        bg.addEdge(3,2);


        if(bg.isBipartite())
            System.out.print("It is bipartite");
        else
            System.out.print("Not bipartite");



    }
}
