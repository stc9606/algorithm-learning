package com.algorithm.practice.graph;

import java.util.*;

public class BfsSearch {

    public static void main(String[] args) {
        Map<String, ArrayList<String>> graph = new HashMap<>();
        graph.put("A", new ArrayList<>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<>(Arrays.asList("C", "D")));
        graph.put("C", new ArrayList<>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<>(Arrays.asList("D")));
        graph.put("F", new ArrayList<>(Arrays.asList("D")));
        graph.put("G", new ArrayList<>(Arrays.asList("C")));
        graph.put("H", new ArrayList<>(Arrays.asList("C")));
        graph.put("I", new ArrayList<>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<>(Arrays.asList("I")));

        BfsSearch bfsSearch = new BfsSearch();
        List<String> result = bfsSearch.bfsFunc(graph, "A");
        System.out.println(result);
    }

    public List<String> bfsFunc(Map<String, ArrayList<String>> graph, String startNode) {
        List<String> visited = new ArrayList<String>();
        List<String> needVisit = new ArrayList<String>();

        needVisit.add(startNode);

        while (needVisit.size() > 0) {
            String node = needVisit.remove(0);

            if (!visited.contains(node)) {
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }

        return visited;
    }


}
