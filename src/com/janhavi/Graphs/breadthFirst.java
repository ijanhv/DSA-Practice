package com.janhavi.Graphs;

import java.util.LinkedList;

class breadthFirst {

    private int V; // No. of vertices
    private LinkedList<Integer> adjList[]; // Adjacency List

    //Constructor
    breadthFirst(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

        // Function to add edge
        void addEdge(int v, int w) {
            adjList[v].add(w);
        }

        //Prints BFS from source s
        void printBFS(int s) {
            //Mark all non-visited vertices as false
            boolean visited[] = new boolean[V];
            LinkedList<Integer> queue = new LinkedList<Integer>();

            //Mark the current node as true
            visited[s] = true;
            queue.add(s);

            while(!queue.isEmpty()) {
                //Deque a vertex from queue and print it
                s = queue.poll(); //Removing top element
                System.out.println(s + " "); //Printing top element

                //Now get all adjacent vertices of dequeued vertex s i.e. current vertex
                //If the Vertex has not been visited mark it as true and enqueue it
                for(int i = 0; i < adjList[s].size(); i ++) {
                    int a = adjList[s].get(i);
                    if(!visited[a]) { // if a is not visited
                        visited[a] = true; //Marking it as true
                        queue.add(a); // adding a to the queue
                    }
                }

            }
        }

    //Driver method
    public static void main(String args[]) {
        breadthFirst graph = new breadthFirst(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);

        System.out.println("Following is BFS "+
                "(starting from vertex 0)");

        graph.printBFS(0);
    }

}
