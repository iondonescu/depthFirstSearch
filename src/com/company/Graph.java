package com.company;
import java.util.*;
class Graph {
    private int vertex;   // numarul de varfuri
    private LinkedList<Integer> edges[];// sir de liste inlantuite

    // Constructor
    Graph(int v) {
        vertex = v;
        edges = new LinkedList[v]; // pentru fiecare varf creaza o lista inlantuita
        for (int i = 0; i < v; ++i) {
            edges[i] = new LinkedList();
        }
    }

    //adauga muchie grafului
    void addEdge(int v, int edge) {
        edges[v].add(edge);// pentru varful v adauga muchie
    }

    // markeaza nodul ca vizitat si afiseaza-l
    void depthFirstSearchMark(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> iterator = edges[v].listIterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (!visited[n])
                depthFirstSearchMark(n, visited);
        }
    }

    // The function to do DFS traversal. It uses recursive depthFirstSearchMark()
    void depthFirstSearch(int v) {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[vertex];

        // Call the recursive helper function to print DFS traversal
        depthFirstSearchMark(v, visited);
    }
}