package graph;

import org.w3c.dom.Node;
import stack.IStack;
import stack.MyStack;

import java.util.*;

public class GraphAlgorithms {

    public static List<Integer> bfs(IGraph graph, int from) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(from);
        visited.add(from);

        while (!queue.isEmpty()) {
            Integer next = queue.poll();
            result.add(next);
            List<Integer> nodes = graph.getNodes(next);
            for (Integer node : nodes) {
                if (!visited.contains(node)) {
                    queue.add(node);
                    visited.add(node);
                }
            }
        }

        return result;
    }

    public static List<Integer> dfs(IGraph graph, int from) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        // dfs를 위한 stack
        IStack<Integer> stack = new MyStack<>();

        stack.push(from);
        visited.add(from);

        while (stack.size() > 0) {
            Integer next = stack.pop();
            result.add(next);

            for (Integer node : graph.getNodes(next)) {
                if (!visited.contains(node)) {
                    stack.push(node);
                    visited.add(node);
                }
            }
        }
        return result;
    }
}
