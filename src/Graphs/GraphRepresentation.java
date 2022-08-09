/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 08-08-2022
 *   Time: 01:12
 *   File: GraphRepresentation.java
 */

package Graphs;

import SinglyLinkedList.LinkedListNode;

import java.util.LinkedList;
import java.util.Scanner;



public class GraphRepresentation {

    private LinkedList<Integer>[] adj;

    public GraphRepresentation(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();

        }
    }

    public void insertEdge(int s, int d) {
        adj[s].add(d);
        adj[d].add(s);
        System.out.print(adj[d]);
        System.out.println(adj[s]);

    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of vertices and edges");
        int v = sc.nextInt(); //no of vertices
        int e = sc.nextInt(); //no of edges
        GraphRepresentation gr = new GraphRepresentation(v);
        System.out.println("enter number of edges");

        for (int i = 0; i < e; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            gr.insertEdge(s, d);

        }

    }
}
