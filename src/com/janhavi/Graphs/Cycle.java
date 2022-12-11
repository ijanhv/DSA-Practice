package com.janhavi.Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Cycle {
    int V;
    LinkedList<Integer> adjList[];

    public Cycle(int v) {
        this.V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adjList[v].add(w);
        adjList[w].add(v);
    }

    boolean detectCycleUtil(int curr, boolean[] visited, int parent) {
        visited[curr] = true;

        for(int i = 0; i < adjList[curr].size(); i ++) {
            int a = adjList[curr].get(i);
            if (!visited[a]) {
                if (detectCycleUtil(a, visited, curr)) {
                    return true;
                }
            } else if(parent != a) {
                return true;
            }

        }


        return false;

    }

        boolean detectCycle () {
            boolean visited[] = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    if (detectCycleUtil(i, visited, -1))
                        return true;
                }
            }
            return false;

        }

        public static void main (String[]args){
            Cycle g1 = new Cycle(5);
            g1.addEdge(1, 0);
            g1.addEdge(0, 2);
            g1.addEdge(2, 1);
            g1.addEdge(0, 3);
            g1.addEdge(3, 4);
            if(g1.detectCycle())
                System.out.println("Cycle present");
            else
                System.out.println("No cycle");

            Cycle g2 = new Cycle(3);
            g2.addEdge(0, 1);
            g2.addEdge(1, 2);

            if(g2.detectCycle())
                System.out.println("Cycle present");
            else
                System.out.println("No cycle");
        }
    }