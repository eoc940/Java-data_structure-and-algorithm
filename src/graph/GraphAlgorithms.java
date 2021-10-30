package graph;

import queue.IQueue;
import queue.MyLinkedQueue;
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

    // 위상정렬 큐로 구현
    // 1. 모든 vertex의 indegree 수를 센다
    // 2. 큐에 indegree가 0인 vertex 삽입
    // 3. 큐에서 vertex를 꺼내 연결된(나가는 방향) edge 제거
    // 4. 3번으로 인해 indegree가 0이 된 vertex를 큐에 삽입
    // 5. 큐가 빌 때까지 3-4번 반복
    public static List<Integer> topologicalSortIndegree(IGraph graph) {
        // <vertex, indegree 갯수>
        Map<Integer, Integer> indegreeCounter = graph.getIndegrees();

        List<Integer> result = new LinkedList<>();
        IQueue<Integer> queue = new MyLinkedQueue<>();

        for (int v : graph.getVertexes()) {
            int count = indegreeCounter.getOrDefault(v, 0);
            if (count == 0) {
                queue.offer(v);
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);

            for (int nn : graph.getNodes(node)) {
                if (indegreeCounter.containsKey(nn)) {
                    int count = indegreeCounter.get(nn);
                    if (count - 1 == 0) {
                        queue.offer(nn);
                    }
                    indegreeCounter.put(nn, count - 1);
                }
            }
        }

        return result;
    }

    // 위상정렬 스택으로 구현
    public static List<Integer> topologicalSort(IGraph graph) {
        List<Integer> result = new ArrayList<>();
        IStack<Integer> stack = new MyStack<>();
        Set<Integer> visited = new HashSet<>();

        Set<Integer> vertexes = graph.getVertexes();
        for (Integer vertex : vertexes) {
            if (!visited.contains(vertex)) {
                // dfs
                topologicalSort(graph, vertex, visited, stack);

            }
        }
        while (stack.size() > 0) {
            result.add(stack.pop());
        }
        // result와 graph의 값이 다르다면 사이클이 존재하는 것이다다
        return result;
    }

    private static void topologicalSort(IGraph graph, int vertex, Set<Integer> visited, IStack<Integer> stack) {
        visited.add(vertex);
        List<Integer> nodes = graph.getNodes(vertex);
        for (Integer n : nodes) {
            if (!visited.contains(n)) {
                topologicalSort(graph, n, visited, stack);
            }
        }
        // 역순으로 저장
        stack.push(vertex);
    }

    /**
     * 다익스트라 최단거리 알고리즘
     *
     * @param graph
     * @param src   출발 노드
     * @param dst   도착 노드
     * @return 출발 노드로부터 도착 노드까지의 최단 거리
     */
    public static int dijkstraShortestPath(IGraph graph, int src, int dst) {
        int size = 0;
        // distance 배열을 노드 크기만큼 생성하기 위해 그래프에서 가장 큰 노드의
        // 번호를 얻는 반복문
        for (int n : graph.getVertexes()) {
            if (size < n) {
                size = n + 1;
            }
        }
        // distance 배열을 노드 크기만큼 초기화
        int[] dist = new int[size];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE; // distance 값을 INF 초기화
        }
        dist[src] = 0;
        // 0번 인덱스는 노드번호, 1번 인덱스는 distance
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            return a[1] - b[1];
            // 이렇게 하면 distance를 기준으로 minHeap이 동작하게 된다
        });

        pq.add(new int[]{src, 0});

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int vertex = top[0];
            int distance = top[1];

            if (dist[vertex] < distance) {
                continue;
            }

            for (int node : graph.getNodes(vertex)) {
                if (dist[node] > dist[vertex] + graph.getDistance(vertex, node)) {
                    dist[node] = dist[vertex] + graph.getDistance(vertex, node);
                    pq.add(new int[]{node, dist[node]});

                }
            }
        }

        return dist[dst];
    }
}
