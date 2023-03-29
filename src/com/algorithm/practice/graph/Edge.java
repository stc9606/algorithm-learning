package com.algorithm.practice.graph;

import java.util.Arrays;

public class Edge implements Comparable<Edge> {

    public static void main(String[] args) {
        Edge edge1 = new Edge(10, "A");
        Edge edge2 = new Edge(12, "A");
        Edge edge3 = new Edge(11, "A");
        Edge[] edges = new Edge[] {edge1, edge2, edge3};
        Arrays.sort(edges);
        for (int index = 0; index < edges.length; index++) {
            System.out.println(edges[index].distance);
        }
    }

    public Integer distance;
    public String vertex;

    public Edge(Integer distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public int compareTo(Edge o) {
        return this.distance - o.distance;
    }
}
