package graph;

import org.w3c.dom.Node;

import java.util.*;

public class AdjacentListGraph implements IGraph {

    private List<List<Node>> graph;
    private Set<Integer> vertexes;
    private Map<Integer, Integer> indegrees;

    public AdjacentListGraph(int numOfVertex) {
        this.vertexes = new HashSet<>();
        this.indegrees = new HashMap<>();
        this.graph = new ArrayList<>(numOfVertex);
        for (int i = 0; i < numOfVertex; i++) {
            this.graph.add(new ArrayList<>());
        }
    }

    @Override
    public void add(int from, int to) {
        vertexes.add(from);
        vertexes.add(to);

        int count = indegrees.getOrDefault(to, 0);
        indegrees.put(to, count + 1);

        // 0 -> [1,2,3]
        // 1 -> [2]
        // 2 -> [0,1]
        // 3 -> []
        List<Node> neighbors = this.graph.get(from);
        neighbors.add(new Node(from, to));
    }

    @Override
    public void add(int from, int to, Integer distance) {
        vertexes.add(from);
        vertexes.add(to);

        int count = indegrees.getOrDefault(to, 0);
        indegrees.put(to, count + 1);

        // 0 -> [1,2,3]
        // 1 -> [2]
        // 2 -> [0,1]
        // 3 -> []
        List<Node> neighbors = this.graph.get(from);
        neighbors.add(new Node(from, to, distance));

    }

    @Override
    public Integer getDistance(int from, int to) {
        for (Node node : this.graph.get(from)) {
            if (node.to.equals(to)) {
                return node.weight;
            }
        }
        return null;
    }

    @Override
    public Map<Integer, Integer> getIndegrees() {
        return this.indegrees;
    }

    @Override
    public Set<Integer> getVertexes() {
        return this.vertexes;
    }

    @Override
    public List<Integer> getNodes(int vertex) {
        List<Integer> nodes = new ArrayList<>();
        for (Node node : this.graph.get(vertex)) {
            nodes.add(node.to);

        }
        return nodes;
    }

    private class Node {
        Integer from;
        Integer to;
        int weight;

        Node(int from, int to) {
            this.from = from;
            this.to = to;
            this.weight = 1;
        }

        Node(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

    }



}
