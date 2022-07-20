package dataStructure;

import java.util.ArrayList;

/*
Time Complexities in case of Adjacency Matrix :
Traversal :(By BFS or DFS) O(V^2)
Space : O(V^2)

Time Complexities in case of Adjacency List :
Traversal :(By BFS or DFS) O(V + E)
Space : O(V+E)

 */
public class Graph {
    /*
    Graph is a data structure that consists of following two components:
A finite set of vertices also called as nodes.
A finite set of ordered pair of the form (u, v) called as edge. The pair is ordered because (u, v) is not same as (v, u) in case of directed graph(di-graph). The pair of form (u, v) indicates that there is an edge from vertex u to vertex v. The edges may contain weight/value/cost.
V -> Number of Vertices.
E -> Number of Edges.


     */

    // Driver Code
    public static void main(String[] args)
    {
        // Creating a graph with 5 vertices
        int V = 5;
        ArrayList<ArrayList<Integer>> adj
                = new ArrayList<ArrayList<Integer> >(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        // Adding edges one by one
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        printGraph(adj);
    }

    static void addEdge(ArrayList<ArrayList<Integer> > adj,
                        int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex"
                    + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "
                        + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

}
