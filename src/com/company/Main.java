package com.company;
import java.io.*;
import java.util.*;
public class Main {
        public static void main(String args[])
        {
            Graph graph = new Graph(10);

//            graph.addEdge(0,1);
//            graph.addEdge(0,3);
//            graph.addEdge(1,2);
//            graph.addEdge(1,7);
//            graph.addEdge(1,4);
//            graph.addEdge(1,6);
//            graph.addEdge(2,9);
//            graph.addEdge(2,8);
//            graph.addEdge(3,5);
//            graph.addEdge(4,7);
//            graph.addEdge(4,5);
            graph.addEdge(0,1);
            graph.addEdge(0,4);
            graph.addEdge(1,5);
            graph.addEdge(1,3);
            graph.addEdge(5,6);
            graph.addEdge(5,7);
            graph.addEdge(3,8);
            graph.addEdge(4,8);
            graph.addEdge(4,9);

           System.out.println("Deapth first search "+
                    "(starting from vertex 0)");
            graph.depthFirstSearch(0);

        }

// This code is contributed by Aakash Hasija
}
